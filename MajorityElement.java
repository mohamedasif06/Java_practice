// Majority element appears more than half the time.
// So after sorting, it must occupy the middle position.
import java.util.*;
class Majority{
        int maj(int nums[]){
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }
public class MajorityElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Majority m = new Majority();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            nums[i] = sc.nextInt();
        }
        System.out.println(m.maj(nums));

    }
}
