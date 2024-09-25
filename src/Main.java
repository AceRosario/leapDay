import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        inputDate();
        inputDate();
    }

    public static void inputDate(){
        JTextField dayInput = new JTextField();
        JTextField monthInput = new JTextField();
        JTextField yearInput = new JTextField();

        Object[] message = {
                "Day:", dayInput,
                "Month:", monthInput,
                "Year:", yearInput
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Enter the date", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            int day = Integer.parseInt(dayInput.getText());
            int month = Integer.parseInt(monthInput.getText());
            int year = Integer.parseInt(yearInput.getText());

            Day date = new Day(day, month);

            int dayNum = date.findDayNum();

            // Check for leap year and adjust dayNum if necessary
            if (((year % 400) == 0) || ((year % 4) == 0 && (year % 100) != 0)) {
                // Leap year
                if (month > 2) {
                    dayNum = dayNum + 1;
                }
            }

            String messageOutput = "Date: " + month + "/" + day + "/" + year + "\nDay number of the year: " + dayNum;
            JOptionPane.showMessageDialog(null, messageOutput);
        }
    }
}
