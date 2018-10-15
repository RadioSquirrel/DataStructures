/**
 * Data Structures and Algorithms. Lesson 2. Homework_1
 * @author Plieva Maya
 * @version Oct 15, 2018
 */

import java.util.concurrent.*;

public class Homework_2 {
    public static void main (String[] args) {
        HugeArray arr = new HugeArray(10000);
        arr.fillArray(10000);
        HugeArray arr2 = new HugeArray(arr.getArray(), 10000);
        HugeArray arr3 = new HugeArray(arr.getArray(), 10000);
        /*arr.addElement(9);
        arr.addElement(8);
        arr.addElement(7);
        arr.insertElement(1,6);
        arr.deleteElement(2);
        arr.addElement(5);
        arr.addElement(1);
        /*System.out.println(arr.linearSearch(7));
        for(int i=0; i<arr.getSize(); i++) {
            System.out.println(i+" - " + arr.getElement(i));
        }*/
        long timeStart = System.nanoTime();
        arr.sortBubble();
        long timeResult = System.nanoTime()-timeStart;
        System.out.println("Bubble Sort's time is  " + timeResult + " nsec" );
        timeStart = System.nanoTime();
        arr2.sortSelect();
        timeResult = System.nanoTime()-timeStart;
        System.out.println("Select Sort's time is  " + timeResult + " nsec" );
        timeStart = System.nanoTime();
        arr3.sortInsert();
        timeResult = System.nanoTime()-timeStart;
        System.out.println("Insert Sort's time is  " + timeResult + " nsec" );
        //System.out.println("which is " + TimeUnit.SECONDS.convert(timeResult,TimeUnit.NANOSECONDS) + " nanoseconds" );
        //System.out.println(timeFinish-timeStart);
        /*for(int i=0; i<arr.getSize(); i++) {
            System.out.println(i+" - " + arr.getElement(i));
        }*/

        //System.out.println(arr.binarySearch(9));*/
    }
}