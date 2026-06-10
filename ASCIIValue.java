import java.util.Scanner;
public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);
        int c = (int)ch;
        System.out.println("Ascii value of "+ch+" : "+c);  
    }
}


