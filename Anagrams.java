import java.util.*;
public class Anagrams{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word 1: ");
        String str1 = sc.next().toLowerCase();
        System.out.print("Enter word 2: ");
        String str2 = sc.next().toLowerCase();
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1==n2){
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str1.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("Strings are Anagrams. ");
            }else{
                System.out.println("Strings aren't Anagrams. ");
            }
        }else{
                System.out.println("Strings aren't Anagrams. ");
        }
        
    }
}
