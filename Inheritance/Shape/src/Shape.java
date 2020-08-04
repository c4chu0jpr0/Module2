import sun.security.provider.SHA;

public class Shape {
    private String color;
    private boolean filled;

    Shape(){
        this.color="Green";
        this.filled= true;
    }
    Shape(String color, Boolean filled){
        this.color=color;
        this.filled= filled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setColor(String color){
        this.color= color;
    }
    public void setFilled(String filled){
        this.filled = false;
    }
    public String toString(){
        return "A Shape with " + getColor() + " and "+ (isFilled()?"filled":"Not Filled");
    }

}
