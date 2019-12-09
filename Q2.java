import java.util.HashMap;
import java.lang.StringBuilder;

public class Q2 {

    public static void main(String[] args){
        HashMap<String,String> map1 = populateMap(new String[] {"q","w","e","r","t","y","u","i","o","p"});
        HashMap<String,String> map2 = populateMap(new String[] {"4","6",":)","24","m","Q","k","w","v","8"});

        System.out.println(mapToString(map1, "Map1"));
        System.out.println(mapToString(map2, "Map2"));

        swapValuesofMatchingKeys(map1,map2);

        System.out.println(mapToString(map1,"Map1"));
        System.out.println(mapToString(map2,"Map2"));
    }

    //populates HashMap from String[]
    public static HashMap<String,String> populateMap(String[] keyvals){
        HashMap<String,String> map = new HashMap<>();

        for(int i = 0; i < (keyvals.length/2) * 2; i += 2){
            map.put(keyvals[i], keyvals[i+1]);
        }
        return map;
    }

    public static void swapValuesofMatchingKeys(HashMap<String,String> map1, HashMap<String,String> map2) {
        System.out.println("Switching matching key values...");

        map1.entrySet().forEach(entry -> {
            String key = entry.getKey();
            if (map2.containsKey(key)) {
                String temp = map2.get(key);
                map2.replace(key, map1.get(key));
                map1.replace(key, temp);
            }
        });
    }

        public static String mapToString(HashMap<String,String> map, String mapName){
            StringBuilder str = new StringBuilder(mapName+"   {");

            map.entrySet().forEach(entry->{
                str.append(String.format("%s:%s ", entry.getKey(),entry.getValue()));
            });

            str.deleteCharAt(str.length()-1);
            str.append("}");

            return str.toString();

    }
}
