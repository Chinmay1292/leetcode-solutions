class Solution {
    public int reverse(int x) {

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }

        String s = String.valueOf(x);
        StringBuilder sc = new StringBuilder(s);
        StringBuilder k = sc.reverse();
        String r = k.toString();
        try {
            int y = Integer.parseInt(r);
            return isNegative ? -y : y;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}