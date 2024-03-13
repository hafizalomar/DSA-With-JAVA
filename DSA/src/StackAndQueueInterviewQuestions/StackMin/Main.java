package StackAndQueueInterviewQuestions.StackMin;

public class Main {
    public static void main(String[] args) {
        StackMin s1 = new StackMin();

        s1.push(5);
        System.out.println(s1.min());
        s1.push(9);
        System.out.println(s1.min());
        s1.push(4);
        System.out.println(s1.min());
        s1.push(8);
        System.out.println(s1.min());
        s1.push(3);
        System.out.println(s1.min());
        s1.push(12);
        System.out.println(s1.min());
        System.out.println("now i try pop function...");
        s1.pop();
        System.out.println(s1.min());
        s1.pop();
        System.out.println(s1.min());
        s1.pop();
        System.out.println(s1.min());
        s1.pop();
        System.out.println(s1.min());
        s1.pop();
        System.out.println(s1.min());
        s1.pop();
    }
}
