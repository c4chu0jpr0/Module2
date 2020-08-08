import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> stack;
    Stack(){
        stack= new ArrayList<>();
    }
    public void push(T element){
        stack.add(element);
    }

    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }

    public void reverse(){
        ArrayList<T> temp = new ArrayList<>();
        int N=stack.size();
        for (int i = 0; i < N ; i++) {
            temp.add(this.pop());
        }
        for (T t: temp){
            System.out.print(t + " ");
        }
    }


    public void printList(){
        for (T t: stack){
            System.out.print(t + " ");
        }
    }

}
