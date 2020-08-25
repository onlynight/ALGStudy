package com.github.onlynight.datastructure;

public class Queue {
    private Node front;
    private Node rear;

    public void join(int value) {
        if (front == null) {
            front = new Node();
            rear = front;
        } else {
            Node newNode = new Node();
            newNode.next = front;
            front.pre = newNode;
            front = newNode;
        }
        front.value = value;
    }

    public int enqueue() {
        if (rear == null) {
            return -1;
        }

        int value = rear.value;
        rear = rear.pre;
        if (rear == null) {
            front = null;
        }
        return value;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.join(1);
        queue.join(2);
        System.out.println(queue.enqueue());
        queue.join(3);
        queue.join(4);
        System.out.println(queue.enqueue());
        System.out.println(queue.enqueue());
        System.out.println(queue.enqueue());
        queue.join(5);
        System.out.println(queue.enqueue());
        System.out.println(queue.enqueue());
        System.out.println(queue.enqueue());
    }

}
