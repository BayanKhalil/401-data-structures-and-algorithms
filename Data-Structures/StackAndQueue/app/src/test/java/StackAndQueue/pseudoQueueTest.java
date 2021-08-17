package StackAndQueue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.*;
public class pseudoQueueTest {


    @DisplayName("enqueue for pseudoQueueTest ")
    @Test
    public void enqueue() {
        pseudoQueue pseudoQueueTest = new pseudoQueue();
        pseudoQueueTest.enqueue(100);
        int expected=100;
        assertEquals(expected, pseudoQueueTest.peek());
    }


    @Test
    void exceptionTesting() {

        pseudoQueue pseudoQueueTest = new pseudoQueue();
        pseudoQueueTest.enqueue(100);
        pseudoQueueTest.dequeue();
        pseudoQueueTest.peek();

        Throwable exception = assertThrows(NoSuchElementException.class, () -> {
            throw new NoSuchElementException("no element in the queue");
        });
        assertEquals("no element in the queue", exception.getMessage());

    }



}
