import java.util.*;
public class stringGame {
    public static void main(String [] args){
        String input1 = "abc";
        String input2 = "ccc";
        int k = 3;
        boolean result = match(k, input1, input2);

        System.out.println(result);

    }

    public static boolean match(int K, String S, String T) {

        char source[] = S.toCharArray();
        char result[] = T.toCharArray();

        for (int i=0 ; i<source.length ; i++) {
            if (source[i] == result[i]) {
                continue;
            }
            for (int j=1; j <= K ; j++) {
                int a = (int) source[i];
                a = a + j;
                if (a > (int) 'z') {
                    a = (int) 'a' + a - (int) 'z' - 1;
                }

                if((char) a == result[i]) {
                    source[i] = (char) a;
                    break;
                }
            }
        }

        if ((String.valueOf(source)).equals(T)) {
            return true;
        }

        return false;
    }
}
