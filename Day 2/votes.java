import java.util.*;
public class votes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //sort
        Arrays.sort(arr);
        //find frequency of each element by hashset
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int threshold=n/4;
        for(int i: map.keySet()){
            if(map.get(i)>threshold){
                System.out.print(i+"");
            }
            else{
                System.out.print("no element is more than 1/4 times");
            }
        }
        sc.close();
    }
}
