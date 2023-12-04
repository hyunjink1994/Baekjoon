class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            int count = queries[i][2];
            
            for(int j=start; j<= end; j++){
                if(j % count == 0){
                    arr[j]++;
                }
            }
            
        }
        
        answer = arr;
        
        return answer;
    }
}