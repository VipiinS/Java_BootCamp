package LinkedList;

public class DLL {
    private Node head;
    public Node tail;
    int size;

    public DLL() {
        // by default the head and tail will be null, so they need not be initialised here

        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        if(last == null){
            node.prev = null;
            head = node;
            return;
        }
        // if tail is not used,we iterate through the list
        while(last.next != null){
            last = last.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;
        tail = node;
        size++;
        /*
        if tail was given:
            node.next = null;
            tail.next = node;
            node.prev = last;
            tail = node;
         */
    }

    public void insert(int after, int val){
//        if(index == 0){
//            insertFirst(val);
//            return;
//        }
//        if(index == size - 1){
//            insertLast(val);
//            return;
//        }
        Node node = new Node(val);
        Node previous = find(after);
        if(previous == null){
            System.out.println("value not found in list");
        }
         node.next = previous.next;
         previous.next = node;
         node.prev = previous;
         if(node.next != null) {
             node.next.prev = node;
         }
         size++;
    }

    private Node get(int index){
        DLL.Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    private Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value)
                return node;
            node = node.next;
        }
        return null;
    }
    public void display(){
        DLL.Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        DLL.Node temp = head;
        Node last = null;
        while(temp != null){
//            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }

    public void displayRevRecursion(){
        Node temp = head;
        displayRevRec(temp);
        System.out.println("END");
    }
    private void displayRevRec(Node temp) {
        if(temp == null)
            return;
        displayRevRec(temp.next);
        System.out.print(temp.val + " -> ");
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.insertLast(6);
        list.display();
        list.insert(4,4);
        list.display();
//        list.displayRev();
//        list.displayRevRecursion();
    }
}
