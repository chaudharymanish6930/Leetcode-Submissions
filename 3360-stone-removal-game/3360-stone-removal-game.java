class Solution {
    public boolean canAliceWin(int n) {
        int stones=10;
        boolean alice=true;

        while(n >= stones){
            n=n-stones;
            stones--;
            alice=!alice;
        }
        return !alice;
    }
}