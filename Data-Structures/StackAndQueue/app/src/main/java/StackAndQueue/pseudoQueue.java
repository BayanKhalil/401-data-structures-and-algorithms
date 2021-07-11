package StackAndQueue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class pseudoQueue<T> {


    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();


    public void enqueue(T value){
        stack1.push(value);
    }

    public T dequeue() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }

        }
        return stack2.pop();
    }


    public T peek() throws NoSuchElementException {
        if (stack1.top == null) {
            throw new NoSuchElementException();
        } else {
            return stack1.top.value;
        }
    }
}
