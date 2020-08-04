public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this.radius=1;
        this.color="Gold";
    }
    public Circle(double radius, String color){
        this.radius= radius;
        this.color= color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void  setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return this.color;
    }
    public void  setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return 2*this.radius*this.radius;
    }

    @Override
    public String toString(){
        return "Radius= "+ radius+ " color= "+ getColor()+
                " Area= "+ getArea();
    }
}
