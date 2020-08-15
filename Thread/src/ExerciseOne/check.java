package ExerciseOne;

public class check {
    public static void main(String[] args) {
        NumberGenerator nGA= new NumberGenerator("A");
        NumberGenerator nGB= new NumberGenerator("B");

        Thread thread1= new Thread(nGA);
        Thread thread2= new Thread(nGB);
        thread1.start();
        thread2.start();
    }
}
