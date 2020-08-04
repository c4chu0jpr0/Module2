package animal;
import edible.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Gà";
    }
    @Override
    public String howToEat(){
        return "Thóc";
    }
}
