package com.github.onlynight.datastructure;

/**
 * <b>循环队列</b>
 * 循环队列数组实现
 */
public class CycleQueue {
    private final int[] data;
    private int front;
    private int rear;
    private final int capacity;

    public CycleQueue(int capacity) {
        this.capacity = capacity + 1;
        data = new int[this.capacity];
        front = rear = 0;
    }

    public boolean join(int value) {
        if ((rear + 1) % capacity == front) {
            return false;
        }

        data[rear] = value;
        rear = (rear + 1) % capacity;

        return true;
    }

    public int dequeue() {
        if (front == rear) {
            return -1;
        }

        int value = data[front];
        front = (front + 1) % capacity;

        return value;
    }

    public static void main(String[] args) {
        CycleQueue queue = new CycleQueue(5);
        System.out.println(queue.join(1));
        System.out.println(queue.join(2));
        System.out.println(queue.join(3));
        System.out.println(queue.join(4));
        System.out.println(queue.join(5));
        System.out.println(queue.join(6));
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println(queue.join(7));
        System.out.println(queue.join(8));
        System.out.println(queue.join(9));
        System.out.println(queue.join(10));
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
    }
}
