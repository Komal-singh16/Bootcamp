import java.util.*;
public class DNFAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int countZero=0, countOne=0,countTwo=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) countZero++;
            else if(arr[i]==1) countOne++;
            else
            countTwo++;
        }
        for(int i=0; i<n; i++){
            if(i<countZero) arr[i]=0;
            else if(i>=countZero && i<countOne+countZero) arr[i]=1;
            else arr[i]=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
