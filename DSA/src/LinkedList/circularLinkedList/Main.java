package LinkedList.circularLinkedList;

public class Main {
    public static void main(String[] args) {
        circularLinkedList cll = new circularLinkedList();
        cll.createCircularLinkedList(5);
        cll.InsertCllValue(2, 0);
        cll.InsertCllValue(1, 0);
        cll.InsertCllValue(3, 2);
        cll.InsertCllValue(4, 3);
        cll.InsertCllValue(6, 5);
//      if you want to chick it's circularLinkedList or not.
//      System.out.printf("Head value: %d Head Next ref value: %d if two value are same then it's a circular linked list.",cll.head.data, cll.head.next.data);

//        both are same but logic are def
        cll.showCircularLinkedListElement();
//        it's a circular linked list this is the reason it's print con.
//        cll.showCircularLinkedListElement2();
//        cll.traverseLinkedList();
//        we just comment out the traversal function.
//        logic end hear.
        cll.searchCircularLinkedListValue(10);
//        delete element form circular linked list.
        cll.deleteElementFromCircularLinkedList(2);
        cll.showCircularLinkedListElement();

        cll.deleteEntLinedList();
        cll.showCircularLinkedListElement();

    }
}
