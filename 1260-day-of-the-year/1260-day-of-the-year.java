class Solution {
    public int dayOfYear(String date) {
        String[] s = date.split("-");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);
        boolean isLeap = checkYEar(y);
        int no = 0;

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=0; i<m-1; i++){
            if(isLeap && i==1){
                no+=days[i]+1;
                continue;
            }
            no+=days[i];
        }
        return no+d;
    }
    public boolean checkYEar(int y){
        if(y%400==0){
            return true;
        }
        if(y%100==0)
        return false;
        if(y%4==0)
        return true;

        return false;
    }
}