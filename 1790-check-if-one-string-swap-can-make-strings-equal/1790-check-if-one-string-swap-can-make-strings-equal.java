class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        char[] arr=s1.toCharArray();
        for(int i=0; i<s1.length(); i++){
            for(int j=i; j<s1.length(); j++){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                if(new String(arr).equals(s2)){
                    return true;
                }

                char t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        return false;
    }
}