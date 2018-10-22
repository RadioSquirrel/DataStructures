package iteratorPackage;

public class MainIterator {

    public static void main (String[] args) {
        ListUnit list = new ListUnit();
        IteratorImpl itr = new IteratorImpl(list);

        itr.insertAfter("Harry", "Potter");
        itr.insertBefore("Draco", "Malfoy");
        itr.insertAfter("Hermione", "Granger");
        itr.insertBefore("Ron", "Wesley");
        itr.insertAfter("Luna", "Lovegood");
        itr.insertBefore("Bellatrix", "Lestrange");
        itr.insertAfter("Sirius", "Black");

        list.display();
        System.out.println("Current unit - " + itr.getCurrent());
        itr.nextLink();
        itr.nextLink();
        itr.nextLink();
        System.out.println("iterator at end - " + itr.atEnd());
        itr.reset(); 
        System.out.println("Current unit (reset) - " + itr.getCurrent());
        System.out.println("iterator at end - " + itr.atEnd());
        itr.nextLink();
        System.out.println("Delete current - " + itr.deleteCurrent());
        System.out.println("Current unit (nextLink and delete) - " + itr.getCurrent());
        itr.prevLink();
        System.out.println("Current unit (prevLink) - " + itr.getCurrent());
        list.display();
    }
}
