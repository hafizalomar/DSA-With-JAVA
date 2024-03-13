package LeetCode;

public class LC169 {
    public static void main(String[] args) {
        int[] array = {3, 2, 3};
        int result = majorityElement(array);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
        int n = 0;;
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
            n++;
        }
        return (int) Math.ceil(sum/n);
    }
}
