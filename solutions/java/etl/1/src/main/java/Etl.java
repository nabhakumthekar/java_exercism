import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class Etl {
    Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> newMap = new HashMap<String, Integer>();
        Set<Integer> keySet = old.keySet();
        int[] oldKeys = keySet.stream().mapToInt(Integer::intValue).toArray();

        for(int key: oldKeys) {
                 List<String> oldList = old.get(key);  
                    for(String l: oldList) {
                        newMap.put(l.toLowerCase(), key);
                    }
        }
        return newMap;
    }
}
