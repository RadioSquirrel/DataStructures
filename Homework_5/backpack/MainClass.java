package backpack;

import java.util.ArrayList;

class MainClass {
    public static void main(String[] args) {
        ArrayList <Thing> arr = new ArrayList<>();
        arr.add(new Thing("pot", 1, 3));
        arr.add(new Thing("book", 1, 6));
        arr.add(new Thing("binoculars", 7, 5));
        arr.add(new Thing("aid-kit", 4, 7));
        arr.add(new Thing("laptop", 5, 4));

        Backpack bp = new Backpack(5);
        //bp.pickupThing2(arr, 0, 0, cArr, mArr);
        bp.pickupThing(arr);

        System.out.println(bp);
    }
}