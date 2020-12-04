public class WordBreak {
    public static void main(String[] args) {
        String A = "aaaa";
        String[] B = {"a", "aa"};
        int result = breakWord(A, B);
        System.out.println(result);
    }

    public static int breakWord(String input, String[] words) {
        int count = 0;
        for (String s : words) {
            if (input.contains(s)) {
                count++;
            }
        }

        if (count == words.length) {
            return 1;
        }
        return 0;
    }
}
