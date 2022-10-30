package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int value){
//        Node prev = find(value);
        Node node = head;
        if(node == null) return;
        if(node.val == value){
            head = head.next;
            tail.next = head;
        }
        do{
            Node n = node.next;
            if(n.val == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    private Node find(int value) {
        Node temp = head;
        if(temp != head){
            do{
                if(temp.val == value)
                    return temp;
                temp = temp.next;
            }while (temp != tail);
        }
        return null;
    }

    public void display(){
        Node temp = head;
        if(temp != null){
            do{
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while(temp != head);
            System.out.println("HEAD");
        }
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.display();
        list.delete(3);
        list.display();

    }
}
