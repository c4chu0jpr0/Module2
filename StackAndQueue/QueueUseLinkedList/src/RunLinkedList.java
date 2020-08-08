public class RunLinkedList {
    public static void main(String[] args) {
        Solution solutions= new Solution();
        solutions.enQueue(14);
        solutions.enQueue(22);
        solutions.enQueue(-6);
        solutions.display();
        System.out.println();
        solutions.deQueue();
        solutions.deQueue();
        solutions.enQueue(9);
        solutions.enQueue(20);
        solutions.display();
    }
}
