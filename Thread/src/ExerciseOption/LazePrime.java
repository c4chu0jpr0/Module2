package ExerciseOption;

public class LazePrime implements Runnable{
    private String name;

    public LazePrime(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 2; i <20 ; i++) {
            try {
                if (checkNum(i)){
                    System.out.println(this.name + ": " + i);
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("sai");
            }
        }
    }
    private boolean checkNum(int i){
        if (i%2==0 && i != 2){
            return false;
        }
        return true;
    }
}
