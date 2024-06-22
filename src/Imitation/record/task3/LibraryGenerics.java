package Imitation.record.task3;

public class LibraryGenerics {

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public static <T> String printType(T[] arr, String type) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].getClass()
                    .getSimpleName()
                    .toUpperCase()
                    .equals(type.toUpperCase())) {
                sb.append(arr[i].toString());
            }
        }
        return sb.toString();
    }


    public static <T>String toString(T[]a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(",").append(a[i].toString());
        }
        return sb.toString();
    }
}
