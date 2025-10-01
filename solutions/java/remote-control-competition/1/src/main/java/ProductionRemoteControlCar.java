import java.util.*;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int driveD = 0;
    private int victories = 0;
    public void drive() {
       driveD+= 10;
    }

    public int getDistanceTravelled() {
       return driveD;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other) {
        // Descending order: higher victories come first
        return Integer.compare(other.victories, victories);
    }
}
