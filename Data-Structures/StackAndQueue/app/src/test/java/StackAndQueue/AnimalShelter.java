package StackAndQueue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
public class AnimalShelter {

    @DisplayName("enqueue Dog")
    @Test
    public void test1() {
        Dog testDog = new Dog("doggy");
        Queue<Dog> testDogQ = new Queue<>();
        testDogQ.enqueue(testDog);
        String expected="doggy";

        assertEquals(expected,testDogQ.peek());
    }

    @DisplayName("exception Testing")
    @Test
    public void test2() {
        Dog dog1 = new Dog("dog");
        Cat cat1 = new Cat("cat");
        AnimalShelter Shelter = new AnimalShelter();
        Shelter.enqueue(dog1);
        Shelter.enqueue(cat1);
        Shelter.dequeue("tiger");
        Throwable exception = assertThrows(NoSuchElementException.class, () -> {
            throw new NoSuchElementException("This shelter Just For dogs and cats");
        });
        assertEquals("This shelter Just For dogs and cats", exception.getMessage());

    }

    private void enqueue(Dog dog1) {
    }
    private void enqueue(Cat cat1) {
    }

    private void dequeue(String pref) {
    }


}
