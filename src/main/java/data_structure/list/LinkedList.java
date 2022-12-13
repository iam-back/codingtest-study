package data_structure.list;

import java.util.concurrent.atomic.AtomicLong;

public class LinkedList<T> {

    private Node head;
    private Node tail;

    private class Node{

        private Node next;
        private Node prep;
        private T data;

        public Node(T data){
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrep() {
            return prep;
        }

        public void setPrep(Node prep) {
            this.prep = prep;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public void add(T data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;

        }
    }
    private AtomicLong atomicLong;
}
