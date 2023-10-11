package Lesson8_LinkedList;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }


    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object value) {
        Node a = new Node(value);
        a.data = value;
        if (index == 0) {
            a.next = head;
            head = a;
        } else {
            Node temp = head;
            for (int i = 1; i < index -1; i++) {
                temp = temp.next;
            }
            a.next = temp.next;
            temp.next = a;
        }
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(5);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.add(3, 9);
        ll.printList();
    }
}

