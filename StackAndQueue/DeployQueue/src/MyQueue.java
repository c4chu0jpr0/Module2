public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head=0;
    private int tail=-1;
    private int currentSize;

    MyQueue(int queueSize){
        this.capacity= queueSize;
        queueArr= new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status=true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status= false;
        if (currentSize==0){
            return true;
        }
        return status;
    }

    public void enqueue(int item){
       if (isQueueFull()){
           System.out.println("not add");
       }else {
           tail++;
           if (tail== capacity-1){
               tail=0;
           }
           queueArr[tail]=item;
           currentSize++;
           System.out.println("Element: "+ item);
       }
    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("not dequeue");
        }else {
            head++;
            if(head==capacity-1){
                System.out.println("Element: "+ queueArr[head-1]);
                head=0;
            }else{
                System.out.println("Element: "+ queueArr[head-1]);
            }
            currentSize--;
        }
    }
    public void printList(){
        for (int i: queueArr){
            System.out.print(i +" ");
        }
    }
}
