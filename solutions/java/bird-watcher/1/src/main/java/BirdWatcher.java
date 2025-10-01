import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
       return Arrays.stream(this.birdsPerDay).anyMatch(n -> n==0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        int arraySize = numberOfDays > this.birdsPerDay.length ? this.birdsPerDay.length : numberOfDays;
        for(int i = 0; i < arraySize; i++ ) {
            birdCount+=this.birdsPerDay[i];
        }

        return birdCount;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i < this.birdsPerDay.length; i++ ) {
            if(this.birdsPerDay[i] >= 5){
                busyDays++;
            }
        }

        return busyDays;
    }
}
