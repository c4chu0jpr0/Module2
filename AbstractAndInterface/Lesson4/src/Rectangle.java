public class Rectangle implements Resizeable{
    protected double weight;
    protected double height;
    private String color;
    private boolean filled;
    Rectangle(){}
    Rectangle(double height, double weight){
        this.height=height;
        this.weight=weight;
    }
    Rectangle(double height, double weight,String color, boolean filled){
        this.height=height;
        this.weight=weight;
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "weight: "+weight + " height: "+height + " color: "+ color + " and " + (isFilled()?"filled":"not filled");
    }
    @Override
    public void resize(double percent){
        this.weight *= percent/100;
        this.height *= percent/100;
    }
}
