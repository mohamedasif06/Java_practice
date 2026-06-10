import java.util.Scanner;
public class RemoveVowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        String res = str.replaceAll("[aeiou]","");
        System.out.println("Result word: "+res);
    }
}
