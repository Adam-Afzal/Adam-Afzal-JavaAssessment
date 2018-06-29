public abstract class Feature {

    private String description;
    private String location;
    private double coordinate;

    public Feature(String description, String location, double coordinate) {
        this.description = description;
        this.location = location;
        this.coordinate = coordinate;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public double getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(double coordinate) {
        this.coordinate = coordinate;
    }
}
