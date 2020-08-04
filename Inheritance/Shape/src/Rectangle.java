public class Rectangle extends  Shape{
    private double width;
    private double length;
    Rectangle(){}
    Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }

    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }

    @Override
    public String toString(){
        return  "A rectangle with width= " + width +
                " and length= " + length + " color= "+ getColor()+
                " " +(isFilled()?"filled":"Not Filled");
    }
}
