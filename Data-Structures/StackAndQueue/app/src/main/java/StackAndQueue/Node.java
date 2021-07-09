package StackAndQueue;

public class Node <T> {

//    public static final T MIN_VALUE =0 ;
        public T value;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

}
