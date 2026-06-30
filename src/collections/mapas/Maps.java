package collections.mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    //Map<K,V>
    //Map <tipoClave, tipo valor>
    //Map<String, Integer>
    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);
        System.out.println("HashMap:");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.values().toArray());

        //Map--> V --> VALORES --> ARRAY --> ARRAY[pos] 
        for (int i = 0; i < map.size(); i++) {
            
            System.out.println(map.values().toArray()[i]);
        }

        //MAP --> K --> KEYS --> -.> SET --> valor del set
        for (String key : map.keySet()) {
            System.out.println(key);

        }//A, B, C

        //T =. ENTRY <K,V>
        //T = 
        // SET<T>

        map.entrySet();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);

        }
        return map;
    }

    public LinkedHashMap<String, Integer> construirLinkedHashMap() {
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
        lmap.put("A", 2);
        lmap.put("B", 3);
        lmap.put("A", 5);
        lmap.put("C", 50);
        lmap.put("D", 5);
        lmap.put("F", 3);
        lmap.put("G", 8);
        lmap.put("H", 85);
        lmap.put("I", 5);
        System.out.println("LinkedHashMap:");
        System.out.println(lmap.size());
        System.out.println(lmap);
        System.out.println(lmap.entrySet());
        return lmap;

    }

    public TreeMap<String, Integer> cTreeMap() {
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("A", 2);
        tmap.put("B", 3);
        tmap.put("A", 5);
        tmap.put("C", 50);
        tmap.put("D", 5);
        tmap.put("F", 3);
        tmap.put("G", 8);
        tmap.put("H", 85);
        tmap.put("I", 5);
        System.out.println("TreeMap:");
        System.out.println(tmap.size());
        System.out.println(tmap);
        System.out.println(tmap.entrySet());
        return tmap;

    }
}
