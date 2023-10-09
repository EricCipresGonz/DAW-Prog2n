package EjerciciosCadenas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EX_11 {

    public static void main(String[] args) {

        // Usamos claves únicas
        HashMap<String, Integer> MAP = new HashMap<>();
        MAP.put("Pais1", 7);
        MAP.put("Pais2", 3);
        MAP.put("Pais3", 6);
        MAP.put("Pais4", 1);

        List<Map.Entry<String, Integer>> l = new ArrayList<>(MAP.entrySet());

        Collections.sort(l, (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

        TreeMap<String, Integer> Map2 = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : l) {
            Map2.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : Map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}