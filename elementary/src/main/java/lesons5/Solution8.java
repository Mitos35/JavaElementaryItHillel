package lesons5;

/*
Дан массив. Убрать все дубликаты. например, [1, 2, 3, 1, 7, 0] -> [ 1, 2, 3, 7, 0 ]
 */
public class Solution8 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 7, 0};

        int[] newArr = new int[numberOfLength(arr)];
        sort(arr);

        int count = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                newArr[count]= arr[i];
                count++;
            }
        }
        print(newArr);
    }

    private static int numberOfLength(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (Math.abs(arr[i]) == Math.abs(arr[j])){
                    count++;
                }
            }
        }
        return arr.length - count;
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
