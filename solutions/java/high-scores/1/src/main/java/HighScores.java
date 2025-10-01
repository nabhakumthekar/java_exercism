import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

class HighScores {
    List<Integer> highScores = new ArrayList<Integer>();
    
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return this.highScores.get(this.highScores.size() - 1);
    }

    Integer personalBest() {
        Integer highestNumber = 0;
        Optional<Integer> hNumber = this.highScores.stream().max(Comparator.naturalOrder());
            if(hNumber.isPresent()) {
             highestNumber = hNumber.get();
            }
        return highestNumber;
    }

    List<Integer> personalTopThree() {

        return this.highScores.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
    }

}
