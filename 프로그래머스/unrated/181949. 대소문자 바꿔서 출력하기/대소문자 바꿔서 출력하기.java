import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int aLength = a.length();
        String answer = "";

        for(int i = 0; i<aLength; i++){
            int asc = (int) a.charAt(i);

            if(asc < 97){
                answer+=String.valueOf((char) (asc+32));
            }
            else{
                answer+=String.valueOf((char)(asc-32));
            }
        }


        System.out.println(answer);
    }
}
