public class Shape {
    private String color;
    Shape(){
        this.color="blue";
    }
    Shape(String color){
        this.color=color;
    }
    public void setColor(String color){
        this.color= color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Color: " + color;
    }
}
