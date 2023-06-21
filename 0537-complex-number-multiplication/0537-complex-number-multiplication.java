class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String str1[] = num1.split("\\+");
        String[] str2 = num2.split("\\+");

        int a = Integer.valueOf(str1[0]);
        int b = Integer.valueOf(str1[1].replace("i",""));
        int c = Integer.valueOf(str2[0]);
        int d = Integer.valueOf(str2[1].replace("i",""));

        int ans_real = a*c-b*d;
        int ans_imag = b*c+a*d;

        String ans="";
        ans+=ans_real+"+"+ans_imag+"i";
        return ans;
    }
}