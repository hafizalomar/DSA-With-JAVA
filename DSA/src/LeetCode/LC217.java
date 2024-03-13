package LeetCode;

public class LC217 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 1};
        boolean result = containsDuplicate(inputArray);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
