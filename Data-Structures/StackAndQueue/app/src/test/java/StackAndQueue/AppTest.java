/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  public void PushtoStack() {
      Stack stack = new Stack();
      stack.push(44);
      int expected=44;
      assertEquals(expected,stack.peek());

  }

    @Test
    public void pushMultipleValues(){
        Stack stack = new Stack();
        stack.push(44);
        stack.push(33);
        stack.push(2);
        stack.push(90);
        int expected=90;
        assertEquals(expected,stack.peek());

    }
    @Test
    public void popOfStack(){
        Stack stack = new Stack();
        stack.push(44);
        stack.push(33);
        stack.push(2);
        stack.push(90);
        stack.pop();
        int expected=2;
        assertEquals(expected,stack.peek());

    }
    @Test
    public void emptyStackAfterMultiplePops(){
        Stack stack = new Stack();
        stack.push(44);
        stack.push(33);
        stack.pop();
        stack.pop();
        boolean expected=true;
        assertEquals(expected,stack.isEmpty());

    }

    @Test
    public void  peekTheNextItemOnTheStack(){
        Stack stack = new Stack();
        stack.push(44);
        stack.push(33);
        stack.pop();
        int expected=44;
        assertEquals(expected,stack.peek());
    }

    @Test
    public void  instantiateAnEmptyStack(){
        Stack stack = new Stack();
        boolean expected=true;
        assertEquals(expected,stack.isEmpty());
    }

//    @Test(expected=EmptyStackException.class)
    public void  popAndPeakRaisesException(){
        Stack stack = new Stack();
        stack.push(44);
        stack.push(33);
        stack.pop();
        stack.pop();
        stack.pop();
    }
//   >>>>>>>>>>>>>>>>>>>.QUEUE TEST<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @Test
    public void enqueueIntoQueue() {
        Queue queue = new Queue();
        queue.enqueue(44);
        int expected=44;
        assertEquals(expected,queue.peek());

    }
    @Test
    public void enqueueMultipleValues(){
        Queue queue = new Queue();
        queue.enqueue(44);
        queue.enqueue(33);
        queue.enqueue(2);
        queue.enqueue(90);
        int expected=44;
        assertEquals(expected,queue.peek());

    }
    @Test
    public void dequeueOfQueue(){
        Queue queue = new Queue();
        queue.enqueue(44);
        queue.enqueue(33);
        queue.enqueue(2);
        queue.enqueue(90);
        queue.dequeue();
        int expected=44;
        assertEquals(expected,queue.peek());

    }
    @Test
    public void  peekQueue(){
        Queue queue = new Queue();
        queue.enqueue(44);
        queue.enqueue(33);
        queue.dequeue();
        int expected=33;
        assertEquals(expected,queue.peek());
    }
    @Test
    public void emptyQueueAfterMultipleDequeues(){
        Queue queue = new Queue();
        queue.enqueue(44);
        queue.enqueue(33);
        queue.dequeue();
        queue.dequeue();
        boolean expected=true;
        assertEquals(expected,queue.isEmpty());

    }
    @Test
    public void  instantiateAnEmptyQueue(){
        Queue queue = new Queue();
        boolean expected=true;
        assertEquals(expected,queue.isEmpty());
    }

    //    @Test(expected=EmptyStackException.class)
    public void  dequeueAndPeakRaisesException(){
        Queue queue = new Queue();
        queue.enqueue(2);
        queue.enqueue(90);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }


}
