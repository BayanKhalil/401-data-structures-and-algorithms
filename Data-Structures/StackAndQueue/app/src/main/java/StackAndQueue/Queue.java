package StackAndQueue;

import java.util.EmptyStackException;

public class Queue<T> {

    Node<T> front;
    Node<T> back;

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else
            return false;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<T>(value);
        if(back == null&& front==null) {
            front = newNode;
            back = newNode;
        } else {
            // tell the last node to point to the new node
           back.next = newNode;
            // tell back to point to the new node.
            back = newNode;
        }
        System.out.println(value + " enqueue to queue");
    }
    public T dequeue() {
        Node<T> temp = front;
        if(back == null) {
            throw new EmptyStackException();
        }
       front = front.next;
        if(front == null) {
           back = null;
        }
        return temp.value;
    }

    public T peek()  {
        if (front == null) {
            throw new EmptyStackException();
        } else {
            return front.value;
        }

    }
}
