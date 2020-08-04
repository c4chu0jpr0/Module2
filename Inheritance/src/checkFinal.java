public class checkFinal extends Final{

}
class check{
    public static void main(String[] args) {
        Final a= new Final();
        System.out.println(a.color);

        checkFinal b = new checkFinal();
        System.out.println(b.color);
    }
}
