class Solution {
    public String convertDateToBinary(String date) {
        String[] ans=date.split("-");
        int year=Integer.parseInt(ans[0]);
        int month=Integer.parseInt(ans[1]);
        int day=Integer.parseInt(ans[2]);
        String y=Integer.toBinaryString(year);
        String m=Integer.toBinaryString(month);
        String d=Integer.toBinaryString(day);
        return y + "-"+ m +"-"+ d;
    }
}