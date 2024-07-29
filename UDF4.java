class GravitationalForceCalculator {

    // 4. UDF with parameters but with a return value
    public static double calculateGravitationalForce(double mass1, double mass2, double distance) {
        double G = 6.67430e-11; // Some สมการทางวิทยาศาสตร์
        return (G * mass1 * mass2) / (distance * distance);
    }
    public static void main(String[] args) {
        double earthMass = 5.97e24; // Mass of the earth กิโล
        //5.97e24; = 5.97 * 10^24 = 5.97 * 10,000,000,000,000,000,000
        double spaceshipMass = 2.0e6; //Mass of spaceship
        double distance = 3.84e8;
        // Call the UDF and store the return value
        double force = calculateGravitationalForce(earthMass, spaceshipMass, distance);
        System.out.printf("The gravitational force between Earth and the spaceship is; %.2e Newton.%n", force);
    }
}