public class JedliksToyCar {
    private int meters = 0;
    private int battery = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;   
    }

    public String distanceDisplay() {
       return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if(battery == 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if(meters != 2000 && battery != 0) {
                meters +=20;
                battery-=1;
        }
    }
}
