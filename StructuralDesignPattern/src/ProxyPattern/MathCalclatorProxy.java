package ProxyPattern;

public class MathCalclatorProxy implements Calculator{

    private MathCalculator mathCalclatorProxy;

    public MathCalclatorProxy(){
        this.mathCalclatorProxy = new MathCalculator();
    }

    @Override
    public double add(double first, double second) {
        if(first/2+second/2 >= Double.MAX_VALUE/2){
            throw new RuntimeException("Out of range");
        }
        if(first/2+second/2 <= Double.MIN_VALUE/2){
            throw new RuntimeException("Out of range");
        }
        return mathCalclatorProxy.add(first, second);
    }

    @Override
    public double sub(double first, double second) {
        if(first/2-second/2 >= Double.MAX_VALUE/2){
            throw new RuntimeException("Out of range");
        }
        if(first/2-second/2 <= Double.MIN_VALUE/2){
            throw new RuntimeException("Out of range");
        }
        return mathCalclatorProxy.sub(first, second);
    }

    @Override
    public double mul(double first, double second) {
        double  result = mathCalclatorProxy.mul(first,second);
        if(first !=0 && result/first != second){
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double first, double second) {
        if (second ==0){
            throw new RuntimeException("Can't divide by Zero");
        }
        return mathCalclatorProxy.div(first,second);
    }

    public static void main(String[] args) {
        MathCalclatorProxy proxy = new MathCalclatorProxy();
        double result = proxy.add(2,1);
        System.out.println("1+2= "+result);
        result = proxy.add(2, Double.MAX_VALUE);
        System.out.println("2 + Double.MAX_VALUE = " + result);
//        System.out.println(Double.MAX_VALUE);
    }
}
