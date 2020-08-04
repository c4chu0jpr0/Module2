import java.util.Arrays;

public class Point {
     float x;
     float y;
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point(){}

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
        float[] arr = new float[2];
        arr[0]=getX();
        arr[1]=getY();
        return arr;
    }
    @Override
    public String toString(){
        return "x= "+ x+ " y= "+ y+ " Point= "+ Arrays.toString(getXY());
    }
}
