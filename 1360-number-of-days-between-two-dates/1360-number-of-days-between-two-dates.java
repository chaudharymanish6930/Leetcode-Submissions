class Solution {
    public int daysBetweenDates(String date1, String date2) {
        if(date1.compareTo(date2)>0){
            String temp=date1;
            date1=date2;
            date2=temp;
        }
        int days=0;
        while(!date1.equals(date2)){
            int y=Integer.parseInt(date1.substring(0,4));
            int m=Integer.parseInt(date1.substring(5,7));
            int d=Integer.parseInt(date1.substring(8,10));
            d++;
            days++;

            int maxdays=31;
            if(m==4 || m==6 || m==9 || m==11){
                maxdays=30;
            }
            else if(m==2){
                if(y%400==0 || (y%4==0 && y%100 !=0)){
                    maxdays=29;
                }else{
                        maxdays=28;
                    }
            }

            if(d>maxdays){
                d=1;
                m++;
                if(m>12){
                    m=1;
                    y++;
                }
            }
            date1 = String.format("%04d-%02d-%02d", y,m,d);
        }
        return days;
    }
}