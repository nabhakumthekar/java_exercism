import java.util.Arrays;
import java.util.List;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int cars = 221;
        double productionRate = 0.0;
        Integer[] oneToFourArr = {1,2,3,4};
        Integer[] fiveToEightArr = {5,6,7,8};
        List<Integer> oneToFour = Arrays.asList(oneToFourArr);
        List<Integer> fiveToEight = Arrays.asList(fiveToEightArr);
        if(oneToFour.contains(speed)) {
            productionRate = cars * speed;
        } else if(fiveToEight.contains(speed)) {
            productionRate = cars * speed * 0.9;
        }else if(speed == 9) {
            productionRate = cars * speed * 0.8;
        }else {
            productionRate = cars * speed * 0.77;
        }

        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
