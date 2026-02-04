import org.junit.Test;
import static org.junit.Assert.*;

public class Homework1Test {
    
    @Test
    public void mergeTwoNonEmptyArraysTest() {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, Homework1.mergeTwoSortedArr(a, b));
    }

    @Test
    public void mergeTwoEmptyArraysTest() {
        int[] a = {};
        int[] b = {};
        int[] expected = {};
        assertArrayEquals(expected, Homework1.mergeTwoSortedArr(a, b));
    }

    @Test
    public void mergeOneEmptyArrayTest() {
        int[] a1 = {};
        int[] b1 = {2, 3};
        int[] expected1 = {2, 3};

        int[] a2 = {1, 2};
        int[] b2 = {};
        int[] expected2 = {1, 2};
        assertArrayEquals(expected1, Homework1.mergeTwoSortedArr(a1, b1));
        assertArrayEquals(expected2, Homework1.mergeTwoSortedArr(a2, b2));
    }

    @Test
    public void mergeNegativeArrayTest() {
        int[] a = {-2, -1};
        int[] b = {-4, -3};
        int[] expected = {-4, -3, -2, -1};
        assertArrayEquals(expected, Homework1.mergeTwoSortedArr(a, b));
    }

    @Test
    public void mergeLargerArrayTest() {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] b1 = {6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};

        int[] a2 = {1, 2};
        int[] b2 = {3, 4, 5, 6, 7};

        assertArrayEquals(expected, Homework1.mergeTwoSortedArr(a1, b1));
        assertArrayEquals(expected, Homework1.mergeTwoSortedArr(a2, b2));
    }

    @Test
    public void mergeDuplicateArrayTest() {
        int[] a = {2, 4, 5};
        int[] b = {2, 4, 6};
        int[] expected = {2, 2, 4, 4, 5, 6};
        assertArrayEquals(expected, Homework1.mergeTwoSortedArr(a, b));
    }
}