import java.security.PublicKey;

public class Circle {
    private double radius;
    private String color;

    Circle(){}
    Circle(double radius){
        this.radius=1.0;
    }
    private double getRadius(){
        return this.radius;
    }
    private String getColor(){
        return this.color;
    }
}
