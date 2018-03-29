import java.util.TreeSet;

public class TreeTest {
    public static void main(String[] args) {
        TreeSet<String> vehicle = new TreeSet <>();
        vehicle.add("bmw");
        vehicle.add("audi");
        vehicle.add("bugatti");
        vehicle.add("mercedez");
        vehicle.add("bmw");

        for( String a : vehicle){
            System.out.println(a);
        }
    }
}
