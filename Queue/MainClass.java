package Queue;

import List.MyLinkedList.Node;

class Myqueue<E> {

    private Node<E> head, rear;

    public void enqueue(E e){
        Node<E> toAdd = new Node<E>(e);
        if(head==null){
            head = rear = toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }

    public E dequeue(){
        if(head==null){
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        if(head==null){
            rear=null;
        }
        return temp.data;
    }

}

public class MainClass {
    public static void main(String[] args) {
        Myqueue<Integer> q = new Myqueue<>();
        q.enqueue(12);
        q.enqueue(24);
        q.enqueue(75);

        System.out.println(q.dequeue());
    }
}
