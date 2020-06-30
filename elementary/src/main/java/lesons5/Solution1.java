package lesons5;

import java.util.Arrays;

/*
 реверсировать массив { 1, 2, 3, 4, ,5, 6 … 10} // { 10, 9, 8, …, 1 }
 диапазон  0 > a < 50
*/
public class Solution1 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
