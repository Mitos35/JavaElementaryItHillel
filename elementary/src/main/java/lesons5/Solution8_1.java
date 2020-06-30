package lesons5;

/*

 */
public class Solution8_1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 7, 0};


//        Set<Integer> deleter = new HashSet<>(Arrays.asList(arr));
//        System.out.println(deleter);

        int n = arr.length;

        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (arr[j] != arr[i]) {
                    if ( m != j ){
                        arr[m] = arr[j];
                    }
                    m++;
                }
            }
        }

        if ( n != arr.length) {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ){
                b[i] = arr[i];
            }
            arr = b;
        }

        for ( int x : arr ) {
            System.out.print( x + " ");
        }

    }
}
