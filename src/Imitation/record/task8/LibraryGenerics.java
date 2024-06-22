package Imitation.record.task8;

public class LibraryGenerics {


    public static <T> void print(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public static <T> void printType(T[] arr, Class<?> type){
        for (T t : arr) {
            if (type.isInstance(t)){
                System.out.println(t);
            }
        }
    }
}
