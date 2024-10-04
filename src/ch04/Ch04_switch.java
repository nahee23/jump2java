package ch04;

public class Ch04_switch {
    public static void main(String[] args) {
        /* switch : if 문과 비슷하지만 일정한 형식이 있는 조건 */
        /* 조건이 여러개이면서 입력값이 정해져 있을때 */
        int month = 10;
        String monthString = "";
        switch (month) {
            case 1:monthString = "January";
            break;
            case 2:monthString = "February";
            break;
            case 3:monthString = "March";
            break;
            case 4:monthString = "April";
            break;
            case 5:monthString = "May";
            break;
            case 6:monthString = "June";
            break;
            case 7:monthString = "July";
            break;
            case 8:monthString = "August";
            break;
            case 9:monthString = "September";
            break;
            case 10:monthString = "October";
            break;
            case 11:monthString = "November";
            break;
            case 12:monthString = "December";
            break;
            default:monthString = "Invalid month";
            break;
        }
        System.out.println(monthString);
    }
}
