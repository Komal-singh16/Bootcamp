import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class DeleteRowMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        List<int[]> matrixList=new ArrayList<>(Arrays.asList(matrix));
        deleteMaxSumRow(matrixList);
        System.out.println("Matrix after deleting the row with maximum sum:");
        for(int[] row:matrixList){
            System.out.println(Arrays.toString(row));
        }
        sc.close();
    }
    public static void deleteMaxSumRow(List<int[]> matrixList){
        int maxSum=Integer.MIN_VALUE;
        int maxSumRowIndex=-1;
        for(int i=0;i<matrixList.size();i++){
            int sum=0;
            for(int num:matrixList.get(i)){
                sum+=num;
            }
            if(sum>maxSum){
                maxSum=sum;
                maxSumRowIndex=i;
            }
        }
        if(maxSumRowIndex!=-1){
            matrixList.remove(maxSumRowIndex);
        }
    }
    
}
