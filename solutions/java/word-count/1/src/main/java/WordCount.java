import java.util.Map;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        input = input.toLowerCase();
        Pattern pattern = Pattern.compile("[a-z0-9]+(?:'[a-z0-9]+)?");
        Matcher matcher = pattern.matcher(input);
        Map<String, Integer> result = new HashMap<String, Integer>();

        while (matcher.find()) {
            String word = matcher.group();
            result.put(word, result.getOrDefault(word, 0) + 1);
        }
        return result;
    }
}
