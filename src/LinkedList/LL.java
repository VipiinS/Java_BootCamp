package LinkedList;

public class LL {

    public Node head;
    public Node tail;
    private int size;

    public LL() {
        // by default the head and tail will be null so they need not be initialised here

        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = get(index - 1);
        Node node = new Node(val,temp.next);
        temp.next = node;
    }

    public int deleteFirst(){
        int removedVal = head.val;
        head = head.next;
        if(head == tail)
            tail = null;
        return removedVal;
    }
    public int deleteLast(){
        Node secondLast = get(size - 1);
        int removedValue = tail.val;
        tail = secondLast;
        tail.next = null;
        return removedValue;
    }
    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size - 1){
            deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }
    public void deleteOccurrence(int val){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.val == val){
                break;
            }
            index++;
            temp = temp.next;
        }
        System.out.println("removed "+ delete(index));
    }

    // remove duplicates in a sorted list.
    public Node removeDuplicates(Node head){
        Node n = head;
        if(n == null){
            return n;
        }
        while(n.next != null){
            if(n.val == n.next.val){
                n.next = n.next.next;
            }
            else{
                n = n.next;
            }
        }
        return head;
    }
//    public Node merge(Node list1, Node list2){
//        Node dummyHead = new Node(); // creating a new node to return its head
//        Node tail = dummyHead; // referencing the head to a node to add sorted nodes
//        while(list1 != null && list2 != null){ // until one of the node is null
//
//            if(list1.val < list2.val){ // if list1 is greater
//                tail.next = list1; // add it to the list
//                list1 = list1.next; // move the list
//                tail = tail.next; // move the tail by one.
//            }
//            else{
//                tail.next = list2;
//                list2 = list2.next;
//                tail = tail.next;
//            }
//        }
//        // the above loop ends when one of the list reached null
////        while(list1 != null){
////            tail.next = list1;
////            list1 = list1.next;
////            tail = tail.next;
////        }
////        while(list2 != null){
////            tail.next = list2;
////            list2 = list2.next;
////            tail = tail.next;
////        }
//        // the tail.next will be equal to the list which is longer
//        tail.next = (list1 != null) ? list1 : list2;
//        return dummyHead.next;
//    }
    public Boolean isCyclic(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
//    Node mid(Node head) {
//        Node midPrev = null;
//        while (head != null && head.next != null) {
//            midPrev = (midPrev == null) ? head : midPrev.next;
//            head = head.next.next;
//        }
//        Node mid = midPrev.next;
//        midPrev.next = null;
//        return mid;
//    }
//    public Node getMid(Node head){
//        Node slow = head;
//        Node fast = head;
//        while(fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow)
//                break;
//        }
//        return slow;
//    }
//    public Node sortRecursive(Node head){
//        if(head == null || head.next== null)
//            return head;
//        Node mid = mid(head);
//        Node right = sortRecursive(mid);
//        Node left = sortRecursive(head);
//
//        return merge(left,right);
//
//    }
    private Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    public static class Node{
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
        public Node() {
        }
    }
    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = mid(head);
        head.next = null;
        Node left = sortList(head);
        Node right = sortList(mid);

        return merge(left, right);
    }

    Node merge(Node list1, Node list2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
    public Node mid(Node head) {
        // uses fast and slow pointer
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public LL.Node mergesort(LL.Node head){
        if(head == null || head.next == null)
            return head;
        LL.Node temp = head;
        LL.Node slow = head;
        LL.Node fast = head;
        // to find the mid of the list
        while(fast != null && fast.next != null){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        temp.next = null;
        LL.Node left = mergesort(head);
        LL.Node right = mergesort(slow);

        return merge(left,right);
    }
    private void bubbleSort() {
        int length = 0;
        Node temp = head;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        bubbleSort(length-1,0);
    }

    public void bubbleSort(int row, int col){
        if(row == 0)
            return;

        if(col < row){
            Node first = get(col);
            Node second = get(col + 1);

            if(first.val > second.val) {
                //swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node previous = get(col - 1);
                    previous.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node previous = get(col - 1);
                    previous.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        }
        else {
            bubbleSort(row - 1,0);
        }
    }
    public void reverseRecursive(Node node){
        if(node.next == null){
            head = tail;
            return;
        }
        reverseRecursive(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public Node reverse(Node head){
        Node present = head;
        Node previous = null;
        Node next = present.next;

        while(present != null){
            present.next = previous;
            previous = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = previous;
        return head;
    }
    public Node reverseBetween(Node head,int left,int right){
            if(left == right){
                return head;
            }
            Node previous = null;
            Node current = head;
            // we are moving the current pointer till the left index
            for (int i = 0; current != null && i < left-1; i++) {
                previous = current;
                current = current.next;
            }
            // we are assigning previous to last so that we can make last.next to the right.next index at the end of reversal
            Node last = previous;
            Node newEnd = current;
            Node next = current.next;
            for (int i = 0; i < right - left + 1; i++) {
                current.next = previous;
                previous = current;
                current = next;
                if(next != null) {
                    next = next.next;
                }
            }
            // after the reversal the current will be in right.next index, previous will be in right index

            //if the link doesn't contain a last,i.e. if the left starts from head, we put the last as head, or we put last.next = previous
            if(last != null)
                last.next = previous;
            else
                head = previous;
            // assigning the newEnd,i.e. the left - 1 index to the right -1 index.
            newEnd.next = current;
            return head;
    }
    public boolean palindrome(Node head){
        // find the middle node,and make it second head to reverese and then transverse from.
        Node newMid = mid(head);
        Node secondHead = reverse(newMid);
        // until one of the nodes reach null transverse it till it the values doesn't match and return false

        while(head != null && secondHead != null){
            if(head.val != secondHead.val)
                return false;
            head= head.next;
            secondHead = secondHead.next;
        }
        // if the loop completes without returning then it's a palindrome.
        return true;
    }

    public void reorder(Node head){
        Node mid = mid(head);
        Node hs = reverse(mid); // hs is headSecond
        Node hf = head; // hf is headFirst;

        while(hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null){
            hf.next = null;
        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
//        list.display();
//        list.reverseRecursive(list.head);
//        list.display();
        list.reverse(list.head);
        list.display();

    }


}
