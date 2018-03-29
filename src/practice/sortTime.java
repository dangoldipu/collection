package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortTime {
    public static void main(String[] args) {
        List< Time2 > list = new ArrayList< Time2 >();
        list.add( new Time2( 6, 24, 34) );
        list.add( new Time2( 6, 22, 44) );
        list.add( new Time2( 6, 24, 54) );
        list.add( new Time2( 6, 56, 14) );

        System.out.printf("unsorted array elements:\n%s\n",list );

        System.out.printf("max:%s\n",Collections.max( list, new timeCompare() ));

        Collections.sort(list, new timeCompare());

        System.out.printf("Sorted list elements:\n%s\n",list);
    }
}
