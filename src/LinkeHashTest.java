import java.util.LinkedHashSet;

public class LinkeHashTest {
    public static void main(String[] args) {
        LinkedHashSet<String> animal = new LinkedHashSet<>();
        animal.add("rabbit");
        animal.add("tiger");
        animal.add("rabbit");
        animal.add("rat");
        animal.add("fox");
        for(String a : animal){
            System.out.println(a);
        }

    }
}
