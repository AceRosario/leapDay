public class Day {
    private int dayValue;
    protected int monthValue;
    private int yearValue;

    public Day (int day, int month, int year){
            this.dayValue = day;
            this.monthValue = month;
            this.yearValue = year;
    }


    public int getDayValue(){
        return dayValue;
    }

    public int getMonthValue(){
        return monthValue;
    }

    public int getYearValue() {
        return yearValue;
    }

    private boolean isLeapYear() {
        if ((yearValue % 4 == 0 && yearValue % 100 != 0) || (yearValue % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int findDayNum() {
        int dayNum = 0;
        int leapDay = 28;

        if (isLeapYear()) {
            leapDay = 29;
        }


        switch (monthValue) {
            case 1:
                dayNum = dayValue;
                break;
            case 2:
                dayNum = 31 + dayValue;
                break;
            case 3:
                dayNum = 31 + leapDay + dayValue;
                break;
            case 4:
                dayNum = 31 + leapDay + 31 + dayValue;
                break;
            case 5:
                dayNum = 31 + leapDay + 31 + 30 + dayValue;
                break;
            case 6:
                dayNum = 31 + leapDay + 31 + 30 + 31 + dayValue;
                break;
            case 7:
                dayNum = 31 + leapDay + 31 + 30 + 31 + 30 + dayValue;
                break;
            case 8:
                dayNum = 31 + leapDay + 31 + 30 + 31 + 30 + 31 + dayValue;
                break;
            case 9:
                dayNum = 31 + leapDay + 31 + 30 + 31 + 30 + 31 + 31 + dayValue;
                break;
            case 10:
                dayNum = 31 + leapDay + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dayValue;
                break;
            case 11:
                dayNum = 31 + leapDay + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dayValue;
                break;
            case 12:
                dayNum = 31 + leapDay + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dayValue;
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        return dayNum;
    }



}
