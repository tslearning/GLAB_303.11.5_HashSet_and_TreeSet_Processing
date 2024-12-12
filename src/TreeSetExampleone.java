import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleone {
    public static void main(String[] args) {
        TreeSet<Integer> num_TreeSet = new TreeSet<>(); //Instantiating Class TreeSet into Object num_TreeSet
                                                        //remember to import class
        num_TreeSet.add(20);
        num_TreeSet.add(5);
        num_TreeSet.add(15);
        num_TreeSet.add(25);
        num_TreeSet.add(10);

        //Call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iter_set = num_TreeSet.iterator();
        System.out.println("TreeSet Using Iterator: ");
        //Access TreeSet elements using Iterator
        while(iter_set.hasNext()) {//hasNext() - Returns true if there are more elements to iterate over, otherwise false
            System.out.print(iter_set.next());//next()Returns the next element in the collection and moves the iterator forward to the next element.
            System.out.print(", ");
        }

    }
}
