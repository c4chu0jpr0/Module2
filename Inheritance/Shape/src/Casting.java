public class Casting {
    public static void main(String[] args) {
        Shape a= new Circle();
        Circle b= new Circle();

        Circle c= (Circle) b;
        System.out.println(a);
    }
}
