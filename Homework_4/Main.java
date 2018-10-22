import java.util.Iterator;

 class Main {

     static void main (String[] args) {
        System.out.println("One-Way List");
        List listOne = new ListOneS();
        listOne.display();
        listOne.insertFirst(5);
        listOne.insertFirst(3);
        listOne.insertFirst(4);
        listOne.display();
        listOne.insertLast(5);
        System.out.println("Finded - " + listOne.findValue(3));
        System.out.println("Deleted - " + listOne.deleteValue(3));
        listOne.insertFirst(7);
        listOne.insertFirst(1);
        listOne.display();

        System.out.println();
        System.out.println("Two-Way List");
        List listTwo = new ListTwoS();
        listTwo.insertLast(5);
        listTwo.insertFirst(3);
        listTwo.insertLast(6);
        listTwo.insertFirst(8);
        listTwo.insertLast(4);
        listTwo.display();
        System.out.println("Last delete - " + listTwo.deleteLast());
        System.out.println("First delete - " + listTwo.deleteFirst());
        listTwo.display();
        System.out.println("Finded - " + listTwo.findValue(5));
        System.out.println("Deleted - " + listTwo.deleteValue(5));
        listTwo.insertLast(7);
        listTwo.insertLast(1);
        listTwo.display();

        System.out.println();
        System.out.println("Stack");
        Stack stack = new Stack();
        stack.pop(1);
        stack.pop(2);
        stack.pop(3);
        stack.pop(4);
        stack.display();
        System.out.println("Push - " + stack.push());
        System.out.println("Push - " + stack.push());
        stack.display();

        System.out.println();
        System.out.println("Queue");
        Queue que = new Queue();
        que.pop(1);
        que.pop(2);
        que.pop(3);
        que.pop(4);
        que.pop(5);
        que.pop(6);
        que.display();
        System.out.println("Push - " + que.push());
        System.out.println("Push - " + que.push());
        que.display();

        System.out.println();
        System.out.println("Iterator");
        ListOneS listOneI = new ListOneS();
        listOneI.insertFirst(5);
        listOneI.insertFirst(3);
        listOneI.insertFirst(4);
        listOneI.insertFirst(1);
        listOneI.insertFirst(2);
        listOneI.insertFirst(6);

        /*Iterator <Integer> iterator =  listOneI.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            System.out.println(next);
        }*/

        for (int value: listOneI) {
            System.out.println(value);
        }
    }
}
