public class chackVowelAndCons {
    public static void main(String[] args) {
        char compare = 'h';

        switch (compare) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
            default -> System.out.println("cons");
        }
    }
}
