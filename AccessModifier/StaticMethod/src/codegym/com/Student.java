package codegym.com;

public class Student {
    private int id;
    private String name;
    private static String college= " ABC";

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    static void change(){
        college="Codegym";
    }
    void display(){
        System.out.println(id + " " + name + " "+ college);
    }
}
