import java.util.*;

public class triplets {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 6;

        printAllTriplets(nums, target);
    }
    
    public static void printAllTriplets(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            int low = i+1;                   //for distict triplets
            int hi = nums.length - 1;

            while (low < hi) {
                if (nums[low] + nums[hi] < val) {
                    low++;
                }
                else if (nums[low] + nums[hi] > val) {
                    hi--;
                }
                else {
                    System.out.println("triplets are: " + nums[i] + " " + nums[low] + " " + nums[hi]);
                    low++;
                    hi--;
                }
            }
        }
    }
}