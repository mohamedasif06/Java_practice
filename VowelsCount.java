import java.util.Scanner;
public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();
        int n = word.length();
        int vc =0;
        int cc = 0;
        for(int i=0; i<n; i++){
            if((word.charAt(i) == 'a')||
            (word.charAt(i) == 'e') ||
            (word.charAt(i)== 'i') ||
            (word.charAt(i) == 'o') ||
            (word.charAt(i)== 'u')){
                vc++;
                System.out.println(word.charAt(i));
            }else{
                cc++;
            }
        }
        System.out.println("Number of vowels: "+ vc);
        System.out.println("Consonants count: "+cc);

    }
}
