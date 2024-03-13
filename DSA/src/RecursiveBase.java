public class RecursiveBase {
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod() {
        secondMethod();
        System.out.println("It's a first methode");
    }
    static void secondMethod() {
        thirdMethod();
        System.out.println("It's a second method");
    }

    static void thirdMethod() {
        fourthMethod();
        System.out.println("It's a third method");
    }

    static void fourthMethod() {
        System.out.println("It's a fourth method");
    }
}
