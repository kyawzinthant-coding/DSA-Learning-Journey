package Queue;

public class QueueOperation {
    public static void main(String[] args) {
        QueueDemo<Integer> queueDemo = new QueueDemo(5);
        queueDemo.enqueue(1);
        queueDemo.enqueue(2);
        queueDemo.enqueue(3);
        queueDemo.enqueue(4);
        queueDemo.enqueue(5);
        queueDemo.dequeue();
        queueDemo.Display();

    }
}
