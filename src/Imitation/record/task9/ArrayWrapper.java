package Imitation.record.task9;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayWrapper <T> implements Iterator<T> {
    private T[] array;
    private int index=0;

    public ArrayWrapper() {
    }

    public ArrayWrapper(T[] array) {
        this.array = array.clone();
    }

    public T[] getData(){
        return array;
    }

    public void setData(T s, int i){
        array[i]=s;
    }

    public boolean hasNext() {
        return index<array.length;
    }
    public T next() {
        if (!hasNext()) return null;
        return array[this.index++];
    }

    private void resetIterator(){
        index=0;
    }

    public String choise(String strType){
        StringBuilder result= new StringBuilder();
        this.resetIterator();
        while (this.hasNext()){
            var current = this.next();
            if (current
                    .getClass()
                    .getSimpleName()
                    .toUpperCase()
                    .equals(strType.toUpperCase())){
                result.append(current.toString());
            }
        }
        return result.toString();
    }

    @Override
    public String toString() {
        this.resetIterator();
        StringBuilder str = new StringBuilder(this.next().toString());
        while (this.hasNext()){
            str.append(",").append(this.next().toString());
        }
        return str.toString();
    }
}
