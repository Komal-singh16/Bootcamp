import java.util.*;
public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
        sc.close();
    }
}
