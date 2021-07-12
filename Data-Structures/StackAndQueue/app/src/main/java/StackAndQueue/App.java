/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

//        Stack stack = new Stack();
//
//        stack.push(44);
//        stack.push(55);
//        stack.push(66);
//        stack.push(77);
//
//        System.out.println(stack.pop()
//                + " popped from stack");
//        System.out.println(stack.pop()
//                + " popped from stack");
//        System.out.println(stack.pop()
//                + " popped from stack");
//        System.out.println(stack.pop()
//                + " popped from stack");
//        System.out.println(stack.pop()
//                + " popped from stack");

//
//        System.out.println("Top element is " + stack.peek());
//        System.out.println(stack.isEmpty());

//        Queue queue = new Queue();
//
//        System.out.println(queue.isEmpty());
//        queue.enqueue("3");
//        queue.enqueue("6");
//        queue.enqueue("5");
//        queue.enqueue("2");
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.dequeue()+ " dequeue from Queue");
//        System.out.println("Top element is " + queue.peek());
//
//        pseudoQueue pseudoQueue= new pseudoQueue();
//        pseudoQueue.enqueue(100);
//        pseudoQueue.enqueue(500);
//        pseudoQueue.enqueue(300);
//        System.out.println("Top element is " + pseudoQueue.peek());
//        System.out.println( pseudoQueue.dequeue());


        Cat cat1 = new Cat("kitty");
        Queue<Cat> catQueue = new Queue<>();

        catQueue.enqueue(cat1);
        System.out.println( catQueue.peek());

        Dog dog1 = new Dog("doggy");
        Queue<Dog> dogQueue = new Queue<>();

        dogQueue.enqueue(dog1);
//        System.out.println( dogQueue.peek());



        Dog dog2= new Dog("dequeueDog");

        AnimalShelter Shelter = new AnimalShelter();
        Shelter.enqueue(dog2);
        Shelter.dequeue("dog");
        Shelter.dequeue("tiger");



    }
}
