// Vehicle class
class Vehicle {
    // Status or instance variables
    String type; //Type of vehicle (e.g., car, truck)
    String color; //Color of vehicle
    int speed; //Current speed of vehicle in km/h
    boolean isRunning; //Indicate whether the vehicle is running or not

    //Behaviors or method
    // <Method to start the vehicle
    void start() {
        isRunning = true;
        System.out.println(type + "started. It is now running.");
    }

    //Method to stop the vehicle
    void stop() {
        isRunning = false;
        speed = 0; //หยุด speed เลยเป็น 0
        System.out.println(type + "stopped.");
    }

    // Method to accelerate the vehicle
    void accelerate(int increment) {
        if (isRunning) {
            speed += increment;
            System.out.println(type + "accelerate to " + speed + "km/h.");
        } else {
            System.out.println(type + "is not running. Start the vehicle first.");
        }
    }

    // Method to decelerate the vehicle
    void decelerate(int decrement) {
        if (isRunning) {
            speed -= decrement;
            if (speed < 0) {
                speed = 0; //Ensure speed does not go below 0
            }
            System.out.println(type + "decelerated to " + speed + "km/h.");
        } else {
            System.out.println(type + "is not running. Start the vehicle first.");
        }
    }

    // Method to display current state of vehicle
    void displayState() {
        String runningStatus = isRunning ? "running" : "not running";
        System.out.println("Vehicle Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Current Speed: " + speed + "km/h.");
        System.out.println("Vehicle is " + runningStatus);
    }
}

//Main class
class Main {
    public static void main(String[] args) {
        //Creating object of Vehicle class
        Vehicle car = new Vehicle();
        Vehicle truck = new Vehicle();
        Vehicle suv = new Vehicle();

        //Setting properties of car
        car.type = "Car";
        car.color = "Red";

        //Setting properties for truck
        truck.type = "Truck";
        truck.color = "Blue";

        //Using behavior of car
        car.start();
        car.accelerate(50);
        car.decelerate(10);
        car.stop();
        car.displayState();

        //Using behavior of truck
        truck.start();
        truck.accelerate(30);
        truck.decelerate(5);
        truck.stop();
        truck.displayState();
    }
}