package Lecture7_9.c;

public interface StudentsListInt {
    boolean add(UncStudent st);     // adds student object to collection (returns true if successful)
    void search(String name);       // prints all the matches
    void printAll();                // prints all
    int getSize();                  // returns the number in the list
}
