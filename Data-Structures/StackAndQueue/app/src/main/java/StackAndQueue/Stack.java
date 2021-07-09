package StackAndQueue;

import java.util.EmptyStackException;

public class Stack <T> {

     Node <T> top;

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else
            return false;
    }

    public void push(T value) {
        Node <T>newNode = new Node<T>(value);

        if (top == null) {
            top = newNode;
        } else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println(value + " pushed to stack");
    }

    public T pop() {
        if(top == null) {
            throw new EmptyStackException();
        } else {
            Node<T> temp = top;
            top = top.next;
            return temp.value;
        }
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();

        } else {
            return top.value;
        }

    }
}

