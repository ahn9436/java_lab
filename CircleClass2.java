class Circle {
    //Private field
    private double radius = 1.0;


    //Con 1
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //Getter method
    public double getRadius() {
        return radius;
    }

    //Setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Method to calcualte area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Method calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    //ToString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    //Main Method
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea()); //Should print area
        System.out.println("Circumference: " + circle1.getCircumference()); // should print circumference

        //Create a Circle object using parameterized constructor
        Circle circle2 = new Circle(2.5);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea()); //Should print area
        System.out.println("Circumference: " + circle2.getCircumference()); // should print circumference

        circle2.setRadius(3.5);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea()); //Should print area
        System.out.println("Circumference: " + circle2.getCircumference()); // should print circumference
    }
}