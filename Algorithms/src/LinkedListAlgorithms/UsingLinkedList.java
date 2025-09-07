package LinkedListAlgorithms;

import java.util.LinkedList;

public class UsingLinkedList {

    public static void main(String[] args) {
        LinkedList<String> listy = new LinkedList<>();
        listy.add("Becky");
        listy.add("Sally");
        listy.add("Nick");
        listy.add("Jack");
        listy.add("Rachel");

        System.out.println(listy.contains("Becky"));
        System.out.println(listy.size());

        listy.removeFirst();

        listy.forEach(x -> System.out.println(x));
    }
}
