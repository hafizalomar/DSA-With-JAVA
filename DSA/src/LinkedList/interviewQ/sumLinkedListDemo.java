package LinkedList.interviewQ;

public class sumLinkedListDemo {
    public static void main(String[] args) {
        linkedList ll1 = new linkedList();
        ll1.insetNode(7);
        ll1.insetNode(1);
        ll1.insetNode(6);
        linkedList ll2 = new linkedList();
        ll2.insetNode(5);
        ll2.insetNode(9);
        ll2.insetNode(2);
        sumLists sll = new sumLists();
        linkedList result = sll.sumLinkedList(ll1, ll2);
        result.traversalLinkedList();
    }
}
