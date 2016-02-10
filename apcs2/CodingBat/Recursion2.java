public class Recursion2 {

    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        else {
            return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
        }
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        else if (nums[start] % 5 == 0) {
            if (start < nums.length - 1 && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            else {
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        }
        else {
            return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
        }
    }

    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        else if (nums[start] == 6) {
            if (start < nums.length - 1 && nums[start + 1] == 1) {
                return groupSum6(start + 2, nums, target - nums[start]);
            }
            else {
                return groupSum6(start + 1, nums, target - nums[start]);
            }
        }
        else {
            return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
        }
    }
    
}
