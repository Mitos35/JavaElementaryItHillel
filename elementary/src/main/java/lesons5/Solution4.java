package lesons5;

/*
дано 2 отсортированных массива,
например [11, 24, 49, 53, 72, 87] и [7, 12, 24, 48, 61, 87].
Найти дубликаты в обоих массивах. // 24, 87
 */
public class Solution4 {
    public static void main(String[] args) {
        int[] arr1 = {11, 24, 49, 53, 72, 87};
        int[] arr2 = {7, 12, 24, 48, 61, 87};

        int[] arrDuplicates = new int[numberOfDuplicates(arr1, arr2)];

        int num = 0;
        for (int i1 : arr1) {
            for (int i : arr2) {
                if (i1 == i) {
                    arrDuplicates[num] = i1;
                    num++;
                }
            }
        }

        print(arrDuplicates);
    }

    private static int numberOfDuplicates(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i1 : arr1) {
            for (int i : arr2) {
                if (Math.abs(i1) == Math.abs(i)) {
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
}
