import java.util.*;

public class ProductManager {
   private List<Product> stack = new ArrayList<>();

   public void add(Product o){
       stack.add(o);
   }

   public void Repair(int index){
       Scanner scanner= new Scanner(System.in);
       System.out.print("Input name:");
       String name = scanner.nextLine();
       System.out.print("Input money:");
       double money=Double.parseDouble(String.valueOf(scanner.nextInt()));
       for (Product p: stack){
           if(p.getId()==index){
               p.setName(name);
               p.setMoney(money);
           }
       }
   }

   public int size(){
       return stack.size();
   }


   public void remove(int index){
       if (stack.size()==0){
           System.out.println("not delete");
       }
       stack.remove(index);
   }

   public int find(int index){
       for(int i=0; i<stack.size()-1;i++){
           if (i == index){
               return i;
           }
       }
       return -1;
   }

   public void swap(){
       MoneyComparator moneyComparator=new MoneyComparator();
       Collections.sort(stack,moneyComparator);
       System.out.println("Array: ");
       for (Product product:stack){
           System.out.println(product);
       }
   }

   public void printList(){
       for (Product e: stack){
           System.out.println(e);
       }
   }
}
