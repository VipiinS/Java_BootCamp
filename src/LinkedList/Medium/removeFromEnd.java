package LinkedList.Medium;

import LinkedList.LL;

public class removeFromEnd extends LL {
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 1; i < 6; i++) {
            list.insertLast(i);
        }
//        list.display();
        list.removeFromEndIndex(list.head,2);
//        list.display();
    }

//    public void removeFromEndIndex(Node head,int index){
//
//    }

}
