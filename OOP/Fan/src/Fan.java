public class Fan {
    final int SLOW= 1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed;
    private boolean isOn;
    private String Color;
    private double radius;


    public void setSpeed(int speed){
        this.speed=speed;
    }

    public void setOn(boolean ison){
        isOn=ison;
    }

    public void setRadius(double radius){
        this.radius =radius;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public Fan(){
        this.speed=1;
        this.radius=5;
        this.isOn=false;
        this.Color="blue";
    }
    public String toString(){
        if(this.isOn){
            return "Max Fan: " +this.speed + " radius: "+ this.radius+ " Color: "+ this.Color + " The fan is On";
        }else{
            return "Max Fan: " +this.speed + " radius: "+ this.radius+ " Color: "+ this.Color + " the fan is Off" ;
        }
    }
}
