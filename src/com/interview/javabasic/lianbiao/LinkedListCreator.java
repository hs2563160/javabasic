package com.interview.javabasic.lianbiao;

import java.util.List;

public class LinkedListCreator {
    //int i=0;
    //int j=0;
    //构建函数
    public Node createLinkedList(List<Integer> list){
        if (list.isEmpty()){
            return null;
        }
        //System.out.println("j="+"----------------"+j++);
        Node headNode = new Node(list.get(0));
        Node tempNode = createLinkedList(list.subList(1, list.size()));
        headNode.setNode(tempNode);
        //System.out.println("i="+"----------------"+i++);
        return headNode;
    }

    //测试方便的打印函数
    public void printList(Node node){
        while (node != null){
            System.out.print(node.getValue());
            System.out.print(" ");
            node = node.getNode();
        }
        System.out.println();
    }
}

