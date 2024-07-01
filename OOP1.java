class Lamp {

    //store the value for light
    // true if light is on
    //false if light is off
    boolean is0n;

    //method to turn on the light
    void turn0n() {
        is0n = true;
        System.out.println("Light on?" + is0n);
    }

    //method to turn off the light
    void turn0ff() {
        is0n = false;
        System.out.println("Light on?" + is0n);
    }
}



class Main {
    public static void main(String[] args) {
        // Class Declaration and initiation
        //Create object 1.led and 2.halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        //turn on the light by
        //calling method turn0n()
        led.turn0n();
        halogen.turn0n();

        // turn off the light by
        //calling the method turn0ff()
        halogen.turn0ff();
        led.turn0ff();

    }
}