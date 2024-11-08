class Solution {
    public String solution(String myString) {
        String answer = "";
        String str = myString.toLowerCase();
        
        
        for(int i = 0; i< myString.length(); i++){
            char st = str.charAt(i);
            if(st=='a'){
                answer+="A";
            }else{
                answer+=st;
            }
        }
        
        return answer;
    }
}