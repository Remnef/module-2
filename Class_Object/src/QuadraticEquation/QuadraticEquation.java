package QuadraticEquation;

public class QuadraticEquation {
    double a,b,c,delta;
    public QuadraticEquation(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant()
    {
        this.delta = b*b-4*a*c;
        return delta;
    }
    public double getRoot1()
    {
        if (this.delta>=0)
        {
            return (-b+Math.sqrt(delta))/2*a;
        }
        else return 0;
    }
    public double getRoot2()
    {
        if (this.delta>=0)
        {
            return (-b-Math.sqrt(delta))/2*a;
        }
        else return 0;
    }

}
