package map;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map< String , Integer > fruitMap = new HashMap < String , Integer >();
        fruitMap.put ( "apple" , 300);
        fruitMap.put ( "mango" , 300);
        fruitMap.put ( "banana" , 300);
        fruitMap.put ( "banana" , 100);
        for(Map.Entry m:fruitMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
