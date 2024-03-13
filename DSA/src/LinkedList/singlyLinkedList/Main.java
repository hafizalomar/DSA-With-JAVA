package LinkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.data);
        try {
            System.out.println(sll.head.next.data);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        sll.insertInLinkedList(1, 0);
        sll.insertInLinkedList(2, 1);
        sll.insertInLinkedList(6, 4);
        sll.insertInLinkedList(7, 7);
        sll.insertInLinkedList(8, 5);
        sll.showLinkedListElement();
        sll.deleteLinkedListElement(2);
        sll.showLinkedListElement();
        sll.deleteEntireLinkedList();
        sll.showLinkedListElement();

        boolean result = sll.searchNode(2);

        System.out.println(result);
    }
}
