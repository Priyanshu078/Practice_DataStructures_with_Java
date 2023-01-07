package LinkedList;

public class InsertAtBeginDoubly {
    static Doublynode insertAtBegindoubly(Doublynode head,int d){
        Doublynode node = new Doublynode(d);
        node.next = head;
        head.prev = node;
        return node;
    }
}
