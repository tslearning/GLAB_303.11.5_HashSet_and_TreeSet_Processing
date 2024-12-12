import java.util.HashSet;

public class exampleOne {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<Integer>();
        //Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        // Using addAll() method
        numbers.addAll(evenNumber); //this argument is the evenNumber created above
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
    }
}
