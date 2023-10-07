class Solution {
    public double angleClock(int hour, int minutes) {
        int min = hour*60+minutes;
        double hourAngle = min*0.5;
        double minAngle = minutes*6;
        if(hourAngle>=360){
            hourAngle -= 360;
        }
        double ams = Math.abs(minAngle-hourAngle);
        if(ams>180.00){
            ams = 360.00-ams;
        }
        return ams;
    }
}