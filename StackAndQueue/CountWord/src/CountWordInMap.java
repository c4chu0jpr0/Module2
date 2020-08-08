import java.util.ArrayList;

public class CountWordInMap<T> {
    private ArrayList<T> stack;
    CountWordInMap(){
        stack= new ArrayList<>();
    }

    public void push(T element){
        stack.add(element);
    }

    public T pop(){
        return stack.remove(stack.size()-1);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }

    public T checkWord(T element){
        for (T t: stack) {
            if (t.equals(element)){
                this.push(element);
                return element;
            }
        }
        this.push(element);
        return null;
    }

    public void printList(){
        for (T t: stack){
            System.out.print(t +" ");
        }
    }
}
