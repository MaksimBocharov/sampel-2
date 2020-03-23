package Lesson7;

public class tests {
    public static void main(String[] args) {
        String a = new String("wow!");
        String b = new String("wow!");
        String someA = a;
        boolean r1 = a == b;
        boolean r2 = a.equals(b);
        boolean r3 = a == someA;
        System.out.println(r2);
        System.out.println(r1);
        System.out.println(r3);
    }
}
