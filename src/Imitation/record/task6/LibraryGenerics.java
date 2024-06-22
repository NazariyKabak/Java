package Imitation.record.task6;

public class LibraryGenerics {

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public static <T> void printType(T[]arr, Class<?> type) {
        for (T t : arr) {
            if (type.isInstance(t)){
                System.out.println(t);
            }
        }
    }
}
