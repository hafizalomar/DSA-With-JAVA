package LinkedList.circlarDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdl = new CircularDoublyLinkedList();
        cdl.createCircularDoublyLinkedList(3);
        cdl.insetElementOnCircularDoublyLinkedList(2, 0);
        cdl.insetElementOnCircularDoublyLinkedList(1, 0);
        cdl.traversCircularDoublyLinkedList();
        cdl.traversCircularDoublyLinkedListInReverse();
        cdl.searchNodeFromCircularDoublyLinkedList(2);
        cdl.deleteNodeFromCircularDoublyLinkedList(1);
        cdl.traversCircularDoublyLinkedList();
        cdl.deleteFullCircularDoublyLinkedList();
        cdl.traversCircularDoublyLinkedList();
    }
}
