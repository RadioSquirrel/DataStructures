package coupString;

public class String {
    public static void main (String[] argd) {
        CharString arrStr = new CharString("Queue");
        System.out.println(arrStr.coup());

        CharStringStack arrStr2 = new CharStringStack("Statement");
        arrStr2.coup();
    }
}