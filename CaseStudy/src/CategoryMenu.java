public class Category {
    private static Category instance= new Category();
    private Category(){}

    public static Category getInstance() {
        return instance;
    }

    public void Menu(){
        System.out.println("Menu");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Modify");
        System.out.println("4. Search");
        System.out.println("0. Exit");
        System.out.print("Input number: ");
    }
    public void DefineWord(){
        System.out.println("1. Noun");
        System.out.println("2. Verb");
        System.out.println("3. Adj");
        System.out.println("4. Synonymous");
        System.out.println("5. Save");
        System.out.print("Input number: ");
    }

    public void InputWord(){
        System.out.println("input word: ");
    }
}
