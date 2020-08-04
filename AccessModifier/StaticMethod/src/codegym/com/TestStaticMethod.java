package codegym.com;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1= new Student(1,"Tuan");
        Student student2= new Student(2,"Đẹp");
        Student student3= new Student(3,"trai");

        student1.display();
        student2.display();
        student3.display();
    }
}
