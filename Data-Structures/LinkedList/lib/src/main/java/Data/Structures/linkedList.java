package Data.Structures;

public class linkedList {



    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;

        }
    }



    Node head = null;

    public void insert(int value) {
        if (this.head == null) {
            head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public boolean includes(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }


    public void append(int value) {
        Node currNode = this.head;
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void insertBefore(int value, int newVal) {

        Node newNode = new Node(value);
        Node curr = head;
        newNode.value = newVal;

        if (head.value == value) {
            newNode.next = head;
            head = newNode;
        }
        while (curr.next != null && curr.next.value != value) {
            curr = curr.next;
        }
        if (curr.next != null) {
            Node leader = curr.next;
            curr.next = newNode;
            newNode.next = leader;

        }

    }

    public void insertAfter(int value, int newVal) {

        Node curr = head;
        Node newNode = new Node(value);
        newNode.value = newVal;

        while (curr != null && curr.value != value) {
            curr = curr.next;
        }
        if (curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }

    }

   public int findNth( int k) {
       Node p = head;
       Node f = head;
       int count = 1;
       if (k < 0) {
           System.out.println("You Can't Add K in Negative Value");
           return -1;
       }
//       int listLength = 0;
//       while (p != null && f != null) {
//           listLength += 1;
//           p = p.next;
//           f = f.next;
//       }
//       int index = listLength - k;
//       if (index > 0) {
           while (count <= k - 1) {
               f = f.next;
               count = count + 1;

           }
       while (f.next != null) {
           f = f.next;
           p = p.next;
       }
       return p.value;
//     }else{
//           System.out.println("K is larger than length of linked list..");
//           return -1;
//       }
   }






    @Override
        public String toString() {
            String output = "";
            Node currentNode = head;
            while (currentNode != null) {

                output += " { "+currentNode.value+" } --> ";

                currentNode = currentNode.next;
            }
            output += "NULL";


            return output;
        }



}
