import java.util.Calendar;
import java.time.LocalDate;

public class DayChecker {

    public static int getTodayDayOfWeek() {
        return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    }

    public static boolean isAlternateDay(int dayOfWeek) {
        return (dayOfWeek == Calendar.TUESDAY ||
                dayOfWeek == Calendar.THURSDAY ||
                dayOfWeek == Calendar.SATURDAY);
    }

    public static String getDayName(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.MONDAY:    return "Monday";
            case Calendar.TUESDAY:   return "Tuesday";
            case Calendar.WEDNESDAY: return "Wednesday";
            case Calendar.THURSDAY:  return "Thursday";
            case Calendar.FRIDAY:    return "Friday";
            case Calendar.SATURDAY:  return "Saturday";
            case Calendar.SUNDAY:    return "Sunday";
            default:                 return "Unknown";
        }
    }

    public static String getScheduleLabel(int dayOfWeek) {
        return isAlternateDay(dayOfWeek)
            ? "Tue/Thu/Sat schedule - showing items 2, 4, 6"
            : "Mon/Wed/Fri/Sun schedule - showing items 1, 3, 5";
    }

    public static String getTodayFullLabel() {
        int day = getTodayDayOfWeek();
        LocalDate date = LocalDate.now();
        return "Date: " + date + " | Day: " + getDayName(day) + " | " + getScheduleLabel(day);
    }

    public static int getDayOfWeekFromChoice(int choice) {
        switch (choice) {
            case 1: return Calendar.MONDAY;
            case 2: return Calendar.TUESDAY;
            case 3: return Calendar.WEDNESDAY;
            case 4: return Calendar.THURSDAY;
            case 5: return Calendar.FRIDAY;
            case 6: return Calendar.SATURDAY;
            case 7: return Calendar.SUNDAY;
            default: return getTodayDayOfWeek();
        }
    }
}