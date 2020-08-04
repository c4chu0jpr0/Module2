public class NextDayCalculator {
    public static String NextDayCalculator(int day, int month, int year){
        int checkDay= checkMonth(month, year);
        if (day==checkDay){
            if(month!=12){
                return "1/"+ (month+1)+"/"+ year;
            }else{
                return "1/1"+"/"+(year+1);
            }
        }else {
            return (day+1)+"/"+month+"/"+year;
        }
    }

    private static int checkMonth(int month, int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (checkIsLeapYear(year)) return 29;
                else return 28;
            default:
                System.out.println("undefined");
        }
        return month;
    }

    private static boolean checkIsLeapYear(int year) {
        boolean isLeapYear= false;
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    isLeapYear=true;
                }
            }else isLeapYear=true;
        }
        return isLeapYear;
    }
}
