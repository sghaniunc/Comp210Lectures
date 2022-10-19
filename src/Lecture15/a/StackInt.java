package Lecture15.a;
public interface StackInt<T> {
    int push(T value);      // pushes value in stack and returns its index (ie size-1) (in array or linked list)
    T pop();                // pops the top of the stack and returns its value (null if stack empty)
    int getSize();          // returns number of elements in Stack
}
