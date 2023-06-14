import java.util.LinkedList;
import java.util.ListIterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //LinkedList<String> PlaceToVisit = new LinkedList<>();
        //or:
        var PlacesToVisit = new LinkedList<String>();

        PlacesToVisit.add("USA");
        PlacesToVisit.add(0,"Canada");
        System.out.println(PlacesToVisit);

        addMoreElements(PlacesToVisit);
        System.out.println(PlacesToVisit);

        //comment getting elements before using remove elements//
        /*removeElements(PlacesToVisit);
        System.out.println(PlacesToVisit);*/


        gettingElements(PlacesToVisit,4);
       // printItinery(PlacesToVisit);
       // printItinery2(PlacesToVisit);
       // printItinery3(PlacesToVisit);

        //testIterator(PlacesToVisit);
        testListIterator(PlacesToVisit);
    }

    private static void addMoreElements(LinkedList<String> linkedList){
        linkedList.addFirst("France");
        linkedList.addLast("Italy");
        //Queue Methods
        linkedList.offer("China");  // adds to the tail

        linkedList.offerFirst("Mexico");
        linkedList.offerLast("India");

        linkedList.push("Germany");
        linkedList.push("Russia");
        linkedList.push("Turkey");
        linkedList.push("Ukraine");
    }

    private static void removeElements(LinkedList<String> linkedList){
        linkedList.remove(4);
        linkedList.remove("Germany");

        System.out.println(linkedList);
        String s1 = linkedList.remove(); //removes first element
        System.out.println(s1 + " was removed");

        String s2 = linkedList.removeFirst(); //removes first element
        System.out.println(s2 + " was removed");

        String s3 = linkedList.removeLast(); //removes last element
        System.out.println(s3 + " was removed");

        //Queue/Deque poll methods
        String p1 = linkedList.poll(); //removes first element
        System.out.println(p1 + " was removed");

        String p2 = linkedList.pollFirst(); //removes first element
        System.out.println(p2 + " was removed");

        String p3 = linkedList.pollLast(); //removes last element
        System.out.println(p3 + " was removed");

        String s4 = linkedList.pop(); //removes first element
        System.out.println(s4 + " was removed");
    }

    private static void gettingElements(LinkedList<String> linkedList,int index){

        System.out.println("Retrieved Element = " + linkedList.get(index));

        System.out.println("Retrieved First Element = " + linkedList.getFirst());
        System.out.println("Retrieved Last Element = " + linkedList.getLast());

        System.out.println("Index of Germnay = " + linkedList.indexOf("Germany"));
        //Queue retrieval methods
        System.out.println("Element from element() = " + linkedList.element());
        //Stack retrieval methods
        System.out.println("Element from peek() = " + linkedList.peek());
        System.out.println("Element from peekFirst() = " + linkedList.peekFirst());
        System.out.println("Element from peekLast() = " + linkedList.peekLast());
    }

    public static void printItinery(LinkedList<String> linkedList){
        System.out.println("Trip Starts at  " + linkedList.getFirst());
        for(int i=1 ; i<linkedList.size();i++){
            System.out.println("--> From:  " + linkedList.get(i-1)+ " to " + linkedList.get(i));
        }
        System.out.println("Trip Ends at  " + linkedList.getLast());
    }

    public static void printItinery2(LinkedList<String> linkedList){
        System.out.println("Trip Starts at  " + linkedList.getFirst());
        String previousTown = linkedList.getFirst();
        for(String town : linkedList){
            System.out.println("--> From:  " + previousTown+ " to " + town);
            previousTown = town;
        }
        System.out.println("Trip Ends at  " + linkedList.getLast());
    }

    public static void printItinery3(LinkedList<String> linkedList){
        System.out.println("Trip Starts at  " + linkedList.getFirst());
        String previousTown = linkedList.getFirst();
        ListIterator<String> iterator = linkedList.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From:  " + previousTown+ " to " + town);
            previousTown = town;
        }
        System.out.println("Trip Ends at  " + linkedList.getLast());
    }

    public static void testIterator(LinkedList<String> linkedList){
        var iterator = linkedList.iterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Germany")){
                iterator.remove();
            }
        }
        System.out.println(linkedList);
    }

    public static void testListIterator(LinkedList<String> linkedList){
        var iterator = linkedList.listIterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Germany")){
                iterator.add("Poland");
            }
        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(linkedList);
    }
}