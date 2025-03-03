package Hashing;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Hashtable{
    private Node[] table;

    public Hashtable() {
        table = new Node[10];
    }

    private int hash(int key) {
        return key % 10;
    }

    public void insert ( int key) {
        int index = hash(key);
        Node newNode = new Node(key);

        if ( table[index] == null) {
            table[index] = newNode;
        }else {
            Node current = table[index];
            Node prev = null;

            while ( current!= null && current.data < key) {
                prev = current;
                current = current.next;
            }

            if (prev == null) {
                newNode.next = table[index];
                table[index]= newNode;
            }else {
                newNode.next = prev.next;
                prev.next = newNode;
            }
        }
    }

    public int search(int key) {
        int index = hash(key);
        Node current = table[index];

        while ( current != null) {
            if ( current.data == key) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }

}

public class Chaining {

}
