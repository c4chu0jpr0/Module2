package ExerciseOption;

public class OptimizePrimeFactorization implements Runnable{
    private String name;

    public OptimizePrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 2; i <20 ; i++) {
            try {
                if (checkNum(i)) {
                    System.out.println(this.name + ": " + i);
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("sai");
            }
        }
    }
    private boolean checkNum(int i){
        double num = Math.sqrt(i);
        for (int j = 2; j <= num ; j++) {
            if (num %j == 0 || i%j==0 ){
                return false;
            }
        }
        return true;
    }
}
