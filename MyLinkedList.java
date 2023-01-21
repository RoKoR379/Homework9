package homework9;

public class MyLinkedList {
    class Node {
        Object item;
        Node previous;
        Node next;
        public Node(Object item) {
            this.item = item;
        }
    }
    Node head, tail = null;
    public int size = 0;
    public int size() {
        return size;
    }
    public void add(Object value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
        size++;
    }

    public void remove(int index){
        if (head == null || index <= 0){
            return;
        }
        Node current = head;
        int i;
        for(i = 0; i < index; i++){
            current = current.next;
        }
        if(current == head){
            head = current.next;
        } else if (current == tail) {
            tail = tail.previous;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }
    public void printNodes() {
        Node current = head;
        if(head == null) {
            System.out.println("\nDoubly linked list is empty");
            return;
        }
        System.out.println("\nNodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
    }
    public void clear() {

        Node temp = new Node(null);

        while(this.head != null) {
            temp = this.head;
            this.head = this.head.next;
            temp = null;
            size--;
        }
    }


    public void get(int index) {
        int i = 0;
        boolean flag = false;

        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {

            if(index == i) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if(flag)
            System.out.println(current.item);
        else
            System.out.println("Node is not present in the list");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);
        list.get(2);
        list.printNodes();
        list.clear();
        list.printNodes();
        System.out.println("\nlist.size() = " + list.size());

    }
}