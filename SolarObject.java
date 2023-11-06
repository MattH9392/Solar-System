public class SolarObject {
    protected SolarSystem solarSystem;
    protected double distance;
    protected double angle;
    protected double diameter;
    protected double orbitalPeriod;
    protected String colour;

    public SolarObject(SolarSystem solarSystem, double distance, double angle, double diameter, double orbitalPeriod, String colour) {
        this.solarSystem = solarSystem;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.orbitalPeriod = orbitalPeriod;
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

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getColour() {
        return colour;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    public void setAngle(double angle) {
        this.angle = angle;
        if(angle >= 360)
            this.angle -= 360;
        else if(angle <= 0)
            this.angle += 360; // keeps angle within range of double - obviously very unlikely to exceed range as it would take a long time, but at least it's physically possible
    }

}
