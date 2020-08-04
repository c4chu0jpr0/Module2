import java.util.Scanner;

public class ApplyreadNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số cần đọc:");
        int num=scanner.nextInt();

        String readHunred;
        String readTens;
        String readOnes;

        if (num<=10){
            switch (num){
                case 1:
                    readOnes="one";
                    break;
                case 2:
                    readOnes="two";
                    break;
                case 3:
                    readOnes="three";
                    break;
                case 4:
                    readOnes="four";
                    break;
                case 5:
                    readOnes="five";
                    break;
                case 6:
                    readOnes="six";
                    break;
                case 7:
                    readOnes="seven";
                    break;
                case 8:
                    readOnes="eight";
                    break;
                case 9:
                    readOnes="nine";
                    break;
                case 10:
                    readOnes="ten";
                    break;
                default:
                    readOnes="";
            }
            System.out.printf("số '%d' đọc là %s",num,readOnes);
        } else if (num<20){
            switch (num){
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fivteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eightteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if(num<100){
            int tens,ones;
            tens= num/10;
            ones = num%10;

            switch (tens){
                case 2:
                    readTens="twenty";
                    break;
                case 3:
                    readTens="thirty";
                    break;
                case 4:
                    readTens="forty";
                    break;
                case 5:
                    readTens="fifty";
                    break;
                case 6:
                    readTens="sixty";
                    break;
                case 7:
                    readTens="seventy";
                    break;
                case 8:
                    readTens="eightty";
                    break;
                case 9:
                    readTens="ninety";
                    break;
                default:
                    readTens="";
            }
            switch (ones){
                case 0:
                    readOnes=" ";
                    break;
                case 1:
                    readOnes="one";
                    break;
                case 2:
                    readOnes="two";
                    break;
                case 3:
                    readOnes="three";
                    break;
                case 4:
                    readOnes="four";
                    break;
                case 5:
                    readOnes="five";
                    break;
                case 6:
                    readOnes="six";
                    break;
                case 7:
                    readOnes="seven";
                    break;
                case 8:
                    readOnes="eight";
                    break;
                case 9:
                    readOnes="nine";
                    break;
                default:
                    readOnes="";
            }
            if (readTens != "" && readOnes != "" ) System.out.printf("Số '%d' đọc là %s %s",num,readTens,readOnes);
        } else if (num<999){
            int tens, ones ,hunreds,tens1;
            hunreds = num/100;
            tens = num%100;
            tens1 = tens%10;
            ones = tens%10;

            switch (hunreds){
                case 1:
                    readHunred="One hundred";
                    break;
                case 2:
                    readHunred="Two hundred";
                    break;
                case 3:
                    readHunred="Three hundred";
                    break;
                case 4:
                    readHunred="Four hundred";
                    break;
                case 5:
                    readHunred="Five hundred";
                    break;
                case 6:
                    readHunred="Six hundred";
                    break;
                case 7:
                    readHunred="Seven hundred";
                    break;
                case 8:
                    readHunred="Eight hundred";
                    break;
                case 9:
                    readHunred="Nine hundred";
                    break;
                default:
                    readHunred="";
            }

            if (tens<=10){
                switch (tens){
                    case 0:
                        readTens=" ";
                        break;
                    case 1:
                        readTens="one";
                        break;
                    case 2:
                        readTens="two";
                        break;
                    case 3:
                        readTens="three";
                        break;
                    case 4:
                        readTens="four";
                        break;
                    case 5:
                        readTens="five";
                        break;
                    case 6:
                        readTens="six";
                        break;
                    case 7:
                        readTens="seven";
                        break;
                    case 8:
                        readTens="eight";
                        break;
                    case 9:
                        readTens="eight";
                        break;
                    case 10:
                        readTens="ten";
                        break;
                    default:
                        readTens="";
                }
                if (readHunred!= "" && readTens!="") System.out.printf("Số '%d' đọc là %s and %s",num,readHunred,readTens);
            }else if (tens<20){
                switch (tens){
                    case 11:
                        readTens="eleven";
                    case 12:
                        readTens="twelve";
                    case 13:
                        readTens="thirteen";
                    case 14:
                        readTens="fourteen";
                    case 15:
                        readTens="fifteen";
                    case 16:
                        readTens="sixteen";
                    case 17:
                        readTens="seventeen";
                    case 18:
                        readTens="eightteen";
                    case 19:
                        readTens="nineteen";
                    default:
                        readTens ="";
                }
                if (readHunred!=""&& readTens!="") System.out.printf("Số '%d' đọc là  %s and %s",num,readHunred,readTens);

            }else if(tens<99){
                switch (ones){
                    case 1:
                        readOnes="one";
                        break;
                    case 2:
                        readOnes="two";
                        break;
                    case 3:
                        readOnes="three";
                        break;
                    case 4:
                        readOnes="four";
                        break;
                    case 5:
                        readOnes="five";
                        break;
                    case 6:
                        readOnes="six";
                        break;
                    case 7:
                        readOnes="seven";
                        break;
                    case 8:
                        readOnes="eight";
                        break;
                    case 9:
                        readOnes="nine";
                        break;
                    case 10:
                        readOnes="ten";
                        break;
                    default:
                        readOnes="";
                }
                switch (tens1){
                    case 2:
                        readTens="twenty";
                        break;
                    case 3:
                        readTens="thirty";
                        break;
                    case 4:
                        readTens="forty";
                        break;
                    case 5:
                        readTens="fifty";
                        break;
                    case 6:
                        readTens="sixty";
                        break;
                    case 7:
                        readTens="seventy";
                        break;
                    case 8:
                        readTens="eightty";
                        break;
                    case 9:
                        readTens="ninety";
                        break;
                    default:
                        readTens="";
                }
                if (readHunred!="" && readTens!= "" && readOnes!="") System.out.printf("số '%d' đọc là %s and %s %s",num,readHunred,readTens,readOnes);
            }
        }
    }
}
