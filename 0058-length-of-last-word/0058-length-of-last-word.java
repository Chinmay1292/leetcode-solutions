class Solution {
    public int lengthOfLastWord(String s) {
        String[] c = s.split(" ");
        System.out.println(c[c.length-1]);
        return c[c.length-1].length();
    }
}