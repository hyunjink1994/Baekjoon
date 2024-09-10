import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String[] arr = new String[N];


        for(int i = 0; i < N; i++) {
            arr[i] = in.next();
        }
        
        Set<String> arr_dic = new HashSet<>(Arrays.asList(arr));
        String[] unique_arr = arr_dic.toArray(new String[0]);

        Arrays.sort(unique_arr, (e1 , e2)->{
            if (e1.length() != e2.length()) {
                return e1.length() - e2.length();
            }else{
                return e1.compareTo(e2);
            }
        } );

        for(String ele : unique_arr) {
            System.out.println(ele);
        }
    }
}