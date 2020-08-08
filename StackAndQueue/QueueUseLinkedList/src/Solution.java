public class Solution{
    private Node front; // head
    private Node rear; // tail

    public class Node {
        public int data;
        private Node link;
        public Node(int data){
            this.data=data;
            this.link=null;
        }
        public Node(){
        }
    }

    public void enQueue(int data){
        Node temp = new Node(data);
        if (this.rear==null){
            this.rear=this.front=temp;
            return;
        }else {
            this.rear.link=temp;
            this.rear=temp;
            this.rear.link=this.front;
        }
    }

    public void deQueue(){
        if(this.front==null){
            this.front=this.rear=null;
        }else if (this.front==this.rear){
            this.front=this.rear=null;
        }else {
            this.front=this.front.link;
            this.rear.link=this.front;
        }
    }

    public void display(){
        Node temp= this.front;
        System.out.printf("Element in Circle Queue are: ");
        while (temp.link!=this.front){
            System.out.printf("%d"+ " ",temp.data);
            temp=temp.link;
        }
        System.out.printf("%d",temp.data);
    }
}
