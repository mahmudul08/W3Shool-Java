public class java_type_casting {
    public static void main(String[] args) {
        int myInt = 5;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        double myValue = 5.78d;
        int myTwo = (int) myValue;

        System.out.println(myValue);
        System.out.println(myTwo);
    }
}
