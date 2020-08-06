import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        elements= new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements= new Object[capacity];
    }

    private void ensureCapa(){
        int newSize = elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }

    public void add(int index,E element){

        for (int i = size - 1; i >= index; i--){
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index){
        int j=0;
        for (int i=0; i<elements.length;i++){
            if(index!=i){
                elements[j]=elements[i];
                ++j;
            }
        }
        return (E) elements;
    }

    public int size(){
        int count=0;
        for (int i=0; i<elements.length;i++){
            if(elements[i] != null){
                count++;
            }
        }
        return count;
    }

    public E clone(){
        Object shadowArray[];
        shadowArray= new Object[elements.length];
        for (int i=0;i< shadowArray.length;i++){
            shadowArray[i]=elements[i];
        }
        return (E) shadowArray;
    }

    public boolean contain(E o){
        for (int i=0; i< elements.length;i++){
            if (elements[i]==o){
                return  true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i=0; i<elements.length;i++){
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e){
        if(size<elements.length){
            int i;
            elements[elements.length]=e;
            return true;
        }else {
            return false;
        }
    }

    public E get(int i){
        for (int j=0;j<elements.length;j++){
            if(i==j){
                return (E) elements[j];
            }
        }
        return (E) "undefined";
    }

    public void clear(){
        for (int i=0; i<elements.length;i++){
            elements[i]=null;
        }
    }

    public void printList(){
        for (Object e:elements){
            System.out.println(e);
        }
    }
}
