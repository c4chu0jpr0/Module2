public class Practice {
    static int[] list= {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list){
        boolean needPassNext= true;
        for (int k = 1; k <list.length && needPassNext ; k++) {
            needPassNext=false;
            for (int i = 0  ; i < list.length-k; i++) {
                if (list[i]>list[i+1]){
                    int temp= list[i];
                    list[i+1]=list[i];
                    list[i]= temp;

                    needPassNext= true;
                }
            }
        }
        System.out.print("Mảng đc sắp xếp: ");
        for(int i :list){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
    }
}
