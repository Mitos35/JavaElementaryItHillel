package lesons5;
/*
дан массив { 1, 23, -4, 3, 21, -23, 5, 77, 4 }.
Вычислить дубликаты по + и - (например, 5 и -5),
вывести максимальное число среди дубликатов. // 23
диапазон -25 > a >25
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 4, 3, 21, -23, 5, 77, -4};
        int[] newArr = new int[numberOfDuplicates(arr)];

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (Math.abs(arr[i]) == Math.abs(arr[j])){
                    newArr[num] = arr[i];
                    num++;
                }
            }
        }
        print(newArr);
        System.out.println();
        max(newArr);
    }

    private static int numberOfDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (Math.abs(arr[i]) == Math.abs(arr[j])){
                    count++;
                }
            }
        }
        return count;
    }

    private static void print(int[] arr) {
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
    }

    private static void max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
