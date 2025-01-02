package StackStructure;

public class Stack<T> {
    int capacity;
    int top;
    T[] stackArray;

    public Stack(int size) {
        this.capacity = size;
        this.top = -1;
        this.stackArray = (T[]) new Object[size];
    }

    public void push( T value) {
        if (isFull()) {
            System.out.print("Stack overflow");
        }
        stackArray[++top] = value;
    }

    public T pop() {
        if ( isEmpty()) {
            System.out.println("Stack is empty.It cannot be deleted");
            return null;
        }else {
           return stackArray[top--];
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        } else {
            return stackArray[top];
        }
    }


    public boolean isFull() {
        return top == capacity-1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }else {
            for ( int i = 0 ; i <= top ; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
