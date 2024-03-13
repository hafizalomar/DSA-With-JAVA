package LinkedList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDoublyLinkedList(3);
        dll.insertElementOnDoublyLinkedList(2, 0);
        dll.insertElementOnDoublyLinkedList(1, 0);
        dll.insertElementOnDoublyLinkedList(5, 9);
        dll.insertElementOnDoublyLinkedList(4, 3);
        dll.traversDoublyLinkedList();
        dll.traversDoublyLinkedListReverse();
        dll.searchElementFromDoublyLinkedList(2);
        dll.deleteNodeFromDoublyLinkedList(5);
        dll.deleteNodeFromDoublyLinkedList(1);
        dll.insertElementOnDoublyLinkedList(5, 9);
        dll.traversDoublyLinkedList();
        dll.deleteEntireDoublyLinkedList();
        dll.traversDoublyLinkedList();
    }
}
