package Lecture16.a;

// Binary Heap implementation of a Priority Queue
public class Example16 {
    public static void main(String[] args) {
        testA();
        testB();
    }

    static void testA() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        PElement<Integer> pE;

        maxHeap.enqueue(100, 1);
        maxHeap.enqueue(110, 2);
        maxHeap.enqueue(150, 5);
        maxHeap.enqueue(160, 7);
        maxHeap.printHeap();
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
    }
    static void testB() {
        MaxHeap<String> maxHeap = new MaxHeap<>();
        PElement<String> pE;

        maxHeap.enqueue("a", 10);
        maxHeap.enqueue("b", 2);
        maxHeap.enqueue("c", 3);
        maxHeap.enqueue("d", 4);
        maxHeap.enqueue("e", 0);
        maxHeap.printHeap();
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
        pE = maxHeap.dequeue();
        System.out.println(pE._value+ ", "+ pE._priority);
    }
}
