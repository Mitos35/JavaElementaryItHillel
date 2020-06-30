package lesons5;

/*
Дан массив. Найти 2 числа, которые дадут максимальную сумму.
Например, [ -10, 4, 7, 9, -4, 11] -> a = 9, b = 11, sum = 20
 */
public class Solution9 {
    public static void main(String[] args) {
        int[] arr = {-10, 4, 7, 9, -4, 11};

        sort(arr);
        int sum = arr[arr.length - 2] + arr[arr.length -1];

        System.out.println("максимальную сумму двух чисел " + sum);

    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
