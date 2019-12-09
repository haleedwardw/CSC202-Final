import java.util.Random;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args){
    //Resource https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
    //Creating a random int array of size 100 with values from 0 to 99
    int[] array = new Random().ints(100, 0, 100).toArray();

    TreeMap<Integer, String> map = new TreeMap<>();

    for(int e1:array)

    {
        map.put(e1, String.format("%d", e1));

    }

    printMap(map);

}

    //used resource 3 https://beginnersbook.com/2013/12/treemap-in-java-with-example/
    public static void printMap(TreeMap map){
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.printf("Key: %d   value: %s\n",mentry.getKey(),mentry.getValue());
        }
    }
}
