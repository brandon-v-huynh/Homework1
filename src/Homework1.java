import java.util.Arrays;

public class Homework1 {
    public static int[] mergeTwoSortedArr(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];    // max length of new array must be 
                                                        // length of first two arrays combined
        int i = 0;                              // pointer for array a
        int j = 0;                              // pointer for array b
        int k = 0;                              // pointer for new array

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {                  // if b[j] is greater
                result[k] = a[i];               // new array adds a[i]
                i++;
            } else {                            // if a[i] is greater
                result[k] = b[j];
                j++;                            // new array adds b[i]
            }
            k++;
        }

        while (i < a.length) {                  // no more elemnts in b, copy rest of a
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {                  // no more elements in a, copy rest of b
            result[k] = b[j];
            j++;
            k++;
        }

        return result;                          // return new merged array
    }

    public static void main(String[] args) {
        int[] ex1 = {1, 2};
        int[] ex2 = {2, 3, 4};
        System.out.println(Arrays.toString(mergeTwoSortedArr(ex1, ex2)));
    }
}
