class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        String str="";
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i)=='1'){
                str=str+'0';
            }
            else{
                str=str+'1';
            }
        }
        int x=Integer.parseInt(str,2);
        return x;
    }
}