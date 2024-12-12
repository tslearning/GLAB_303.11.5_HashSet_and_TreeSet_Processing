import java.util.HashSet;

public class exampletwo {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(6);
        System.out.println("Hashset1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("Hashset2: " + numbers);

        //Union of two set (Combining two different sets of HashSet)
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);

        evenNumbers.addAll(numbers);
        System.out.println("Union is: " + evenNumbers);
    }
}
