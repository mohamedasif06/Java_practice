import java.util.Scanner;
public class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine().toLowerCase(); 
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("Palindrome.");
        }else{
            System.out.println("not Palindrome.");
        }
        
    }
}


