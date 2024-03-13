package InterviewQuestion;

public class Q2 {
    public static void main(String[] args) {
        int[] customArray = {1, 3, 4, 5, 6};
        pairs(customArray);
    }

    static void pairs(int[] array) {
        for (int i = 0; i < array.length; i++) { //........................O(n)
            for (int j = 0; j < array.length; j++) { //....................O(n)
                System.out.print(array[i]*10+array[j] + ", ");//...........O(1)
            }
            System.out.println();
        }
    }
}
//sum time complexity => O(n) * O(n) => O(n*2)+O(1) => O(n2).
//time complexity = O(n2).