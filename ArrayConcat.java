import java.util.*;
public class ArrayConcat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in arr1: ");
        int n = sc.nextInt();
        System.out.print("Enter no of elements in arr2: ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] res = new int[n+m];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element "+(i+1)+" for arr1: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.print("Enter element "+(i+1)+" for arr2: ");
            arr2[i] = sc.nextInt();
        }
        for(int i=0; i<(n); i++){
            res[i] = arr1[i];
        }
        for(int i=0; i<m; i++){
            res[n+i] = arr2[i];
        }
        System.out.print("Result: ");
        for(int i=0; i<(n+m);i++){
            System.out.print(res[i]+" ");
        }
    }
}
