/*public class java_breakcontinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 10) {
                continue;
            }
            System.out.println(i);
        }
    }
}
*/

public class java_breakcontinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
