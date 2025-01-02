package Queue;

public class QueueDemo<T> {
    int size;
    int front;
    int Rear;
    int count;
    T[] arr;

    QueueDemo(int size) {
        arr = (T[]) new Object[size];
        this.size = size;
        front = -1;
        Rear = -1;
        count = 0;
    }

    public void enqueue (T value) {
        if ( isFull()){
            System.out.println("Queue is full");
        }else {
            Rear++;
            arr[Rear] = value;
            count++;
        }
    }

    public void dequeue() {
        if ( front == Rear) {
            System.out.println("Queue is empty");
        }else {
            front++;
        }
    }

    public void Display() {
        for (int i = front+1; i <= Rear;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return Rear == size-1;
    }
}
