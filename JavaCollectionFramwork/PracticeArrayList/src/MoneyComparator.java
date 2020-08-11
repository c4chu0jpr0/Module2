import java.util.Comparator;

public class MoneyComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getMoney()>o2.getMoney()){
            return 1;
        }else if(o1.getMoney()==o2.getMoney()){
            return 0;
        }else {
            return -1;
        }
    }
}
