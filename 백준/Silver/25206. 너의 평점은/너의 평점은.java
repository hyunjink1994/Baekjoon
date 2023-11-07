import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str;
        String[] studyChar = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P", };
        float[] studyScore = {4.5F, 4.0F, 3.5F, 3.0F, 2.5F, 2.0F, 1.5F, 1.0F, 0.0F};

        float studyCount = 0;
        float studyScoreSum = 0;

        for (int i = 0; i < 20; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            String name = st.nextToken();
            float studyF = Float.parseFloat(st.nextToken());
            String studyStr = st.nextToken();
            if(studyStr.equals(studyChar[9])){
                continue;
            }else{
                studyCount += studyF;
                for (int j = 0; j < studyChar.length; j++) {
                    if(studyChar[j].equals(studyStr)){
                        studyScoreSum+=studyScore[j]*studyF;
                        break;
                    }
                }
            }
        }
        System.out.printf("%6f",studyScoreSum/studyCount);
    }
}
