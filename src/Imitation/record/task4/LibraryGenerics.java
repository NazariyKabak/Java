package Imitation.record.task4;

public class LibraryGenerics {

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static <T> void printType(T[] array, Class<?> type) {
        for (T t : array) {
            if (type.isInstance(t)){
                System.out.println(t);
            }
        }
    }
}
