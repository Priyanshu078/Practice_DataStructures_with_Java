package LinkedList;

public class DeleteHead {
    static Node delHead(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }
}
