import java.util.*;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean upperNext = false;
        char[] asArray = identifier.toCharArray();

        // Map leetspeak digits to letters
        Map<Character, Character> leetSpeakMap = new HashMap<>();
        leetSpeakMap.put('4','a');
        leetSpeakMap.put('3','e');
        leetSpeakMap.put('0','o');
        leetSpeakMap.put('1','l');
        leetSpeakMap.put('7','t');

        for (char ch : asArray) {
           if(ch == '-') {
                upperNext = true;
            } else {
                if(upperNext) {
                    sb.append(Character.toUpperCase(ch));
                    upperNext = false;
                } else if (Character.isWhitespace(ch)) {
                    sb.append('_');
                } else if (leetSpeakMap.containsKey(ch)) {
                    sb.append(leetSpeakMap.get(ch));
                } else if(Character.isLetter(ch)) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
