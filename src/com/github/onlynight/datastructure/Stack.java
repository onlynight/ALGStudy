package com.github.onlynight.datastructure;

public class Stack {

    private Node top;

    public void push(int value) {
        if (top == null) {
            top = new Node();
        } else {
            Node newNode = new Node();
            newNode.next = top;
            top = newNode;
        }
        top.value = value;
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int value = top.value;
        top = top.next;
        return value;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
