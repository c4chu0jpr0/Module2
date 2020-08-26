import CategoryMain.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CategoryMenu categoryMenu= CategoryMenu.getInstance();
        CheckAdd checkAdd= CheckAdd.getInstance();
        CheckShow checkShow= CheckShow.getInstance();
        CheckFind checkFind = CheckFind.getInstance();
        CheckDelete checkDelete= CheckDelete.getInstance();
        CheckModify checkModify = CheckModify.getInstance();
        CheckHS checkHS= CheckHS.getInstan();
        String choice;

        do {
            StartApp:{
                categoryMenu.Menu();
                choice= scanner.nextLine();
                switch (choice){
                    case "1":
                        checkAdd.check();
                        break;
                    case "2":
                        checkModify.CheckModify();
                        break;
                    case "3":
                        checkDelete.checkDelete();
                        break;
                    case "4":
                        checkShow.readFile();
                        break;
                    case "5":
                        checkFind.CheckFind();
                        break;
                    case "6":
                        checkHS.checkHS();
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        break StartApp;
                }
            }
        }while (true);
    }
}
