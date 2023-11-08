public class Planet extends SolarObject {
    private static int numPlanets = 0;
    private int numMoons = 0;
    private Moon[] moons = new Moon[0];


    public Planet(SolarSystem solarSystem, Sun sun, double distance, double angle, double diameter, double orbitalPeriod, String colour) {
        super(solarSystem, distance, angle, diameter, orbitalPeriod, colour);
        numPlanets++;
    }


    public Moon[] getMoons() {
        return moons;
    }

    public void updateMoons(Moon[] moons) {
        this.moons = moons;
    }
    
    public int getPlanetCount() {
        return numPlanets;
    }

    public int getMoonCount() {
        return numMoons;
    }


    // Increase size of moons array by 1 and add a new moon
    public void addMoon(Moon moon) {
        Moon[] newMoons = new Moon[moons.length + 1];
        for(int i = 0; i < moons.length; i++)
            newMoons[i] = moons[i];
        moons = newMoons;
        moons[moons.length - 1] = moon;
        numMoons++;
        System.out.println("Added moon. array length = " + numMoons);
    }
}