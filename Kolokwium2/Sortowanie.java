import java.util.Arrays;
import java.util.Collections;

class Sortowanie {
    public static <T extends Comparable<T>> void sortDescending(T[] array)
    {
        Arrays.sort(array, Collections.reverseOrder());
    }
}
