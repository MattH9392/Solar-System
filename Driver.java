public class Driver {
    public static void main(String[] args) {

        SolarSystem solar_system = new SolarSystem(1600, 900);

        Sun sun = new Sun(solar_system, 0, 0, 60);
        Sun.addSun(sun);

        // Orbital periods: Earth is 1
        Planet mercury = new Planet(solar_system, sun, 50, 180, 7, 4.1477, "DARK_GRAY");
        sun.addPlanet(mercury);


        Planet venus = new Planet(solar_system, sun, 100, 180, 18, 1.6244, "ORANGE");
        sun.addPlanet(venus);

        Planet earth = new Planet(solar_system, sun, 150, 180, 20, 1, "BLUE");
        sun.addPlanet(earth);

        Moon moon = new Moon(solar_system, earth, 30, 180, 5, 13.5185, "GRAY");
        earth.addMoon(moon);

        Planet mars = new Planet(solar_system, sun, 200, 180, 10, 0.5313, "RED");
        sun.addPlanet(mars);

        Planet jupiter = new Planet(solar_system, sun, 300, 180, 50, 0.0843, "MAGENTA");
        sun.addPlanet(jupiter);

        

        
        
            
        

        while(true) {
            // solar_system.drawSolarObject(0, 0, 36, "YELLOW");

            
            for (Sun s : Sun.getSuns()) {
                for (Planet p : s.getPlanets()) {
                    for(Moon m : p.getMoons()) {
                        solar_system.drawSolarObjectAbout(m.getDistance(), m.getAngle(), m.getDiameter(), m.getColour(), p.getDistance(), p.getAngle());
                        m.setAngle(m.getAngle() + 5);
                    }
                    solar_system.drawSolarObjectAbout(p.getDistance(), p.getAngle(), p.getDiameter(), p.getColour(), s.getDistance(), s.getAngle());
                    // solar_system.drawSolarObject(p.getDistance(), p.getAngle(), p.getDiameter(), p.getColour());
                    p.setAngle(p.getAngle() - p.getOrbitalPeriod());
                }
                solar_system.drawSolarObject(s.getDistance(), s.getAngle(), s.getDiameter(), s.getColour());
            }





            // try{
            //     Thread.sleep(50);
            // } catch(InterruptedException e) {
            //     System.out.println("Sleep not possible");
            // }
            
            solar_system.finishedDrawing();
        }
    
    }

    // // Increase size of planets array by 1 and add a new planet
    // static Planet[] addPlanet(Planet[] planets, Planet planet) {
    //     Planet newPlanets[] = new Planet[planets.length + 1];
    //     for(int i = 0; i < planets.length; i++)
    //         newPlanets[i] = planets[i];
    //     planets = newPlanets;
    //     planets[planets.length - 1] = planet;
    //     System.out.println("Added planet. array length = " + planets.length);
    //     return planets;
    // }

    

}