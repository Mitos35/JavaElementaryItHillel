package lesons5;

/*
дан массив (максимум 100 элементов).
Найти число, которое повторяется больше всего раз.
Например [1, 2, 2, 3, 1, 3, 4, 5, 1, 4, 4, 6, 2, 2, 7, 1, 2, 10, 31, 2 ] // 2
 */
public class Solution5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 3, 4, 5, 1, 4, 4, 6, 2, 2, 2, 7, 1, 2, 10, 31, 2};

        int count = 1;
        int maximumRepetition = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (maximumRepetition < count) {
                    maximumRepetition = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println("Максимальное число повторений " + maximumRepetition);
    }
}
