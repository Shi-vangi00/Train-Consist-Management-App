import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.LinkedList;


public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Welcome Header
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize LinkedHashSet (Enforces Uniqueness + Maintains Order)
        Set<String> trainFormation = new LinkedHashSet<>();

        // 3. Attach bogies in sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 4. Attempt to add a duplicate bogie intentionally
        System.out.println("Attempting to attach duplicate bogie: Sleeper");
        trainFormation.add("Sleeper");

        // 5. Display the final formation (Matches the SS spacing and format)
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);
    }
}