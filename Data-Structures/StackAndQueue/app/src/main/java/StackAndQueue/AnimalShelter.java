package StackAndQueue;

import java.util.NoSuchElementException;

public class AnimalShelter {




//    public class Cat extends Animal  {
//        public Cat(String name){
//            super(name);
//        }

    Queue <Cat> QueueCat = new Queue<>();
    Queue <Dog> QueueDog = new Queue<>();


    public void enqueue (Cat cat){
        QueueCat.enqueue(cat);

    }

    public void enqueue (Dog dog){
        QueueDog.enqueue(dog);
    }

    public Animal dequeue (String pref) {
        if (pref.equals("cat")) {
            return QueueCat.dequeue();
        } else if (pref.equals("dog")) {
            return QueueDog.dequeue();
        } else {
            throw new NoSuchElementException("This shelter Just For dogs and cats");
//            System.out.println("no animal like this");
        }

    }

}
