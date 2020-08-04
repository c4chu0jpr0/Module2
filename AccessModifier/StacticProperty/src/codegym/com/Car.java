package codegym.com;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    Car(String name, String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }

    private  void setName(String name){
        this.name= name;
    }
    private  void setEngine(String engine){
        this.engine= engine;
    }
    private String getName(){
        return this.name;
    }
    private String getEngine(){
        return this.engine;
    }
}
