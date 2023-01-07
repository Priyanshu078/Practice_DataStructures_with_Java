package LinkedList;

public class LinkedLists {

    public static void main(String[] args) {
//        LinkedList1.linked();
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        head = InsertAtBegin.insetAtBegin(head,5);
        head = InsertAtBegin.insetAtBegin(head,10);
        head = InsertAtBegin.insetAtBegin(head,15);
        head = InsertAtEnd.insertAtEnd(head,30);
        head = DeleteHead.delHead(head);
        head = DeleteLast.deleteLast(head);
        head = InsertAtPosition.insertAtPosition(head,12,11);
        int n = SearchingInLinkedList.searchKey(head,0);
        System.out.println(n);
        Node curr = head;
        while (curr != null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
}
