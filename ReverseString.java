import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to reverse: ");
        String str = sc.next();
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.err.println("Reversed String: "+rev);

        
    }
}

//reverse(str) is inbuilt function.
