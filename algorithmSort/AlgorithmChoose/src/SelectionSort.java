public class SelectionSort {
    static double[] list= {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length-1 ; i++) {
            double currentList = list[i];
            int currentListIndex = i;
            for (int j = i+1; j < list.length ; j++) {
                if(currentList > list[j]){
                    currentList = list[j];
                    currentListIndex = j;
                }
            }

            if (currentListIndex != i){
                list[currentListIndex] = list[i];
                list[i]=currentList;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
