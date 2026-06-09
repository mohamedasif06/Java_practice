import java.util.*;
public class ArraySort{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        for(int i=0; i<5;i++){
            System.out.print("Enter element "+(i+1)+ " of array 1: ");
            a[i] = sc.nextInt();
        }
         for(int i=0; i<5;i++){
            System.out.print("Enter element "+(i+1)+ " of array 2: ");
            b[i] = sc.nextInt();
        }
        for(int j = 0; j<5; j++){
            c[j] = a[j]+b[j];
        }
        System.out.print("New Array: ");
        for(int i = 0; i<5; i++){
            System.out.print(c[i]+" ");
        }
        Arrays.sort(c);
        System.out.println("");
        for(int i = 0; i<5; i++){
            System.out.print(c[i]+" ");
        }
    }
}

