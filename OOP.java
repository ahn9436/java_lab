//Java is an object-oriented programming language
//The core concept of object-oriented approach is to break complex problems into smaller objects.
//
//An object is any entity that has a state and behavior.
//       For example, a bicycle is an object
//       It has
//          Attribute, Field, Statue: idle, first gear, etc
//          Method, Function , Behavior: breaking, accelerating, etc.
// Class defined as a BLUEPRINT explaining things provided in the class -- states, behaviors

class Bicycle {
    //Statue or field
    private final int gear = 5;
    private final int wheel = 2;

    //behavior or method
    public void breaking() {
        System.out.println("Working of Breaking");
    }
    public void gearChanging() {
        System.out.println("Changing the gear");
    }
}