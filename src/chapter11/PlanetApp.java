package chapter11;

public class PlanetApp {
    public static void main(String[] args) {
        Planet[] planeten = {Planet.MERCURIUS, Planet.VENUS, Planet.AARDE, Planet.MARS, Planet.JUPITER, Planet.SATURNUS, Planet.URANUS,
                Planet.NEPTUNUS};
        for (final Planet planet : planeten) {
            System.out.println(planet);
        }
    }
}
