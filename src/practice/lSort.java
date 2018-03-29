package practice;
import java.util.*;

public class lSort {
    public static void main(String[] args) {
        String [] suits = {"hearts","diamonds","clubs","spades"};

        //create and display a list containing the suits array elements
        List< String > list = Arrays.asList( suits );
        System.out.printf("unsorted array elements are:%s\n",list);

        Collections.sort( list );

        System.out.printf( "sorted array elements: %s\n", list);

    }
}
