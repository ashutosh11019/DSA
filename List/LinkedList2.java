package List;

class SLinkedList {
    Node head;

    void add(int data) {
        Node toAdd = new Node(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    boolean isEmpty() {
        return head==null;
    }

    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}

public class LinkedList2 {
    

    public static void main(String[] args) {
        SLinkedList l = new SLinkedList();
        l.add(12);
        l.add(56);
        l.print();
    }
}