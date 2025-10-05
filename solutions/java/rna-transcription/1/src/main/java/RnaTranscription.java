import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {
       Map<Character,Character> dr = new HashMap<>();
        dr.put('G','C');
        dr.put('C','G');
        dr.put('T','A');
        dr.put('A','U');
        StringBuilder sb = new StringBuilder();
        for( char c: dnaStrand.toCharArray()){
            if(dr.containsKey(c)){
                sb.append(dr.get(c));
            }
        }

        return sb.toString();
    }

}
