import java.util.*;
public class RotateAndInvertCaseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        char d=sc.next().charAt(0);
        int len=str.length();
        n=n%len;
        String rotate="";
        if(d=='l'){
            rotate=str.substring(n)+str.substring(0, n);
        }
        else if(d=='r'){
            rotate=str.substring(len-n)+str.substring(0,len-n);
        }
        char[] arr=rotate.toCharArray();
        for(int i=0;i<Math.min(n, arr.length);i++){
            if(Character.isUpperCase(arr[i])){
                arr[i]=Character.toLowerCase(arr[i]);
            }
            else if(Character.isLowerCase(arr[i])){
                arr[i]=Character.toUpperCase(arr[i]);
            }
        }
        System.out.println(new String(arr));
        sc.close();
    }
}
