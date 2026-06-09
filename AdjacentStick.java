import java.util.*;

public class AdjacentStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of sticks: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter lengths: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n-1; i += 2) {
            if (arr[i] < arr[i + 1]) {
                sum += arr[i];
            } else {
                sum += arr[i + 1];
            }
        }

        System.out.println("adjacents sum: "+sum);
    }
}
