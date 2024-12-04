//Create object inside the same class
// One Class Only

class Lamp {


    // Store the value for light
    //true if light is on
    // false if light is off
    boolean is0n;

    //method to turn  on the light
    void turn0n() {
        is0n = true;
        System.out.println("Light on?" + is0n);
    }

    public static void main(String[] args) {


        //create an object of Lamp
        Lamp led = new Lamp();

        //access method using object
        led.turn0n();
    }
        

}