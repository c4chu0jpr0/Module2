public class checkSquare {
    public static void main(String[] args) {
        int x= (int) Math.floor(Math.random()*100);
        Square[] squares= new Square[3];
        squares[0]= new Square(x,"gold",true);
        squares[1]= new Square(x,"green",true);
        squares[2]= new Square(x,"blue",false);

        for (Square square: squares){
            square.resize(Math.floor(Math.random()*100));
            System.out.println(square);
        }
    }
}
