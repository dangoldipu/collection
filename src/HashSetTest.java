import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> fruitset = new HashSet<String>();
        fruitset.add("apple");
        fruitset.add("banana");
        fruitset.add("apple");
        fruitset.add("orange");
        for( String a : fruitset){
            System.out.println(a);
        }
    }

}
