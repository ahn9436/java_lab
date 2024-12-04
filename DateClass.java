class Date {
    // Private variable can only be used in that class
    private int day;
    private int mouth;
    private int year;

    //Constructor
    public Date(int day, int mouth, int year) {
        this.day = day;
        this.mouth = mouth;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMouth() {
        return mouth;
    }

    public int getYear() {
        return year;
    }

    //Setter
    public void setYear(int year) {
        this.year = year;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public void setDay(int day) {
        if (day > 31) {
            this.day = 31;
        } else {
            this.day = day;
        }
    }

    public String toString() {
        return String.format("%02d,%02d,%04d", day, mouth, year);
    }


    // Main method
    public static void main(String[] args) {
        // Create date object
        Date date1 = new Date(30, 1, 2000);
        Date date2 = new Date(1, 4, 2080);
        Date date3 = new Date(10, 1, 2040);


        //Print original date
        System.out.println("Original Date:");
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);


        //ใช้ Setter ปรับปรุง
        date1.setDay(99);
        date1.setMouth(12);
        date1.setYear(2000);


        //Print Modifying Date
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}