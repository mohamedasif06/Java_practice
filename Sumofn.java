import java.util.*;
public class Sumofn {
    static void sumn(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumn(n);
    }
}
