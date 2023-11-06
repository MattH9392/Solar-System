public class Sun extends SolarObject{
    private static int numSuns = 0;
    private int numPlanets = 0;
    private static Sun[] suns = new Sun[0];
    private Planet[] planets = new Planet[0];

    public Sun(SolarSystem solarSystem, double distance, double angle, double diameter) {
        super(solarSystem, distance, angle, diameter, 0, "YELLOW");
    }

    public static Sun[] getSuns() {
        return suns;
    }

    public Planet[] getPlanets() {
        return planets;
    }

    public int getPlanetCount() {
        return numPlanets;
    }

    public int getSunCount() {
        return numSuns;
    }

    public void updatePlanets(Planet[] planets) {
        this.planets = planets;
    }


    public Planet[] addPlanet(Planet planet) {
        Planet newPlanets[] = new Planet[planets.length + 1];
        for(int i = 0; i < planets.length; i++)
            newPlanets[i] = planets[i];
        planets = newPlanets;
        planets[planets.length - 1] = planet;
        numPlanets++;
        System.out.println("Added planet. array length = " + planets.length);
        return planets;
    }

    static Sun[] addSun(Sun sun) {
        Sun newSuns[] = new Sun[suns.length + 1];
        for(int i = 0; i < suns.length; i++)
            newSuns[i] = suns[i];
        suns = newSuns;
        suns[suns.length - 1] = sun;
        numSuns++;
        System.out.println("Added sun. array length = " + suns.length);
        return suns;
    }
}