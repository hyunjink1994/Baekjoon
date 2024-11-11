import java.util.StringTokenizer;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        StringTokenizer st = new StringTokenizer(binomial, " ");
        
        // 첫 번째 숫자를 answer에 저장
        answer = Integer.parseInt(st.nextToken());
        
        // 연산자를 가져오기
        char chr = st.nextToken().charAt(0);
        
        // 두 번째 숫자를 가져오기
        int k = Integer.parseInt(st.nextToken());
        
        // 연산자에 따라 계산
        switch (chr) {
            case '+':
                answer += k;
                break;
            case '-':
                answer -= k;
                break;
            case '*':
                answer *= k;
                break;
        }
        
        return answer;
    }
}
