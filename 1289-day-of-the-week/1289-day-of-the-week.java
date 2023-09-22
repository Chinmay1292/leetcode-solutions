import java.util.*;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] d = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Date date = new Date(year-1900, month-1, day);
        return d[date.getDay()];
    }
}