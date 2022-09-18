package Lecture7_9.e;

public interface StudentsListInt {
    boolean add(UncStudent st);     // adds student object to collection (returns true if successful)
    void search(String name);       // prints all the matches
    void printAll();                // prints all
    default int getSize(){     // returns the default number in the list
        return(-1);
    }
    void setUni(String name);       // sets the University name for all students
}
