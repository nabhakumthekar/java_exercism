import java.util.*;
class Scrabble {
    Map<Character, Integer> scrabbleMap = new HashMap<Character, Integer>();
    String word = "";
    Scrabble(String word) {
this.word = word;
            String ones = "AEIOULNSTR";
            String twos = "DG";
            String threes = "BCMP";
            String fours = "FHVWY";
            String fives = "K";
            String eights = "JX";
            String tens = "QZ";

            for( char c: ones.toCharArray()) this.scrabbleMap.put(c, 1);
            for( char c: twos.toCharArray()) this.scrabbleMap.put(c, 2);
            for( char c: threes.toCharArray()) this.scrabbleMap.put(c, 3);
            for( char c: fours.toCharArray()) this.scrabbleMap.put(c, 4);
            for( char c: fives.toCharArray()) this.scrabbleMap.put(c, 5);
            for( char c: eights.toCharArray()) this.scrabbleMap.put(c, 8);
            for( char c: tens.toCharArray()) this.scrabbleMap.put(c, 10);
        
    }

    int getScore() {
    if (this.word == null || this.word.isEmpty()) return 0;
        int sum = 0;
        for(char c: this.word.toUpperCase().toCharArray()) {
            sum = sum + this.scrabbleMap.get(c);
        }
        return sum;
        
    }

}
