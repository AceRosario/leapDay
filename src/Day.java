public class Day {
    private int dayValue;
    protected int monthValue;

    public Day (int day, int month){
            this.dayValue = day;
            this.monthValue = month;
    }


    public int getDayValue(){
        return dayValue;
    }

    public int getMonthValue(){
        return monthValue;
    }

    public int findDayNum() {
        int dayNum = 0;

        switch (monthValue) {
            case 1:
                dayNum = dayValue;
                break;
            case 2:
                dayNum = 31 + dayValue;
                break;
            case 3:
                dayNum = 31 + 28 + dayValue;
                break;
            case 4:
                dayNum = 31 + 28 + 31 + dayValue;
                break;
            case 5:
                dayNum = 31 + 28 + 31 + 30 + dayValue;
                break;
            case 6:
                dayNum = 31 + 28 + 31 + 30 + 31 + dayValue;
                break;
            case 7:
                dayNum = 31 + 28 + 31 + 30 + 31 + 30 + dayValue;
                break;
            case 8:
                dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + dayValue;
                break;
            case 9:
                dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + dayValue;
                break;
            case 10:
                dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dayValue;
                break;
            case 11:
                dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dayValue;
                break;
            case 12:
                dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dayValue;
                break;
            default:
                System.out.println("invalid");
                break;
        }

        return dayNum;
    }



}
