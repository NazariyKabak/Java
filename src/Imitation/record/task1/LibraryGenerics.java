package Imitation.record.task1;

public class LibraryGenerics {
    public static <T> String choise(T[]a, String strType){
        StringBuilder result= new StringBuilder(" ");
        for(int i=0;i<a.length;i++){
            if (a[i].getClass()
                    .getSimpleName()
                    .toUpperCase()
                    .equals(strType.toUpperCase())){
                result.append(a[i].toString());
            }
        }
        return result.toString();
    }

    public static <T> String toString(T[]a){
        StringBuilder str= new StringBuilder(a[0].toString());
        for(int i=1;i<a.length;i++){
            str.append(",").append(a[i].toString());
        }
        return str.toString();
    }
}
