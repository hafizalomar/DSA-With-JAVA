package LeetCode;

public class LC35 {
    public static void main(String[] args) {
        int[] inputArray = {1, 3, 5, 7};
        int result = searchInsert(inputArray, 5);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]){
                return i;
            }
        }
        return 0;
    }
}
