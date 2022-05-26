package number1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class App {
    public static final String STR = "All spaces in the string should be retained.";

    public static void main(String[] args) {
        System.out.println(STR);
        System.out.println(reverseWords(STR));
    }

    public static String reverseWords(final String original){
        String[] words = original.split(" ");
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                newString.append(" ");
            }
            char[] liter = words[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = liter.length - 1; j >= 0; j--) {
                sb.append(liter[j]);
            }
            newString.append(sb.toString());
        }
        return newString.toString();
    }
}
