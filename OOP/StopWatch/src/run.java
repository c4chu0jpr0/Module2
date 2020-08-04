import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();

        System.out.println(stopWatch.start());
        System.out.println(stopWatch.end());
        System.out.println(stopWatch.getElapsedTime());

    }
}
