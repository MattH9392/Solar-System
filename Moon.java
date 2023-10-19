public class Moon extends SolarObject {
    Planet planet;

    public Moon(SolarSystem solarSystem, Planet planet, double distance, double angle, double diameter, String colour) {
        super(solarSystem, distance, angle, diameter, colour);
        planet.addMoon();
        System.out.println("Added plannet. Total planets: " + planet.getMoonCount());
    }
}