class SpeedOfLight {

    // 2. UTF without parameters but with a return value
    public static double getASpeedOfLight() {
        return 299792458; // ความเร็วแสง
        
    }
    public static void main(String[] args) {
        // Call the UDF and store the return value
        double speedOfLight = getASpeedOfLight();
        System.out.println("Speed of light is:" + speedOfLight + "meters per second");
    }
}