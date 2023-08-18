class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num1 = new int[nums.length];
        num1 = nums;
        int[] num2 = new int[nums.length];
        num2 = nums;
        int[] num3 = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, num3, 0, num1.length);
        System.arraycopy(num2, 0, num3, num1.length, num2.length);

        return num3;
    }
}