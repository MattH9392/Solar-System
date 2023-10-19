public class Planet extends SolarObject {
    private static int numPlanets = 0;
    private int numMoons = 0;


    public Planet(SolarSystem solarSystem, double distance, double angle, double diameter, String colour) {
        super(solarSystem, distance, angle, diameter, colour);
        numPlanets++;
        System.out.println("Added plannet. Total planets: " + numPlanets);
    }

    void addMoon() {
        numMoons++;
    }
    
    int getPlanetCount() {
        return numPlanets;
    }

    int getMoonCount() {
        return numMoons;
    }

}