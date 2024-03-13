package LinkedList.interviewQ;

public class sumLists {
    linkedList sumLinkedList(linkedList ll1, linkedList ll2) {
        Node n1 = ll1.head;
        Node n2 = ll2.head;
        int carry = 0;
        linkedList resultLl = new linkedList();
        while (n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.data;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.data;
                n2 = n2.next;
            }
            resultLl.insetNode(result%10);
            carry = result/10;
        }
        return resultLl;
    }
}
