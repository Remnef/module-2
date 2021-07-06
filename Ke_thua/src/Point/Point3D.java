package Point;

public class Point3D extends Point2D {
    float z = 0.0f;
    float x = super.x;
    float y = super.y;
    public Point3D(){

    }

    public Point3D(float z){
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {x,y,z};
        return  arr;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D= " +
                "[" + x +
                "," + y +
                "," + z +
                ']';
    }
}
