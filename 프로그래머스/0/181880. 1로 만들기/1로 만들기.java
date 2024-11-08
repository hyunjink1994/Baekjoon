class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i=0; i<num_list.length; i++){
            int k = num_list[i];
            
            while(k!=1){
                if(k%2 == 0){
                    k/=2;
                    answer+=1;
                    continue;
                }else{
                    k-=1;
                    k/=2;
                    answer+=1;
                    continue;
                }
            }
        }
        
        return answer;
    }
}