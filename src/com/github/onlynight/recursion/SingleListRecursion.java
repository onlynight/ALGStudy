package com.github.onlynight.recursion;

public class SingleListRecursion {

    private Node head;
    private Node tail;

    public void add(int data) {
        Node node = null;
        if (head == null) {
            head = new Node();
            node = head;
            tail = head;
        } else {
            node = new Node();
        }

        node.data = data;
        tail.next = node;
        tail = node;
    }

    /**
     * 会移动头指针，使用后头指针会向后移动。
     *
     * @return next node value
     */
    public Node next() {
        if (tail != null) {
            Node node = head;
            head = head.next;
            return node;
        }

        return null;
    }

    public void nextPrintHead(Node from) {
        System.out.println(from.data);
        if (from.next != null) {
            nextPrintHead(from.next);
        }
    }

    public void nextPrintTail(Node from) {
        if (from.next != null) {
            nextPrintTail(from.next);
        }
        System.out.println(from.data);
    }

    public void printFromHead() {
        Node temp = head;
        nextPrintHead(temp);
    }

    public void printFromTail() {
        Node temp = head;
        nextPrintTail(temp);
    }

    public void count() {
    }

    public static void main(String[] args) {
        SingleListRecursion list = new SingleListRecursion();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printFromHead();
        list.printFromTail();
    }

    public static class Node {
        public int data;
        public Node next;
    }

}
