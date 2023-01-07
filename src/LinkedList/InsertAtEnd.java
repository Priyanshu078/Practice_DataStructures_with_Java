package LinkedList;

public class InsertAtEnd {

    static Node insertAtEnd(Node head,int x){
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = new Node(x);
        return head;
    }
}
