import java.util.*;
public class DecodeCompressedString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Integer> countStack=new Stack<>(); // number stack
        Stack<StringBuilder> numberString= new Stack<>() ; // string stack
        StringBuilder currentString=new StringBuilder();
        int k=0;
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
            }
            else if(ch=='['){
                countStack.push(k);
                numberString.push(currentString);
                currentString=new StringBuilder();
                k=0;
            }
            else if(ch==']'){
                StringBuilder decoded=currentString;
                currentString=numberString.pop();
                for(int i=countStack.pop(); i>0; i--){
                    currentString.append(decoded);
                }
            }
            else{
                currentString.append(ch);
            }
        }
        System.out.println(currentString.toString());
        sc.close();
    }
}
