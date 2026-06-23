import java.util.*;
class ProductOfArrayExceptSelf{
    public static int[] productExceptSelf(int[] arr, int n){
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=suffix;
            suffix*=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int[] result=productExceptSelf(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}