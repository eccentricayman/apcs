public class Recursion2 {
    
    public static boolean groupSum5(int start, int[] nums, int target) {
        if (start + 1 == nums.length) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] == target;
        }
        if (nums[start] % 5 == 0 && start + 2 <= nums.length) {
            
        }
        
    }

}
