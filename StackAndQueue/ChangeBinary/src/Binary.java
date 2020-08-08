public class Binary {
    private int arr[];
    private int size;
    private int index;


    Binary(int size){
        this.size=size;
        arr= new int[size];
    }

    public void push(int ele){
        if(isFull()){
            System.out.println("Not add");
        }
        arr[index]=ele;
        index++;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Not delete");
        }
        return arr[--index];
    }

    public int size(){
        return index;
    }

    public boolean isEmpty(){
        if(index==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(index==size){
            return true;
        }
        return false;
    }
    public void printList(){
        for (int i: arr){
            System.out.print(+i);
        }
    }

}
