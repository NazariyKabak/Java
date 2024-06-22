package Imitation.record.task7;

public class LibraryGenerics {


    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
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
}
