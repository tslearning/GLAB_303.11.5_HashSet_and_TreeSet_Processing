import java.util.TreeSet;

public class TreesetExamplethree {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        //Using the first() method
        int first = numbers.first();//Calling method for list first element
        System.out.println("First: " + first);//Output 2

        // Using the last() method
        int last = numbers.last();//Calling method for list last element
        System.out.println("Last Number: " + last);//Output 6

    }
}
