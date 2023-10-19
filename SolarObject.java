public class SolarObject {
    protected SolarSystem solarSystem;
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String colour;

    public SolarObject(SolarSystem solarSystem, double distance, double angle, double diameter, String colour) {
        this.solarSystem = solarSystem;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
    }

    public SolarSystem getSolarSystem() {
        return solarSystem;
    }

    public double getDistance() {
        return distance;
    }

    public double getAngle() {
        return angle;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getColour() {
        return colour;
    }
}
