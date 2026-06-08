import java.util.*;
public class UsernameCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine().trim();
        //print first name , last name and id with "_" in between first name and last name, last name followed by id
        String id=sc.nextLine().trim();
        String[] nameParts = name.split("\\s+");

        if(nameParts.length>=2){
            String firstName=nameParts[0];
            String lastName=nameParts[nameParts.length-1];
            String username=firstName+"_"+lastName;
            username=username.toLowerCase()+id;
            System.out.println(username);
        } else {
            System.out.println("Invalid name");
        }
        sc.close();
    }
}
//time complexity: O(n) where n is the length of the input name string.
//space complexity: O(n) where n is the length of the input name string.
