package LinkedList.interviewQ;

import java.util.HashSet;

public class deleteCopyNode {
    void deleteDuplicate(linkedList ll) {
        HashSet <Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;

        while (current != null) {
            int currentValue = current.data;

            if (hs.contains(currentValue)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(currentValue);
                prev = current;
            }
            current = current.next;
        }
    }

}
