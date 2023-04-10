package algorithms.sort;
import java.util.Arrays;

class SelectionSort {

    static void selectionSort(int[] A) {
        // left compare to right, start from right

        for (int i = A.length - 1; i > 0; i--) {
            int m = i;
            for (int j = 0; j < i; j++) {
                if (A[m] < A[j]) {
                    m = j;
                }
            }
            // swap
            int temp = A[m];
            A[m] = A[i];
            A[i] = temp;
        }
        
    }
    public static void main(String[] args) {
        int [] A = {3, 4, 1, 4,5, 1, 0};
        System.out.println(Arrays.toString(A));
        selectionSort(A);
        System.out.println(Arrays.toString(A));
    }
}