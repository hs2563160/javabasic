package com.interview.javabasic.paixun;

import java.util.Arrays;

public class SingleLinkedList<E> {

    private Node<E> fist;
    private Node<E> last;
    private int size;

    /**
     * 增
     *
     * @param e
     * @return
     */
    public boolean add(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<E>(e, null);
        last = newNode;
        if (l == null) {
            fist = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
    }

/*    public boolean removeAll(Object o) {
        boolean flag = false;
        while (remove(o)) {
            flag = true;
        }
        return flag;
    }*/

    public boolean removeAll(Object o) {
        boolean flag = false;
        Node<E> preNode = null;
        for (Node<E> eNode = fist; eNode != null; eNode = eNode.next) {
            E item = eNode.item;
            if (o.equals(item)) {
                if (preNode == null) {
                    //第一个位置
                    fist = eNode.next;
                    size--;
                    flag = true;
                    continue;
                }
                Node<E> next = eNode.next;
                preNode.next = next;
                if (next == null) {
                    // 最后一个位置
                    last = preNode;
                }
                size--;
                flag = true;
                continue;
            }
            preNode = eNode;
        }
        return flag;
    }

    /**
     * 删
     *
     * @param o
     * @return
     */
    public boolean remove(Object o) {
        Node<E> eNode = this.fist;
        Node<E> preNode = null;
        for (int i = 0; i < size; i++) {
            E item = eNode.item;
            if (o.equals(item)) {
                if (preNode == null) {
                    //第一个位置
                    fist = eNode.next;
                    size--;
                    return true;

                }

                Node<E> next = eNode.next;
                preNode.next = next;
                if (next == null) {
                    // 最后一个位置
                    last = preNode;
                }
                size--;
                return true;
            }
            preNode = eNode;
            eNode = eNode.next;
        }
        return false;
    }

    /**
     * 替换，返回旧值
     * 改
     *
     * @param index
     * @param e
     * @return
     */
    public E set(int index, E e) {
        Node<E> eNode = find(index);
        E olditem = eNode.item;
        eNode.item = e;
        return olditem;
    }

    /**
     * 插入
     *
     * @param index
     * @param e
     * @return
     */
    public boolean add(int index, E e) {
        if (index > size) {
            throw new IndexOutOfBoundsException("超出长度");
        }
        if (index == 0) {
            final Node<E> f = fist;
            Node<E> newNode = new Node<E>(e, null);
            newNode.next = f;
            fist = newNode;
            size++;
            return true;
        }
        if (index == size) {
            final Node<E> l = last;
            last = new Node<E>(e, null);
            l.next = last;
            size++;
            return true;
        }
        Node<E> preNode = find(index - 1);
        Node<E> latNode = preNode.next;
        Node<E> newNode = new Node<E>(e, latNode);

        preNode.next = newNode;
        size++;
        return true;
    }

    /**
     * 查
     *
     * @param index
     * @return
     */
    public E get(int index) {
        Node<E> eNode = find(index);
        if (eNode != null) {
            return eNode.item;
        }
        return null;
    }

    public Node<E> find(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("超出长度");
        }
        int i = 0;
        Node<E> node = fist;
        while (i++ < index) {
            node = node.next;
        }
        return node;
    }

    public int size() {
        return size;
    }

    public Object[] toArray() {
        Object[] objects = new Object[size];
        int i = 0;
        for (Node<E> eNode = fist; eNode != null; eNode = eNode.next) {
            objects[i++] = eNode.item;
        }
        return objects;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }



    public static void main(String[] args) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<Integer>();

        //新增
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        Object[] objects = linkedList.toArray();
        System.out.println(Arrays.toString(objects));

        //插入
        linkedList.add(2, 8);
        //修改
        linkedList.set(1, 9);
        objects = linkedList.toArray();
        System.out.println(linkedList.size());
        System.out.println(Arrays.toString(objects));

        //查询
        System.out.println(linkedList.get(2));

        //删除

        linkedList.remove(5);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(10);
        linkedList.add(1);
        linkedList.removeAll(1);
        linkedList.add(17);
        objects = linkedList.toArray();
        System.out.println(linkedList.size());
        System.out.println(Arrays.toString(objects));

    }


}

