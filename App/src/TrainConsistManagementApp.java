import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.LinkedList;


public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Welcome Header
        System.out.println("=== Train Consist Management App ===");

        // 2. Initial Setup
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display Initial State
        System.out.println("Initial Train Formation: " + trainConsist);

        // 3. Middle Insertion
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        // 4. Head and Tail Removal
        System.out.println("Detaching first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. Final State Report (Matches the SS spacing)
        System.out.println("\nFinal Ordered Train Consist: " + trainConsist);
        System.out.println("Total bogies remaining: " + trainConsist.size());
    }
}