package LinkedList;

public class mergeSort {
    public static void main(String[] args) {
        LL list2 = new LL();
        list2.insertLast(2);
        list2.insertLast(1);
        list2.insertLast(4);
        list2.insertLast(6);
        list2.insertLast(7);
        list2.insertLast(25);
        list2.insertLast(5);
        list2.display();
        System.out.println(list2.mid(list2.head).val);
//        list2.mergesort
        list2.display();
    }
    public LL.Node mergesort(LL.Node head){
        LL.Node temp = head;
        LL.Node slow = head;
        LL.Node fast = head;
        while(fast != null || fast.next != null){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        temp.next = null;

        LL.Node left = mergesort(head);
        LL.Node right = mergesort(slow);

        return merge(left,right);
    }

    private LL.Node merge(LL.Node left, LL.Node right) {
        LL.Node ans = new LL.Node();
        LL.Node tail = ans;
        while (left != null && right != null) {
            if(left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        tail.next = (left != null) ? left : right;
        return ans.next;
    }
}
