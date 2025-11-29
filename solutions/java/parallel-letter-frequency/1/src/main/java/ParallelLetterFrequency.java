import java.util.Map;
import java.util.HashMap;
import java.util.*;

class ParallelLetterFrequency {

    private final String[] texts;
    
    ParallelLetterFrequency(String[] texts) {
        this.texts = texts; 
    }

    Map<Character, Integer> countLetters() {
      Map<Character, Integer> fMap = new HashMap<>();
        Arrays.stream(this.texts)
            .parallel()
            .flatMapToInt(String::codePoints)
            .mapToObj(c -> (char) c)
            .filter(Character::isLetter)  
            .forEach(c -> fMap.merge(Character.toLowerCase(c), 1, Integer::sum));
         return fMap;
    }

}
