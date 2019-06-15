package com.interview.javabasic.lianbiao;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        Node node = linkedListCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        Node node2 = linkedListCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        //Node node3 = linkedListCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        Reverser reverser = new Reverser();

       // Node res = reverser.reverserLinkedList(node);
        Node res2 = reverser.reverserLinkedListTwo(node2);
//
//
//        linkedListCreator.printList(res);
//        linkedListCreator.printList(res2);
//
//        ArrayList l = new ArrayList();
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
//        l.add("huangshuai");
    }


}
