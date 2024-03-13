package InterviewQuestion;

public class Q4 {
    public static void main(String[] args) {
        int[] customArray = {1, 2, 3, 4};
        printPairs(customArray,customArray);
    }

    static void printPairs(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.print(arrayA[i] + ", " + arrayB[j]);
                }
            }
            System.out.println();
        }
    }
}
