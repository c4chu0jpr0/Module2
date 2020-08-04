import java.util.Arrays;
import java.util.Arrays;
import java.util.Comparator;

public class check {
    public static void main(String[] args) {
        Circle[] circles= new Circle[3];
        circles[0]=new Circle(3.4);
        circles[1]=new Circle();
        circles[2]= new Circle(4.2,"gold", true);

        System.out.println("Pre");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        Comparator ComparatorCircle = new ComparatorCircle();
        Arrays.sort(circles,ComparatorCircle);

        System.out.println("after");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
