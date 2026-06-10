//getting a character and converting it to lower and upper case using ASCII and ternary operator 
import java.util.Scanner;
public class Asciilowup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); //using .charAt(0) becoz for getting only 1 character.
        int c = (int)ch;
        if(ch>='A' && ch<='Z'){
            char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char)(c + 32) : ch;
            System.out.println("Lowercase character: " + lowerCase);
        }
        else if(ch>='a' && ch<='z'){
            char uppercase = (ch >= 'a' && ch <= 'z') ? (char)(c - 32) : ch;
            System.out.println("Uppercase character: " + uppercase);
        }
        else{
            System.out.println("Invalid.");
        }
        
    }
}


