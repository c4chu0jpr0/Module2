public class Cylinder extends Circle{
    private double height;
    Cylinder(){}
    Cylinder(double height){
        this.height=height;
    }
    Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return this.height*getArea();
    }

    @Override
    public String toString(){
        return "Height= "+ height +
                " radius= "+getRadius()+
                " Volume: "+ getVolume() +
                " Color= "+ getColor();
    }
}
