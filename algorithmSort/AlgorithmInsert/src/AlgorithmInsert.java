public class AlgorithmInsert {
    static int[] list={2, 9, 5, 4, 8, 1, 6};
    public static void checkAlgorithmInsert(int[] list){
        for (int i = 0; i < list.length ; i++) {
            int currentEle= list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentEle; k--) {
                list[k + 1] = list[k];
            }
            list[k+1] =currentEle;
        }

        System.out.print("Mảng sau khi đc sắp xếp: ");
        for (int i: list){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        checkAlgorithmInsert(list);
    }
}
