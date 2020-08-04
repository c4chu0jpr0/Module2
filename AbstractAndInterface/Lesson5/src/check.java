public class check {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0]= new Square(3,"gold",true);
        squares[1]= new Square(1,"green",false);
        squares[2]= new Square(2,"blue", false);

        for (Square square: squares){
            if (square instanceof Colorable){
                ((Colorable) square).HowToColor();
                System.out.println(square);
            }
        }
    }
}
