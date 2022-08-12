/* 
public class java_ifelse {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater than x");
        }
    }
}
*/

/* 
public class java_ifelse {
    public static void main(String[] args) {
        int time = 19;

        if (time < 20) {
            System.out.println("Good morning");
        } else if (time < 7) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");

        }
    }
}
*/
public class java_ifelse {
    public static void main(String[] arg) {
        int x = 20;

        String result = (x < 20) ? "Good Night" : "Good Morning";
        System.out.println(result);
    }
}