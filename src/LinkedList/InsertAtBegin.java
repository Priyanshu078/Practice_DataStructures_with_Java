package LinkedList;

public class InsertAtBegin {

    static Node insetAtBegin(Node head, int x){
        Node n = new Node(x);
        n.next = head;
        return n;
    }
}
