import java.util.*;

public class NegateRowsReverseColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        // Input matrix elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Negate even-indexed rows
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) { // even row index
                for (int j = 0; j < c; j++) {
                    arr[i][j] *= -1;
                }
            }
        }

        // Step 2: Reverse by columns (swap top ↔ bottom)
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r / 2; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[r - 1 - i][j];
                arr[r - 1 - i][j] = temp;
            }
        }

        // Print transformed matrix
        System.out.println("Matrix after negating even rows and reversing columns:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
