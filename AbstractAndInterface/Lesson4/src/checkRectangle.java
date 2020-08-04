public class checkRectangle {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()*100);
        int y = (int) Math.floor(Math.random()*100);
        Rectangle[] rectangles= new Rectangle[3];
        rectangles[0]= new Rectangle(x,y,"gold",false);
        rectangles[1]= new Rectangle(x,y,"green",true);
        rectangles[2]= new Rectangle(x,y,"while",false);

        System.out.println("pre");
        for (Rectangle rectangle: rectangles){
            System.out.println(rectangle);
        }

        System.out.println("after");
        for (Rectangle rectangle:rectangles){
            rectangle.resize(Math.floor(Math.random()*100));
            System.out.println(rectangle);
        }
    }
}
