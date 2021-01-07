import java.util.Arrays;
import java.util.Random;

public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) {
        int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i % 2 == 0) {
                newArr[i] = arr1[i/2];
            } else {
                newArr[i] = arr2[i/2];
            }
        }
        return newArr;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index1 = rand.nextInt(arr.length);
            int index2 = rand.nextInt(arr.length);
            int index1Value = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = index1Value;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(perfectShuffle(new int[]{1, 2, 3, 4, 5, 21, 22, 23, 24, 25})));
        System.out.println(Arrays.toString(selectionShuffle(new int[]{1, 2, 3, 4, 5, 21, 22, 23, 24, 25})));
    }
}
