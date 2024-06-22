package Imitation.record.task2;

import java.util.ArrayList;
import java.util.List;

public class LibraryGenerics {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static <T> void printElementsOfType(T[] array, Class<?> type) {
        for (T element : array) {
            if (type.isInstance(element)) {
                System.out.println(element);
            }
        }
    }

    public static <T> List<T> filterByType(T[] array, Class<?> type) {
        List<T> result = new ArrayList<>();
        for (T element : array) {
            if (type.isInstance(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
