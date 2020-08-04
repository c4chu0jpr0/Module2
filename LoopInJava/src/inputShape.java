import java.util.Scanner;

public class inputShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
        char s='*';
        String shape="";

        while (true){
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the recangle");
                    for (int i=1;i<=3;i++){
                        shape="";
                        for (int j=1;j<=6;j++){
                            shape += s;
                        }
                        System.out.println(shape);
                    }
                    break;
                case 2:
                    System.out.println("the square triangle botton-left");
                    for (int i=1;i<=5;i++){
                        shape="";
                        for (int j=1;j<=i;j++){
                            shape+=s;
                        }
                        System.out.println(shape);
                    }
                    System.out.println("the square triangle top-left");
                    for (int i=1; i<=5;i++){
                        shape="";
                        for (int j=5;j>=i;j--){
                            shape+=s;
                        }
                        System.out.println(shape);
                    }
                    System.out.println("the square triangle bottom-left");
                    for (int i =1; i<=5 ;i++){
                        shape="";
                        for (int j=1;j<=5;j++){
                            if(j<=5-i){
                                shape+= " ";
                            }else {
                                shape += s;
                            }
                        }
                        System.out.println(shape);
                    }
                    System.out.println("the square triangle top-left");
                    for (int i=1;i<=5;i++){
                        shape="";
                        for (int j=5;j>=0;j--){
                            if (j<=5-i){
                                shape+=s;
                            }else {
                                shape+=" ";
                            }
                        }
                        System.out.println(shape);
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i=1;i<=5;i++){
                        shape="";
                        for (int j=1;j<=9;j++){
                            if(j<=5-i){
                                shape+= " ";
                            }else if (j>=5+i){
                                shape+=" ";
                            } else {
                                shape+= s;
                            }
                        }
                        System.out.println(shape);
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Undefined");
                    break;
            }
        }

    }
}
