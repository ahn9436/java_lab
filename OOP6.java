/*
โจทย์ 1: การคำนวณปริมาณน้ำดื่มที่จำเป็นสำหรับภารกิจอวกาศ
สถานการณ์: คุณเป็นนักบินอวกาศที่ประจำการบนสถานีอวกาศนานาชาติ (ISS) คุณต้องคำนวณปริมาณน้ำดื่มที่จำเป็นสำหรับตัวคุณเองและเพื่อนร่วมทีมตลอดระยะเวลาภารกิจ 6 เดือน
ข้อมูล:
จำนวนนักบินอวกาศบน ISS: 7 คน
ปริมาณน้ำดื่มที่ต้องการต่อคนต่อวัน: 2.5 ลิตร
อัตราการสูญเสียน้ำในอวกาศ (เหงื่อ การหายใจ ฯลฯ): 10% ของปริมาณน้ำดื่มที่บริโภค
งานที่ต้องทำ:
        เขียนโปรแกรม Java เพื่อคำนวณปริมาณน้ำดื่มที่จำเป็นทั้งหมดสำหรับภารกิจ 6 เดือน
        พิจารณาปัจจัยการสูญเสียน้ำในอวกาศและปรับการคำนวณให้สอดคล้องกัน
        แสดงผลลัพธ์ในหน่วยลิตร
 */

class WaterCalculation {

    public static void main(String[] args) {
        int astronauts = 7;
        double dailyWaterPerPerson = 2.5; //liters
        double waterLossRate = 0.10; // 10%
        int missionDurationDays = 6 * 30; // 6 เดือน

        double totalWaterNeeded = calculateTotalWaterNeeded(astronauts, dailyWaterPerPerson, waterLossRate, missionDurationDays);

        System.out.println("Total water needed for the mission " + totalWaterNeeded + " Liters");
    }

    //function ในการคำนานบริมาณนำ้
    public static double calculateTotalWaterNeeded(int astronauts, double dailyWaterPerPerson, double waterLossRate, int missionDurationDays) {
        double dailyWaterPerAstronaut = calculateDailyWaterWithLoss(dailyWaterPerPerson, waterLossRate);
        double totalDailyWater = calculateTotalDailyWater(astronauts, dailyWaterPerAstronaut);
        return calculateTotalWaterForMission(totalDailyWater, missionDurationDays);
    }

    //Function ใช่คำนานจำนวนนำต่อคน
    public static double calculateDailyWaterWithLoss(double dailyWaterPerPerson, double waterLossRate) {
        return dailyWaterPerPerson * (1 + waterLossRate);
    }

    // Function ความต้องการนำ้ทั้งหมอของนักบินอวกาศ
    public static double calculateTotalDailyWater(int astronauts, double dailyWaterPerAstronaut) {
        return astronauts * dailyWaterPerAstronaut;
    }

    //Function ในการคำนวนนำ้ตลอดภาระกิจ
    public static double calculateTotalWaterForMission(double totalDailyWater, int missionDurationDays) {
        return totalDailyWater * missionDurationDays;
    }
}