package Imitation.record.task10;

import Imitation.record.task1.Adult;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArrayWrapper<T> implements Iterator<T> {
    private T[] array;
    private int currentIndex=0;

    public ArrayWrapper(T[] array) {
        this.array = array;
        this.currentIndex=0;
    }
    public boolean hasNext() {
        return currentIndex<array.length;
    }
    public T next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return array[currentIndex++];
    }
    public void resetIterator(){
        currentIndex=0;
    }



    @Override
    public String toString() {
        StringBuilder str=new StringBuilder("[");
        for (int i=0;i<array.length;i++){
            str.append(array[i].toString());
            if (i<array.length-1){
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }
}
