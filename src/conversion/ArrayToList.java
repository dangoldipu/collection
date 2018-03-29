package conversion;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3};
        List<Integer> list = Arrays.asList(intArray);
        list.forEach(System.out::print);

        System.out.println("INTO ARRAY");
        intArray = list.toArray(new Integer[list.size()]);
        for (Integer a : intArray) {
            System.out.println(a);

        }
    }
}
