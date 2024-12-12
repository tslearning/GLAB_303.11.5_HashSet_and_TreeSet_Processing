import java.util.HashSet;
// Example Four: Enhanced for() Loop
public class examplefour {
    public static void main(String[] args) {
        //HashSet declaration
        HashSet<String> hset = new HashSet<String>();

        //Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");

        //Addition of null values
        hset.add(null);
        hset.add(null);

        // Using advanced for loop

        for(String str : hset){ // create String variable called str and assign it ArrayList hset
            System.out.println("------>" + str);
            System.out.println("------>" + str); //running for fun

        }

    }
}
