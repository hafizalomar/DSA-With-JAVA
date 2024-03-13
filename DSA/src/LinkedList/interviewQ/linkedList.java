package LinkedList.interviewQ;

public class linkedList {
     Node head;
     Node tail;
     int size;

     public void createLinkedList(int nodeValue) {
         Node node = new Node();
         node.data = nodeValue;
         node.next = null;
         node.prev = null;
         head = node;
         tail = node;
         size = 1;
     }

     public void insetNode(int nodeValue) {
         if (head == null) {
             createLinkedList(nodeValue);
             return;
         }
         Node node = new Node();
         node.data = nodeValue;
         node.next = null;
         node.prev = tail;
         tail.next = node;
         tail = node;
         size++;
     }

     public void traversalLinkedList() {
         if (head != null) {
             Node tempNode = head;
             for (int i = 0; i < size; i++) {
                 System.out.print(tempNode.data);
                 if (i < size - 1) {
                     System.out.print(" -> ");
                 }
                 tempNode = tempNode.next;
             }
         } else {
             System.out.println("linked list does not exist!");
         }
         System.out.println();
     }

     public void deleteDuplicateNode() {
         if (head == null) {
             System.out.println("linked list does not exist!");
             return;
         }

         Node current = head;

         while (current != null) {
             Node runner = current.next;

             while (runner != null) {
                 if (current.data == runner.data) {
                     // Duplicate found, remove the node pointed by runner
                     runner.prev.next = runner.next;

                     if (runner.next != null) {
                         // Update the previous reference of the next node if it exists
                         runner.next.prev = runner.prev;
                     } else {
                         // Update the tail if the last node is being removed
                         tail = runner.prev;
                     }

                     size--;
                 }

                 runner = runner.next;
             }

             current = current.next;
         }
     }
}
