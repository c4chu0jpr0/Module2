import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed= xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(float xSpeed, float ySpeed){
        this.ySpeed=ySpeed;
        this.xSpeed=xSpeed;
    }
    MovablePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        float[] arr= new float[2];
        arr[0]=getxSpeed();
        arr[1]=getySpeed();
        return  arr;
    }
    @Override
    public String toString(){
        return "x= "+ x+ " y= "+ y + " xSpeed= "+ xSpeed+
                " ySpeed= "+ ySpeed
                +" ,Speed= "+ Arrays.toString(getSpeed());
    }
    public MovablePoint move(){
        y+=xSpeed;
        y+=ySpeed;
        return  this;
    }
}
