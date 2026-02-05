import java.util.Arrays;

public class Homework1 {
    public static int[] mergeTwoSortedArr(int[] a, int[] b) {
        // max size of new array must be length of first two arrays combined
        int[] result = new int[a.length + b.length];    
        int i = 0;                              // pointer for array a
        int j = 0;                              // pointer for array b
        int k = 0;                              // pointer for new sorted array

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {                  // if a[i] is smaller
                result[k] = a[i];               // new array adds a[i]
                i++;
            } else {                            // if a[i] is greater
                result[k] = b[j];               // new array adds b[j]
                j++;                        
            }
            k++;
        }

        // If no more elements in b, copy rest of a
        while (i < a.length) {                  
            result[k] = a[i];
            i++;
            k++;
        }

        // If no more elements in a, copy rest of b
        while (j < b.length) {                  
            result[k] = b[j];
            j++;
            k++;
        }

        return result;                          // return merged sorted array
    }

    public static void main(String[] args) {
        int[] ex1 = {1, 2};
        int[] ex2 = {2, 3, 4};
        System.out.println(Arrays.toString(mergeTwoSortedArr(ex1, ex2)));
    }
}
