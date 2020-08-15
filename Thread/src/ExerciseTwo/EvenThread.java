package ExerciseTwo;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 11 ; i++) {
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i%2 == 0){
                System.out.println(this.getName() + " " + i);
            }
        }
    }
}
