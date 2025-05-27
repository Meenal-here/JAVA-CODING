import java.util.*;

class command {
    public static void main(String[] arg) {
        for (int i = 0; i < arg.length; i++) {
            String str = arg[i];
            int a = str.length(); // Fixed: 'Length()' should be 'length()'
            int b = 0;
            for (int j = 0; j < a; j++) {
                char ch = str.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    b++;
                }
            }
            System.out.printf("Word: %s  |  No. of characters: %d  |  No. of vowels: %d\n", str, a, b);
        }
    }
}
