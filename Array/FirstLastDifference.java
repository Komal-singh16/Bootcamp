import java.util.*;
public class FirstLastDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //find difference between first and last element
        int difference=arr[0]-arr[n-1];
        System.out.println(difference);
        sc.close();
    }
}
