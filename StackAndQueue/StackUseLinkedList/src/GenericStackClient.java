public class GenericStackClient {
    public static void main(String[] args) {
        stackOfStrings();
        System.out.println("Interger:");
        stackOfInteger();
    }


    private static void stackOfStrings(){
        MyGenericStack<String> stack= new MyGenericStack();
        stack.push("Tuấn");
        stack.push("Đẹp");
        stack.push("Trai");

        System.out.println("Size Linked: "+stack.size());

        System.out.printf("Pop: ");
        while (!stack.isEmpty()){
            System.out.printf("%s", stack.pop());
        }
        System.out.println();
        System.out.println("check size: " +stack.size());
    }

    private static void stackOfInteger(){
        MyGenericStack<Integer> stack= new MyGenericStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Check size:"+stack.size());

        System.out.printf("Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%s ",stack.pop());
        }
        System.out.println();
        System.out.println("size: "+ stack.size());
    }


}
