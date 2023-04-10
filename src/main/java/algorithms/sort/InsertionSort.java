package algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int A[]) {
        // right compare to left, start from left
        // put smaller to the left

        for (int i= 1 ; i< A.length; i++) {
            int j = i;
            while (j > 0 && A[j] < A[j-1]) {
                // swap
                int temp = A[j-1];
                A[j-1] = A[j];
                A[j] = temp;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int [] A = {3, 4, 1, 4,5, 1, 0};
        System.out.println(Arrays.toString(A));
        insertionSort(A);
        System.out.println(Arrays.toString(A));
    }
    
}
