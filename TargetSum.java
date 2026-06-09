//program to find the target sum in an array (Bruteforce)
import java.util.*;
public class TargetSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found are " + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pair found with the target sum.");
        }
    }
}

//without Bruteforce method 
import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {6,5,3,4,2,1};
        int target = 7;
        findTargetSum(arr, target);
    }

    public static void findTargetSum(int[] arr, int target) {
        Arrays.sort(arr); // Sort the array to use two-pointer technique
        int left = 0; // Start pointer
        int right = arr.length - 1; // End pointer

        while (left < right) {
            int sum = arr[left] + arr[right]; // Calculate the sum of the two pointers

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                return; // Exit after finding the first pair
            } else if (sum < target) {
                left++; // Move the left pointer to increase the sum
            } else {
                right--; // Move the right pointer to decrease the sum
            }
        }
        System.out.println("No pair found that sums to " + target);
    }
}
