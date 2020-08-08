public class MyStack {
   private int[] arr;
   private int size;
   private int index;

   MyStack(int size){
       this.size=size;
       arr=new int[size];
   }

   public void push(int element){
       if(isFull()){
           System.out.println("not add");
       }
       arr[index]= element;
       index++;
   }

   public int pop(){
       if(isEmpty()){
           System.out.println("Not delete");
       }
       return arr[--index];
   }

   public int size(){
       return index;
   }

   public boolean isEmpty(){
       if (index==0){
           return true;
       }
       return false;
   }

   public boolean isFull(){
       if (index==size){
           return true;
       }
       return false;
   }
}
