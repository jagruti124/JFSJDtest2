import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeConversion {
    public static void main(String[] args) {
        String inputTime = "3:30:45 PM";

        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
            Date date = inputFormat.parse(inputTime);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            String amPm = calendar.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

            if (amPm.equals("PM") && hour != 12) {
                hour += 12;
            }

            else if (amPm.equals("AM") && hour != 12) {
                hour = 0;
            }

            String militaryTime = String.format("%02d:%02d:%02d", hour, minute, second);
            System.out.println("Military Time: " + militaryTime);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
