public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList= new MyList<Integer>();
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,3);
        myList.add(4,3);
        myList.add(5,3);
        myList.add(6,3);
        myList.add(7,3);
        myList.add(8,3);
        myList.add(9,3);


        System.out.println(myList.contain(1));
    }
}
