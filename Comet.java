public class Comet extends SolarObject {
    private double eccentricity;
    public Comet(SolarSystem solarSystem, Sun sun, double distance, double angle, double diameter, double orbitalPeriod, double eccentricity, String colour) {
        super(solarSystem, distance, angle, diameter, orbitalPeriod, colour);
        this.eccentricity = eccentricity;
    }

    public double getEccentricity() {
        return eccentricity;
    }
}
