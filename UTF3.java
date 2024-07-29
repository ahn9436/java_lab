class TravelTimeCalculator {

    // 3. UDF with parameters and no return value
    public static void CalculatorTravelTime(double distance, double speed) {
        double time = distance / speed; // Time = Distance / Speed
        System.out.println("At speed of " + speed + " meters per second, it will take " + time + " second to travel " + distance + "meters.");
    }
    public static void main(String[] args) {
        double distanceToMars = 22500000000.0; //Average distance to mars
        double spaceshipSpeed = 25000; //Speed of spaceship meters per second
        // Call the UTF
        CalculatorTravelTime(distanceToMars, spaceshipSpeed);
    }
}