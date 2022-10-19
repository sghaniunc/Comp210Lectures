package Lecture15.b;

import java.util.ArrayList;

public class QueueA<T> implements QueueInt<T> {
    ArrayList<T> _queue;

    public QueueA(){
        _queue = new ArrayList<T>();
    }

    @Override
    public int enqueue(T value) {
        _queue.add(value);              // adds new values at end of Array
        return (_queue.size()-1);
    }

    @Override
    public T dequeue() {
        if (_queue.size() == 0){
            return null;
        }
        else {
            T value = _queue.get(0);    // dequeues from beginning of Array
            for (int i=0; i<_queue.size()-1; i++){    // moves all elements one down
                _queue.set(i,_queue.get(i+1));
            }
            _queue.remove(_queue.size()-1);
            return (value);
        }
    }

    @Override
    public int getSize() {
        return _queue.size();
    }
}
