package lesons5;

/*
Дан массив и входящий параметр k.
Найти наименьший элемент по возрастанию, с учетом k.
Например, [ 1, 4, 6, 10, 22, 2 ] k = 2, значит ответ 2, т.к. 2 - второй самый маленький элемент
 */
public class Solution6 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 10, 22, 2};
        int k = 2;
        sort(arr);
        System.out.println(k + " самый маленький элемент = " + arr[k - 1]);
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
