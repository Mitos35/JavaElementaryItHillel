package lesons5;

/*
Найти первый повторяющийся элемент.
Например, [ 1, 7, 10, 15, 1, 88, 7] - ответ 1. P.S. 7 - второй повторяющийся элемент
 */
public class Solution7 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 10, 15, 1, 88, 7};

        int number = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
//                    System.out.println("Первый повторяющийся элемент " + arr[i]);
                    System.out.println(number + ") повторяющийся элемент: " + arr[i]);
                    number++;
//                    return;
                }
            }
        }
    }

}
