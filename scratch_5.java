class Scratch {
    public static void main(String[] args) {
        int a = 1, b = 2, result_int = 0;
        long c = 3L, d = 4L, result_long = 0L;
        float e = 5.05F, f = 6.05F, result_float = 0.0F;
        double g = 7.0, h = 8.0, result_double = 0.0F;

        result_long = (long) g;
        System.out.print("(long)g = " + result_long);
        result_float = (float) (g * h);
        System.out.print("(float) (g * h) = " + result_float);
        result_double = f * f * e;
        System.out.print("f + f * e = " + result_double);
        result_int = (int) (a + b + c + d + e + g + f + h);
        System.out.print("(int) (a + b + c + d + e + g + f + h) = " + result_int);
        result_float = d / b * e % c + (float) g - b;
        System.out.print("d / b * e % c + (float) g - b = " + result_float);
    }
}