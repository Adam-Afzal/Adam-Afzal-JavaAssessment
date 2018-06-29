public class Compass implements Movement {
    private double distanceWalkedNorth;
    private double distancewalkedEast;
    private double distanceWalkedSouth;
    private double distanceWalkedWest;
    private static double stepSize = 25;

    public Compass(double distanceWalkedNorth, double distancewalkedEast, double distanceWalkedSouth, double distanceWalkedWest) {
        this.distanceWalkedNorth = distanceWalkedNorth;
        this.distancewalkedEast = distancewalkedEast;
        this.distanceWalkedSouth = distanceWalkedSouth;
        this.distanceWalkedWest = distanceWalkedWest;
    }

    @Override
    public void goNorth() {
        this.distanceWalkedNorth = this.distanceWalkedNorth + 25;

    }

    @Override
    public void goSouth() {

        this.distanceWalkedSouth = this.distanceWalkedSouth + 25;
    }

    @Override
    public void goWest() {
this.distanceWalkedWest = this.distanceWalkedWest + 25;
    }

    @Override
    public void goEast() {
        this.distancewalkedEast = this.distancewalkedEast + 25;

    }

    public double getDistanceWalkedNorth() {
        return this.distanceWalkedNorth;
    }

    public double getDistanceWalkedEast() {
        return this.distancewalkedEast;
    }

    public double getDistanceWalkedSouth() {
        return this.distanceWalkedSouth;
    }

    public double getDistanceWalkedWest() {
        return this.distanceWalkedWest;
    }

    public void setDistanceWalkedNorth(double distanceWalkedNorth) {
        this.distanceWalkedNorth = distanceWalkedNorth;
    }

    public void setDistanceWalkedEast(double distancewalkedEast) {
        this.distancewalkedEast = distancewalkedEast;
    }

    public void setDistanceWalkedSouth(double distanceWalkedSouth) {
        this.distanceWalkedSouth = distanceWalkedSouth;
    }

    public void setDistanceWalkedWest(double distanceWalkedWest) {
        this.distanceWalkedWest = distanceWalkedWest;
    }

    public static double getStepSize() {
        return stepSize;
    }
}
