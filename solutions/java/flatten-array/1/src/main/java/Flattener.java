import java.util.List;
import java.util.ArrayList;

class Flattener {
 List<Object> result = new ArrayList<>();
    @SuppressWarnings("unchecked")
    List<Object> flatten(List<?> list) {
      
      
        for (Object l : list) {
            if (l == null) continue;

            if (l instanceof List<?>) {
                flatten((List<Object>) l); // **collect nested results**
            } else if (l instanceof Integer || l instanceof Character || l instanceof String ) {
                result.add((Object) l);
            }
        }
        return result;
    }

}