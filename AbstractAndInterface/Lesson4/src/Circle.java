public class Circle implements Resizeable{
    private double radius;
    private String color;
    private boolean filled;
    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius= radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return 2*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString(){
        return "radius: "+ radius+ " color: "+ color + " and " + (isFilled()?"filled":"not filled")
                +" Area: " +getArea()+ " Perimeter: "+ getPerimeter() ;
    }
    @Override
    public void resize(double percent){
        this.radius *=(percent/100);
    }
}
