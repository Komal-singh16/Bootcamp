import java.util.*;

public class StringCompression {

    public static String compressedString(String str){
        if(str==null || str.isEmpty())
            return str;

        StringBuilder br=new StringBuilder();
        int count =1;
        for(int i=0;i<str.length();i++){
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                br.append(str.charAt(i));
                br.append(count);
                count=1;
            }
        }
        return br.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //aaaabbb-> a4b3
        String result=compressedString(str);
        System.out.println(result);
    }
}

