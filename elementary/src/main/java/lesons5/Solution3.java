package lesons5;

/*
дан массив от 1 до n (не больше 100).
Найти недостающие элементы. Массив не отсортированный
 */
public class Solution3 {

    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 3, 9, 8, 6, 1};
        sort(arr);
        print(arr);

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                System.out.println("Недостающий элемент " + (arr[i] + 1));
            }
        }
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

    private static void print(int[] arr) {
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
    }
}
