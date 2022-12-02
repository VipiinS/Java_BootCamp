package LinkedList.Leetcode.Easy;

import LinkedList.LL;

import javax.print.DocFlavor;

public class addTwoNumbers extends LL {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertLast(2);
        list1.insertLast(4);
        list1.insertLast(3);
        list1.display();
        LL list2 = new LL();
        list2.insertLast(5);
        list2.insertLast(6);
        list2.insertLast(4);
        list2.display();
        Node dummyHead1 = list1.head;
        Node dummyHead2 = list2.head;
        String str1 = convertToString(dummyHead1, new StringBuilder(""));
        System.out.println(str1);
        String str2 = convertToString(list2.head,new StringBuilder(""));
        System.out.println(str2);
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);
        int num2 = Integer.parseInt(str2);
        System.out.println(num2);
        int num = num1+num2;
//        Math.pow()
        LL ans = new LL();
        while(num > 0){
                Integer rem = num % 10;
                ans.insertFirst(rem);
                num /= 10;
        }
        ans.reverseRecursive(ans.head);
    }

    private static String convertToString(Node head, StringBuilder str) {
        if(head == null)
                return "";
        convertToString(head.next,str);
        return String.valueOf(str.append(head.val));
    }


    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy_head = new Node(0);
        Node ans = dummy_head;
        int carry = 0;
        while(l1 != null || l2 != null){
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;

            int currSum = num1 + num2 + carry;
            carry = currSum / 10;
            currSum %= 10;

            Node node = new Node(currSum);
            ans.next = node;
            ans = ans.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry >0){
            Node node = new Node(carry);
            ans.next = node;
            ans = ans .next;
        }
        return dummy_head.next;
    }

}
