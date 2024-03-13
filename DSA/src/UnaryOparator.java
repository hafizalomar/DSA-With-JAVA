public class UnaryOparator {
    public static void main(String[] args) {

        int number = 10;
        System.out.print("Pre Increment: ");
        preIncrement(number);
        System.out.print("Post Increment: ");
        postIncrement(number);
    }

    public static void preIncrement(int number) {
        int a = ++number;
        System.out.println(a);
    }
    public static void postIncrement(int number) {
        int a = number++;
        System.out.println(a);
    }
}
