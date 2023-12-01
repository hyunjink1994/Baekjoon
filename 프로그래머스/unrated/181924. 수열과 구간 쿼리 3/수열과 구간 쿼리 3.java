class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        int row = queries.length;
        
        for(int i=0;i<row;i++){
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        
        answer = arr;
        return answer;
    }
}