import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize ArrayList for passenger bogies
        List<String> trainBogies = new ArrayList<>();

        // 2. Add Bogies (Create/Insert)
        trainBogies.add("Sleeper");
        trainBogies.add("AC Chair");
        trainBogies.add("First Class");

        System.out.println("Passenger bogies added.");

        // 3. Display list after insertion (Read)
        System.out.println("Current train consist: " + trainBogies);
        System.out.println("Current bogie count: " + trainBogies.size());

        // 4. Remove one bogie (Delete)
        System.out.println("\nRemoving AC Chair...");
        trainBogies.remove("AC Chair");

        // 5. Check existence (Search)
        System.out.println("Does Sleeper exist in consist? " + trainBogies.contains("Sleeper"));

        // 6. Display final state
        System.out.println("Updated train consist: " + trainBogies);
        System.out.println("Final bogie count: " + trainBogies.size());
    }
}