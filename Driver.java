public class Driver {
    public static void main(String[] args) {

        SolarSystem solar_system = new SolarSystem(1600, 900);

        Sun sun = new Sun(solar_system, 0, 0, 60);
        Sun.addSun(sun);

        // Orbital periods: Earth is 1
        Planet mercury = new Planet(solar_system, sun, 50, 0, 7, 4.1477, "DARK_GRAY");
        sun.addPlanet(mercury);

        Planet venus = new Planet(solar_system, sun, 80, 30, 18, 1.6244, "ORANGE");
        sun.addPlanet(venus);

        Planet earth = new Planet(solar_system, sun, 120, 60, 20, 1, "BLUE");
        sun.addPlanet(earth);

        Moon moon = new Moon(solar_system, earth, 30, 90, 5, 13.5185, "GRAY");
        earth.addMoon(moon);

        Planet mars = new Planet(solar_system, sun, 160, 120, 10, 0.5313, "RED");
        sun.addPlanet(mars);

        Planet jupiter = new Planet(solar_system, sun, 220, 90, 50, 0.0843, "MAGENTA");
        sun.addPlanet(jupiter);

        Planet saturn = new Planet(solar_system, sun, 280, 180, 40, 0.04, "#ceb8b8");
        sun.addPlanet(saturn);

        // asteroids are modelled as planets for convenience
        Planet[] asteroids = new Planet[100];
        for(int i = 0; i < 50; i++) {
            asteroids[i] = new Planet(solar_system, sun, 175+(i%20), (i/100.0)*359.0, 2+(i%4), 0.3+(0.02*(i%4)), "#987654");
            sun.addPlanet(asteroids[i]);
        }
        for(int i = 50; i < 100; i++) {
            asteroids[i] = new Planet(solar_system, sun, 175+(i%13), (i/100.0)*359.0, 2+(i%5), 0.3+(0.02*(i%5)), "#987654");
            sun.addPlanet(asteroids[i]);
        }

        Planet uranus = new Planet(solar_system, sun, 320, 310, 30, 0.02, "#afdbf5");
        sun.addPlanet(uranus);

        Planet neptune = new Planet(solar_system, sun, 360, 260, 29, 0.01, "BLUE");
        sun.addPlanet(neptune);

        Planet pluto = new Planet(solar_system, sun, 380, 100, 4, 0.005, "LIGHT_GRAY");
        sun.addPlanet(pluto);

        Comet comet1 = new Comet(solar_system, sun, 180, 0, 10, 5, 0.5, "WHITE");
        sun.addComet(comet1);

        
        while(true) {
            for (Sun s : Sun.getSuns()) {
                for (Planet p : s.getPlanets()) {
                    for(Moon m : p.getMoons()) {
                        solar_system.drawSolarObjectAbout(m.getDistance(), m.getAngle(), m.getDiameter(), m.getColour(), p.getDistance(), p.getAngle());
                        m.setAngle(m.getAngle() + 5);
                    }
                    solar_system.drawSolarObjectAbout(p.getDistance(), p.getAngle(), p.getDiameter(), p.getColour(), s.getDistance(), s.getAngle());
                    p.setAngle(p.getAngle() - p.getOrbitalPeriod());
                }
                solar_system.drawSolarObject(s.getDistance(), s.getAngle(), s.getDiameter(), s.getColour());
                for(Comet c : s.getComets()) {
                    solar_system.drawSolarObjectAbout(c.getDistance(), c.getAngle(), c.getDiameter(), c.getColour(), s.getDistance(), s.getAngle());
                    c.setAngle(c.getAngle() - c.getOrbitalPeriod());
                    // Calculate new distance
                    double r = c.getOriginalDistance() * (1 - c.getEccentricity() * c.getEccentricity()) / (1 + c.getEccentricity() * Math.cos(c.getAngle() * Math.PI / 180));
                    c.setDistance(r);
                }
            }
            solar_system.finishedDrawing();
        }
    }
}