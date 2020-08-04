public class Check {
    public static void main(String[] args) {
        int x =(int) Math.floor(Math.random()*100);
        Circle[] circles= new Circle[3];
        circles[0]=new Circle(x,"black",false);
        circles[1]=new Circle(x,"green",true);
        circles[2]=new Circle(x,"gold",false);

        System.out.println("pre");
        for (Circle circle: circles){
            System.out.println(circle);
        }
        System.out.println(" ");

        System.out.println("after");
        for (Circle circle: circles){
            int y = (int) (Math.random() * 100);
            circle.resize(y);
            System.out.println(circle);
        }

    }
}
