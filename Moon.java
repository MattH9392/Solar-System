public class Moon extends SolarObject {

    public Moon(SolarSystem solarSystem, Planet planet, double distance, double angle, double diameter, double orbitalPeriod, String colour) {
        super(solarSystem, distance, angle, diameter, orbitalPeriod, colour);
        System.out.println("Added Moon. Total moons: " + (planet.getMoonCount() + 1));
    }
}