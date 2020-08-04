public class Square extends Rectangle implements Colorable{
    Square(){}
    Square(double size){
        super(size,size);
    }
    Square(double size, String color, boolean filled){
        super(size,size,color,filled);
    }
    public void setSide(double side){
        setWeight(side);
        setHeight(side);
    }
    public double getSide(){
        return getWeight();
    }
    public double getArea(){
        return getSide()*getSide();
    }
    @Override
    public void setHeight(double side) {
        super.setHeight(side);
    }
    @Override
    public void setWeight(double side) {
        super.setWeight(side);
    }

    @Override
    public String toString(){
        return "A square with side= " +getSide() +
                " color= "+ getColor()+
                " " +(isFilled()?"filled":"Not Filled")
                + " Area: " + getArea();
    }
    @Override
    public void HowToColor(){
        System.out.println(" Hình vuông: tô 4 cạnh");
    }
}
