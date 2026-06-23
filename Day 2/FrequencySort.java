import java.util.*;
public class FrequencySort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArratList<>();
        for(int i:arr){
            list.add(i);
        }
        
    }
}
