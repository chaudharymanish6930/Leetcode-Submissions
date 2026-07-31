class Solution {
    public String reverseByType(String s) {
        char[] arr= s.toCharArray();
        int x=0;
        int y=arr.length-1;

        while(x<y){
            while(x<y && isSpecial(arr[x])) x++;
            while(x<y && isSpecial(arr[y])) y--;

            if(x<y){
                char a=arr[x];
                arr[x]= arr[y];
                arr[y]=a;
                x++;
                y--;
            }
        }

        x=0;
        y=arr.length-1;
        while(x<y){
            while(x<y && !isSpecial(arr[x])) x++;
            while(x<y && !isSpecial(arr[y])) y--;

            if(x<y){
                char t=arr[x];
                arr[x]=arr[y];
                arr[y]=t;
                x++;
                y--;
            }
        }
        return new String(arr);
    }

    public boolean isSpecial(char c){
        return "!@#$%^&*()".indexOf(c) !=-1;
    }
}