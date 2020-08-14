package Practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choice;
        ArrayList<Product> arr = new ArrayList<>();

        do startApp:{
            System.out.println("Menu");
            System.out.println("1. Add product");
            System.out.println("2. Show Product");
            System.out.println("3. Find Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                        System.out.print("nhập mã sản phẩm: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập tên sản phẩm: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập tên nhà sản xuất: ");
                        String producer = scanner.nextLine();
                        System.out.print("Nhập giá sản phẩm: ");
                        int money = Integer.parseInt(scanner.nextLine());

                        Product product= new Product(id,name,producer,money);
                        arr.add(product);
                        WriteObject(arr);
                    break;
                case "2":
                    ReadObject(arr);
                    break;
                case "3":
                    System.out.println("Nhập id của sản phẩm: ");
                    int FindID = Integer.parseInt(scanner.nextLine());
                    FindReadObject(arr,FindID);
                    break;
                case "0":
                    System.exit(0);
                default:
                    break startApp;
            }
        }
        while (true);
    }

    private static void WriteObject(ArrayList<Product> arr) throws IOException{
        String SOURCE = "BInaryFile&Serialization/src/Practice2/FileText/FileSaveProduct.txt";
        File source = new File(SOURCE);

        try{
            FileOutputStream fos= new FileOutputStream(source, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Product pr: arr){
                oos.writeObject(pr);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ReadObject(ArrayList<Product> arr) throws IOException{
        String SOURCE = "BInaryFile&Serialization/src/Practice2/FileText/FileSaveProduct.txt" ;
        File source = new File(SOURCE);
        try{
            FileInputStream fi= new FileInputStream(source);
            ObjectInputStream obs= new ObjectInputStream(fi);
            for (int i = 0; i < arr.size() ; i++) {
                Product obj = (Product) obs.readObject();
                System.out.println(obj);
            }
            obs.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void FindReadObject(ArrayList<Product> arr,int num) throws IOException{
        String SOURCE = "BInaryFile&Serialization/src/Practice2/FileText/FileSaveProduct.txt" ;
        File source = new File(SOURCE);
        try {
            FileInputStream fi = new FileInputStream(source);
            ObjectInputStream obs = new ObjectInputStream(fi);
            for (int i = 0; i < arr.size() ; i++) {
                Product obj = (Product) obs.readObject();
                if (num == obj.getId()){
                    System.out.println(obj);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
