import java.util.*;
class ReplacePatternWithChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String pattern=sc.nextLine();
        char ch=sc.next().charAt(0);
        String ans=str.replaceAll(pattern, String.valueOf(ch));
        System.out.println(ans);
        sc.close();
    }
}
//TC=0(n*m) where n is the length of string and m is the length of pattern