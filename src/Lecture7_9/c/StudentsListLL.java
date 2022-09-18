package Lecture7_9.c;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentsListLL implements StudentsListInt {
    private LinkedList<UncStudent> _sLL = new LinkedList<UncStudent>();
    private int _size = 0;

    @Override
    public boolean add(UncStudent st) {
        _sLL.add(st);
        _size++;
        return true;
    }

    @Override
    public void search(String name) {
        Iterator it = _sLL.iterator();
        int i = 0;
        while(it.hasNext()){
            UncStudent st = (UncStudent) it.next();
            if (st._fName.equals(name) || (st._lName.equals(name))){
                System.out.println(i+". "+st._fName+" "+st._lName+", id="+st._id);
                i++;
            }
        }
    }
    @Override
    public void printAll() {
        Iterator it = _sLL.iterator();
        int i=0;
        while(it.hasNext()){
            UncStudent st = (UncStudent) it.next();
            System.out.println(i+". "+st._fName+" "+st._lName+", id="+st._id);
            i++;
        }
    }
    @Override
    public int getSize() {
        return _size;
    }

}
