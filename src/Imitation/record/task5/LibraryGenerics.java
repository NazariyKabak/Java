package Imitation.record.task5;

public class LibraryGenerics {

    public static <T> String printType(T[] arr, String type) {
        StringBuilder sb = new StringBuilder();
        for (T t : arr) {
            if (t.getClass()
                    .getSimpleName()
                    .equalsIgnoreCase(type)) {
                sb.append(t);
            }
        }
        return sb.toString();
    }


    public <T> String toString(T[]arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <arr.length; i++) {
            sb.append(",").append(arr[i].toString());
        }
        return sb.toString();
    }
}
