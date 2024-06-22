package Imitation.record.task10;

public class LibraryGenerics {

    public static <T> String choise(T[] a, String type){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (a[i].getClass()
                    .getSimpleName()
                    .toUpperCase()
                    .equals(type.toUpperCase())){
                sb.append(a[i].toString());
            }
        }
        return sb.toString();
    }
}
