package codegym.com;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("BMW","123");
        System.out.println(car1.numberOfCars);
        Car car2= new Car("Huydai","456");
        System.out.println(car2.numberOfCars);
    }
}
