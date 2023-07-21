public class test1 {
    public static String mergeAlternately(String word1, String word2) {
        String a = "";
        for (int i = 0; i < word1.length(); i++) {
            a = a + word1.charAt(i) + word2.charAt(i);
        }
        System.out.print(a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("sad", "aasdds"));
    }
}
