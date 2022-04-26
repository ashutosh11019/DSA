package Stack;

class SLinkedList<E> {
    Node<E> head;

    public void add(E data) {
        Node<E> toAdd = new Node<>(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }
        Node<E> temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public void print() {
        Node<E> temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public boolean isEmpty() {
        return head==null;
    }

    public E removeLast() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("Empty");
        }
        if (temp.next==null) {
            Node<E> toRemove = temp.next;
            temp.next = null;
            return toRemove.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }

    public E getLast() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("Empty");
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public static class Node<E> {
        E data;
        Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}

class MyStacks<E> {
    private SLinkedList<E> ll = new SLinkedList<>();

    void push(E e) {
        ll.add(e);
    }

    E pop() throws Exception {
        if (ll.isEmpty()) {
            throw new Exception("empty");
        }
        return ll.removeLast();
    }

    E peek() throws Exception{
        if (ll.isEmpty()) {
            throw new Exception("empty");
        }
        return ll.getLast();
    }
}

public class MyStack {
    public static void main(String[] args) throws Exception {
        MyStacks<Integer> stack = new MyStacks<>();
        stack.push(15);
        stack.push(35);
        stack.push(25);

        int popped = stack.pop();
        System.out.println(popped);

        int peekped = stack.peek();
        System.out.println(peekped);
    }
}
