package LinkedList;

public class SearchingInLinkedList {

    // iterative
//    static int searchKey(Node head, int key){
//        int pos = 1;
//        Node curr = head;
//        while(curr != null){
//            if(curr.data == key){
//                return pos;
//            }
//            curr = curr.next;
//            pos++;
//        }
//        return -1;
//    }

    // recursive
    static int searchKey(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key) {
            return 1;
        }
        int res = searchKey(head.next,key);
        if (res == -1) { return -1;}
        return res + 1;
    }
}
