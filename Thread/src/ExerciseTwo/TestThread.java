package ExerciseTwo;

public class TestThread {
    public static void main(String[] args) {
        OddThread ot= new OddThread();
        ot.setName("Odd number:");
        EvenThread et= new EvenThread();
        et.setName("Even number");
        ot.start();
        try {
            ot.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        et.start();

    }
}
