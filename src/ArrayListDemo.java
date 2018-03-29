import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("kiwi");

        System.out.printf("list is:\n%s\n:",list);

        for( String s : list ){
            System.out.println(s);
        }
    }

}
