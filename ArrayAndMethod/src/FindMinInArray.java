public class FindMinInArray {
    public static int minValue(int[] array){
        int min=array[0];
        for (int i=0; i<array.length;i++){
            if (min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array={9,3,5,6,3,1};
        int index = minValue(array);
        System.out.println("The Smallest element in the array is: " + index);
    }
}
