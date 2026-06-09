import java.util.Scanner;

public class FOODBILL{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int pizza = 100;
        int puffs = 20;
        int cd = 10;
        System.out.print("Enter no of pizzas: ");
        int npiz = sc.nextInt();
        System.out.print("Enter no of puffs: ");
        int npuff = sc.nextInt();
        System.out.print("Enter no of cool drinks: ");
        int ncd = sc.nextInt();
        int total = npiz*pizza + npuff*puffs + ncd*cd;
        System.out.println("----TOTAL BILL----");
        System.out.println(total);
    }
}
