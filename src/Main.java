import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    inputDate();
    inputDate();


    }

    public static void inputDate() {
        JTextField dayInput = new JTextField();
        JTextField monthInput = new JTextField();
        JTextField yearInput = new JTextField();

        Object[] message = {
                "Day:", dayInput,
                "Month:", monthInput,
                "Year:", yearInput
        };

        int option = JOptionPane.showConfirmDialog
                (null, message, "Enter the date", JOptionPane.OK_CANCEL_OPTION);


        if (option == JOptionPane.OK_OPTION) {
            int day = Integer.parseInt(dayInput.getText());
            int month = Integer.parseInt(monthInput.getText());
            int year = Integer.parseInt(yearInput.getText());

            Day date = new Day(day, month, year);


            JOptionPane.showMessageDialog
                    (null, "The day number is: " + date.findDayNum());
        }

    }
}