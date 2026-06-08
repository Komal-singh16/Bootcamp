import java.util.*;

public class InsertDeleteAtGivenPosition {
    public static int[][] insertRow(int[][] original, int[] newRow, int targetIdx) {
        int rows = original.length;
        int cols = original[0].length;
        int[][] result = new int[rows + 1][cols];

        for (int i = 0; i < result.length; i++) {
            if (i < targetIdx) {
                result[i] = original[i];
            } else if (i == targetIdx) {
                result[i] = newRow;
            } else {
                result[i] = original[i - 1];
            }
        }
        return result;
    }

    public static int[][] deleteRow(int[][] original, int targetIdx) {
        int rows = original.length;
        int cols = original[0].length;
        int[][] result = new int[rows - 1][cols];

        for (int i = 0; i < original.length; i++) {
            if (i < targetIdx) {
                result[i] = original[i];
            } else if (i > targetIdx) {
                result[i - 1] = original[i];
            }
        }
        return result;
    }

    public static int[][] insertColumn(int[][] original, int[] newCol, int targetIdx) {
        int rows = original.length;
        int cols = original[0].length;
        int[][] result = new int[rows][cols + 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (j < targetIdx) {
                    result[i][j] = original[i][j];
                } else if (j == targetIdx) {
                    result[i][j] = newCol[i];
                } else {
                    result[i][j] = original[i][j - 1];
                }
            }
        }
        return result;
    }

    public static int[][] deleteColumn(int[][] original, int targetIdx) {
        int rows = original.length;
        int cols = original[0].length;
        int[][] result = new int[rows][cols - 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j < targetIdx) {
                    result[i][j] = original[i][j];
                } else if (j > targetIdx) {
                    result[i][j - 1] = original[i][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter your choice for operation:\n1.Insert a row.\n2.Insert Col.\n3.Delete a Row\n4.Delete a Col.\n-> ");
        int op=sc.nextInt();
        if(op==1){
            System.out.print("Enter your target index where want to insert row:");
            int target=sc.nextInt();
            System.out.print("Enter new Row value:");
            int[] newRow=new int[mat[0].length];
            for(int i=0;i<mat[0].length;i++){
                newRow[i]=sc.nextInt();
            }
            mat = insertRow(mat, newRow, target);
        }
        else if(op==2){
            System.out.print("Enter your target index where want to insert col:");
            int target=sc.nextInt();
            System.out.print("Enter new Col value:");
            int[] newCol=new int[mat.length];
            for(int i=0;i<mat.length;i++){
                newCol[i]=sc.nextInt();
            }
            mat = insertColumn(mat, newCol, target);
            System.out.println("Matrix after inserting column:");
            printMatrix(mat);
            mat=deleteColumn(mat, target);
        }else{
            System.out.println("Wrong choice enetred");
        }
        System.out.println("Matrix after operation:");
        printMatrix(mat);
        sc.close();
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
