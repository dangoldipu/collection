import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> vehicle = new LinkedList<>();
        vehicle.add("bmw");
        vehicle.add("audi");
        vehicle.add("buggati");

        for( String a : vehicle){
            System.out.println(a);
        }


    }
}
