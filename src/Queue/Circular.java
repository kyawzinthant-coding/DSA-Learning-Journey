package Queue;


class Circular<T> {
    int size;
    int front;
    int rear;
    T[] arr;


    public Circular(int size) {
        arr = (T[]) new Object[size];
        this.size = size;
        front = 0;
        rear = 0;
    }


    public void enqueue ( T value ) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = ( rear + 1 )% size ;
        arr[rear] = value;
    }


    public void dequeue() {
        if ( isEmpty()) {
            System.out.println("Queue is empty");
        }

        front = ( front + 1) % size;
    }

    public boolean isFull() {
        return (rear+1)%size == front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void Display() {
        int i = front + 1 ;

        do {
            System.out.println(arr[i]);
            i = ( i + 1 ) % size;
        }while ( i != ( rear + 1 ) % size);
    }

    public static void main(String[] args) {
        Circular<Integer>  CC = new Circular<>(6);

        CC.enqueue(1);
        CC.enqueue(2);
        CC.enqueue(3);
        CC.enqueue(4);
        CC.enqueue(5);


        CC.Display();
    }


}

