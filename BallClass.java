class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    //Constructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    //Getter methods
    public float getX() { return x;}

    public float getY() { return y;}

    public int getRadius() { return radius;}

    public float getxDelta() { return xDelta;}

    public float getyDelta() { return yDelta;}

    //Setter
    public void setX(float x) { this.x = x;}

    public void setY(float y) { this.y = y;}

    public void setRadius(int radius) { this.radius = radius;}

    public void setxDelta(float xDelta) { this.xDelta = xDelta;}

    public void setyDelta(float yDelta) { this.yDelta = yDelta;}

    // Method to reflect the ball horizontally
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Method to reflect the ball horizontally
    public void reflectHorizontal() { xDelta = -xDelta; }

    // Method to reflect the ball vertically
    public void reflectVertical() { yDelta = -yDelta; }

    // toString method to represent the ball as string
    public String toString() { return String.format("Ball[(%.1f, %.1f), speed=(%.1f, %.1f)]", x, y, xDelta, yDelta); }

    public static void main(String[] args) {
        // Create Ball object with different parameters
        Ball ball1 = new Ball(0, 0, 10, 2, 3);
        Ball ball2 = new Ball(50, 50, 20, -2, 4);
        Ball ball3 = new Ball(100, 100, 15, 3, -3);
        Ball ball4 = new Ball(25, 25, 8, 1, 1);
        Ball ball5 = new Ball(75, 75, 5, -1, -1);

        // แสดงผล
        System.out.println("Initial states:");
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        System.out.println(ball4);
        System.out.println(ball5);

        // ขยับและแสดงผล
        ball1.move();
        ball2.move();
        ball3.move();
        ball4.move();
        ball5.move();

        System.out.println("\nAfter one move:");  // \n ขึ้นบรรทัดใหม่
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        System.out.println(ball4);
        System.out.println(ball5);

        // สะท้อนลูกบอล
        ball1.reflectHorizontal();
        ball2.reflectVertical();
        ball3.reflectHorizontal();
        ball4.reflectVertical();
        ball5.reflectHorizontal();

        System.out.println("\nAfter reflection:");  // \n ขึ้นบรรทัดใหม่
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        System.out.println(ball4);
        System.out.println(ball5);

    }
}