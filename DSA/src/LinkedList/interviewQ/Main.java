package LinkedList.interviewQ;

public class Main {
    public static void main(String[] args) {
        linkedList nll = new linkedList();
        nll.createLinkedList(2);
        nll.insetNode(5);
        nll.insetNode(7);
        nll.insetNode(2);
        nll.insetNode(7);
        nll.insetNode(9);
        nll.insetNode(11);
        nll.insetNode(22);
        nll.traversalLinkedList();
        nll.deleteDuplicateNode();
        nll.traversalLinkedList();
        nll.insetNode(2);
        nll.insetNode(5);
        nll.traversalLinkedList();
        deleteCopyNode dl = new deleteCopyNode();
        dl.deleteDuplicate(nll);
        nll.traversalLinkedList();
        nthToLast nl = new nthToLast();
        Node n = nl.nthToLast(nll, 4);
        System.out.println(n.data);
        partition p = new partition();
        linkedList newOne = p.partition(nll, 9);
        newOne.traversalLinkedList();
    }
}
