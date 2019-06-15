package com.interview.javabasic.my;

public class MyNode {

    private Node head;
    private Node last;
    private int size;

    public MyNode(){

        this.head=new Node(null);
        this.last=new Node(null);
        this.size=0;
    }

    public int size(){

        return size;
    }
    public void addfirst(Object object){

        Node node = new Node(object);

        node.next=head;

        head = node;

        size++;
    }

    public Object getfirst(){

        return head.object;
    }

    public Object removefirst(){
        Object o = head.object;
        head = head.next;
        return  o;
    }

    class Node{

        private Object object;
        private Node next;

        public Node(Object object){
            this.object=object;
        }

    }
}
