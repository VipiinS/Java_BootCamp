package LinkedList;

public class LL {

    private Node head;
    private Node tail;
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


    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(13);
        list.insertFirst(1);
        list.insertFirst(33);
        list.insertLast(10);
        list.insertLast(67);
        list.insertLast(45);
        list.insert(5,2);
        list.display();
        System.out.println(list.deleteLast());
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println("removing " + list.delete(1));
        list.display();
        list.deleteOccurrence(10);
        list.display();
    }
}
