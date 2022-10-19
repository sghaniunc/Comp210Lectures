package Lecture16.a;

// Prioritized element
public class PElement <T> {
    T _value;
    int _priority;

    public PElement(T value, int priority){
        _value = value;
        _priority = priority;
    }
}
