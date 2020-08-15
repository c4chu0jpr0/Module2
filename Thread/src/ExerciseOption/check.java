package ExerciseOption;

public class check {
    public static void main(String[] args) {
        OptimizePrimeFactorization optimizePrimeFactorization = new OptimizePrimeFactorization("Prime");
        LazePrime lazePrime = new LazePrime("Odd Number: ");

        Thread thread= new Thread(optimizePrimeFactorization);
        Thread thread1 = new Thread(lazePrime);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}
