import java.util.Arrays;

public class check {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]= new ComparableCircle(3.6);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle(3.7,"gold",false);

        System.out.println("pre");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("after:");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
    }
}
