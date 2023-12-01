class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            int input = -1;
            
            for(int j=queries[i][0]; j< queries[i][1]+1; j++){
                if(arr[j] > queries[i][2]){
                    int tmp = arr[j];
                    if(input > tmp || input == -1){
                        input = tmp;
                    }
                }
            }
            answer[i] = input;
        }
        
        
        return answer;
    }
}