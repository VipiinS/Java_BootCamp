package LinkedList.Leetcode.Easy;

import LinkedList.LL;

public class binaryToInt extends LL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(0);
        System.out.println(ans(list.head));
    }

    private static int ans(Node head) {
        StringBuilder str = new StringBuilder();
        while(head != null){
            str.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(String.valueOf(str),2);
    }
}
