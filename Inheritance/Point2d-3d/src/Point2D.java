import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;
    Point2D(){}
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] arr= new float[2];
        arr[0]=this.x;
        arr[1]=this.y;
        return arr;
    }
    public String toString(){
        return "x= "+ getX()+
                " y= "+ getY()+
                " Point2d:" + Arrays.toString(getXY());
    }

}
