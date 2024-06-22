package Imitation.record.task11;

import Imitation.record.task1.Adult;
import Imitation.record.task1.BaseInform;
import Imitation.record.task1.Child;
import Imitation.record.task1.Pensioner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayWrapper implements Iterator<Object> {

    private Object[] array;
    private int index=0;

    public ArrayWrapper() {
    }
    public ArrayWrapper(Object[] array) {
        this.array = array.clone();
    }

    public Object[] getData(){
        return array;
    }

    public void setData(Object s, int i){
        array[i]=s;
    }

    @Override
    public boolean hasNext() {
        return index<array.length;
    }

    @Override
    public Object next() {
        if (!hasNext()){
            return null;
        }
        return array[index++];
    }

    private void resetIterator(){
        index=0;
    }

    public String choise(String type){
        StringBuilder sb = new StringBuilder();
        this.resetIterator();
        while(this.hasNext()){
            var current = this.next();
            if (current.getClass()
                    .getSimpleName()
                    .toUpperCase()
                    .equals(type.toUpperCase())){
                sb.append(current.toString());
            }
        }
        return sb.toString();
    }

    public void updateFirstElement(String targetValue, String newValue){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Adult adult && adult.inf().name().equals(targetValue)) {
                array[i] = new Adult(new BaseInform(newValue, adult.inf().gender(), adult.inf().age()), adult.income());
            }else if (array[i] instanceof Child child && child.inf().name().equals(targetValue)){
                array[i] = new Child(new BaseInform(newValue, child.inf().gender(), child.inf().age()), child.iq());
            } else if (array[i] instanceof Pensioner pensioner && pensioner.inf().name().equals(targetValue)) {
                array[i] = new Pensioner(new BaseInform(newValue, pensioner.inf().gender(), pensioner.inf().age()), pensioner.pension());
            }
        }
    }

    public void updateSecondElement(char targetValue, char newValue){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Adult adult && adult.inf().gender()==targetValue) {
                array[i] = new Adult(new BaseInform(adult.inf().name(), newValue, adult.inf().age()), adult.income());
            }else if (array[i] instanceof Child child && child.inf().gender()==targetValue) {
                array[i] = new Child(new BaseInform(child.inf().name(),newValue, child.inf().age()), child.iq());
            } else if (array[i] instanceof Pensioner pensioner && pensioner.inf().gender()==targetValue) {
                array[i] = new Pensioner(new BaseInform(pensioner.inf().name(),newValue, pensioner.inf().age()), pensioner.pension());
            }
        }
    }

    public void updateThirdElement(int targetValue, int newValue){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Adult adult&& adult.inf().age()==targetValue) {
                array[i] = new Adult(new BaseInform(adult.inf().name(),adult.inf().gender(), newValue), adult.income());
            }else if (array[i] instanceof Child child && child.inf().age()==targetValue) {
                array[i] = new Child(new BaseInform(child.inf().name(),child.inf().gender(), newValue), child.iq());
            }else if(array[i] instanceof Pensioner pensioner && pensioner.inf().age()==targetValue) {
                array[i] = new Pensioner(new BaseInform(pensioner.inf().name(),pensioner.inf().gender(), newValue), pensioner.pension());
            }
        }
    }
    public void updateFourthElement(String targetValue, Object newValue){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Adult adult && adult.inf().name().equals(targetValue)){
                array[i] = new Adult(adult.inf(), (Double) newValue);
            }else if (array[i] instanceof Child child && child.inf().name().equals(targetValue)){
                array[i] = new Child(child.inf(), (Integer) newValue);
            }else if (array[i] instanceof Pensioner pensioner&& pensioner.inf().name().equals(targetValue)){
                array[i] = new Pensioner(pensioner.inf(), (Double) newValue);
            }
        }
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
