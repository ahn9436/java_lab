class scratch8  {
    // main function
    public static void main(String[] args) {
        int a = 100000;
        System.out.printf("%d%n",a);
        System.out.printf("%,d%n", a);

        // Printing Double Value with
        // Different Formatting
        double b = 3.14159265;
        System.out.printf("%f\n", b);
        System.out.printf("%5.2f\n", b);
        System.out.printf("%5.3f\n", b);
        System.out.printf("%6.3f\n", b);

        Boolean c = false;
        Integer d = null;
        Integer e = 123456;
        System.out.printf("%b\n", c);
        System.out.printf("%B\n", d);
        System.out.printf("%B\n", e);

        char f = 'z';
        //Formatting Done
        System.out.printf("%c\n", f);
        // Coverting into Uppercase using Capital C
        System.out.printf("%C\n", f);
    }
}