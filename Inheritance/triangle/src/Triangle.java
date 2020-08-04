public class Triangle extends Shape{
    double side1;
    double side2;
    double side3;
    private double p;

    Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        p=this.side1+this.side2+this.side3;
        return p;
    }
    public double getArea(){
        double x = (getPerimeter())/2;
        double s = Math.sqrt(x*(x-this.side1)*(x-this.side2)*(x-this.side3));
        return s;
    }

    @Override
    public String toString(){
        return "side1: " +getSide1() + " side2: "+ getSide2() + " side3: "+ getSide3()+ " "+
                 super.toString()  +
                " Area= "+ getArea() + " Perimester= " + getPerimeter();
    }
}
