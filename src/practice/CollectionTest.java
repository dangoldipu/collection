package practice;
import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"magenta","red","white","blue","cyan"};
        List < String > colorList = new ArrayList< String >();

        for( String color : colors )
            colorList.add( color );
        String[] removeColor = { "red","white","blue"};
        List< String > removeList = new ArrayList< String >();

        for( String color : removeColor )
            removeList.add( color );

        System.out.println("ArrayList:");

        for( int c=0; c<colorList.size(); c++)
            System.out.printf("%s\t", colorList.get( c ));

        removeColor(colorList, removeList);

        System.out.println("\n\nArrayList after calling removeColor: ");

        for( String color : colorList)
            System.out.printf("%s\t",color);
    }
    private static void removeColor(Collection< String > c1,Collection <String> c2 ){
        Iterator< String > iterator = c1.iterator();

        while (  iterator.hasNext())
        {
            if(c2.contains(iterator.next()))
                iterator.remove();
        }
    }

}
