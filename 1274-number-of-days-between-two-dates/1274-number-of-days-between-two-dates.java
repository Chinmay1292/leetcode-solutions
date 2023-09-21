import java.time.*;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");

        LocalDate start = LocalDate.of(Integer.parseInt(d1[0]), Integer.parseInt(d1[1]), Integer.parseInt(d1[2]));
        LocalDate end = LocalDate.of(Integer.parseInt(d2[0]), Integer.parseInt(d2[1]), Integer.parseInt(d2[2]));
        long days = ChronoUnit.DAYS.between(start, end);
        return Math.abs((int) days);
    }
}