package lesson5;

/*
Написать метод, на вход принимает массив и число k.
Найти в массиве числа, которые в сумме дают k.
Если таких нет .- вывести Sout ('Операция невозможна')
 */
public class Solution10 {
    public static void main(String[] args) {

        int[] arr = {1,2,4,7};
        int k = 9;

        findArrayOfNumberSum(arr, k);
    }

    private static void findArrayOfNumberSum(int[] arr, int number) {
        boolean isFlag = false;
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == number) {
                    number1 = arr[i];
                    number2 = arr[j];
                    isFlag = true;
                }
            }
        }

        if (isFlag) {
            System.out.println(number1 + " и " + number2 + " сумме дают " + number);
        } else {
            System.out.println("Операция невозможна");
        }
    }
}
