import java.util.*;
class LeadersInAnArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        int max=arr[n-1];
        list.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(max);
            }
        }
        System.out.println(list);
        sc.close();
    }
}