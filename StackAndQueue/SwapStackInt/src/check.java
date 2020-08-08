public class check {
    private static void integerOfStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printList();


        System.out.println();
        stack.reverse();
    }
    private static void StringOfStack(){
        Stack<String> stack = new Stack<>();
        stack.push("Tuấn");
        stack.push("Đẹp");
        stack.push("Trai");
        stack.printList();

        System.out.println();
        stack.reverse();
    }

    public static void main(String[] args) {
        integerOfStack();
        System.out.println();

        StringOfStack();
    }
}
