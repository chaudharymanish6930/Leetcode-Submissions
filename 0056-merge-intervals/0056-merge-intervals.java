class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        for(int[] row: intervals){
            list.add(row);
        }

        boolean merge=true;
        while(merge){
            merge=false;
            for(int i=0; i<list.size(); i++){
                for(int j=i+1; j<list.size(); j++){
                    int[] x=list.get(i);
                    int[] y=list.get(j);

                    if(Math.max(x[0], y[0]) <= Math.min(x[1], y[1])){
                        x[0] =Math.min(x[0], y[0]);
                        x[1]=Math.max(x[1],y[1]);

                        list.remove(j);
                        merge=true;
                        break;
                    }
                }
                if(merge) break;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}        