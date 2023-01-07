package LinkedList;

public class InsertAtPosition {
    static Node insertAtPosition(Node head, int index,int data){
        int pos = 1;
        if(pos == index){
            Node temp = new Node(data);
            temp.next = head.next;
            return temp;
        }
        Node curr = head;
        while(curr.next != null){
            if((pos+1) == index){
                Node n = new Node(data);
                Node temp = curr.next;
                curr.next = n;
                n.next = temp;
                return head;
            }
            curr = curr.next;
            pos++;
        }
        return head;
    }
}
