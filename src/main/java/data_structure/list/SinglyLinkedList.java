package data_structure.list;

public class SinglyLinkedList<T> {

    private Node head = null;
    private Node tail = null;

    private class Node{
        T data;
        Node next;
        Node prep;
    }

    public SinglyLinkedList(){
        head = new Node();
        tail = new Node();
    }

    public void put(T data){

        Node node = new Node();

        node.data = data;

        if(head.next != null) {
            node.next = tail;
            node.prep = tail.prep;
        } else {
            head.next = node;
        }
        tail.prep = node;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node node = head.next;

        while(node!=null){
            stringBuilder.append(node.data).append(" ");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
