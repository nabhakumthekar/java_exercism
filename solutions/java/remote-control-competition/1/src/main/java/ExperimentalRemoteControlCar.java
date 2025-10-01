
public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int driveD = 0;
    
    public void drive() {
     driveD+= 20;
    }

    public int getDistanceTravelled() {
        return driveD;
    }
}
