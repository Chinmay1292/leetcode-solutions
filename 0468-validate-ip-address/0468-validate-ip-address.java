class Solution {
    public String validIPAddress(String IP) {
        if(isIPV4(IP)) return "IPv4";
        else if(isIPV6(IP)) return "IPv6";
        else return "Neither";
    }
    public boolean isIPV4(String ip){
        if(ip.length()<7) return false;
        if(ip.charAt(0)=='.') return false;
        if(ip.charAt(ip.length()-1)=='.') return false;
        String[] ts = ip.split("\\.");
        if(ts.length!=4) return false;
        for(String t : ts){
            if(!isIPV4Token(t)) return false;
        }
        return true;
    }
    public boolean isIPV4Token(String t){
        if(t.startsWith("0") && t.length()>1) return false;
        try{
            int pI = Integer.parseInt(t);
            if(pI<0 || pI>255) return false;
            if(pI==0 && t.charAt(0)!='0') return false;
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    public boolean isIPV6(String ip){
        if(ip.length()<15) return false;
        if(ip.charAt(0)==':') return false;
        if(ip.charAt(ip.length()-1)==':') return false;
        String[] ts = ip.split(":");
        if(ts.length!=8) return false;
        for(String t : ts){
            if(!isIPV6Token(t)) return false;
        }
        return true;
    }
    public boolean isIPV6Token(String t){
        if(t.length()>4 || t.length()==0) return false;
        char[] chars = t.toCharArray();
        for(char c : chars){
            boolean isD = c>='0' && c<='9';
            boolean isU = c>='A' && c<='F';
            boolean isL = c>='a' && c<='f';
            if(!(isD || isU || isL))
            return false;
        }
        return true;
    }
}