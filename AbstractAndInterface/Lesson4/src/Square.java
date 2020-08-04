public class Square extends Rectangle{
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
                " " +(isFilled()?"filled":"Not Filled");
    }
    @Override
    public void resize(double percent){
       this.weight *= (percent / 100);
       this.height *= (percent / 100);
    }
}
