import java.util.*;
public class VowelsRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(ans);
        sc.close();
    }
}
