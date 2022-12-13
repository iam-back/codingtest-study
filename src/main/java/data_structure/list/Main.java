package data_structure.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<String> stringSinglyLinkedList = new SinglyLinkedList<>();

        stringSinglyLinkedList.put("apple");
        stringSinglyLinkedList.put("orange");
        stringSinglyLinkedList.put("graph");

        System.out.println(stringSinglyLinkedList.toString());

        List<String> stringList = new ArrayList<>();


    }
}
