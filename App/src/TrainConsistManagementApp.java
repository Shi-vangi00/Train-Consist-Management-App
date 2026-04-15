import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize a HashSet to store unique Bogie IDs
        // HashSet uses hashing to ensure that no two identical strings can exist
        Set<String> bogieIds = new HashSet<>();

        // 2. Adding Bogie IDs (including intentional duplicates)
        System.out.println("Registering bogie IDs...");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Intentional duplicate entry
        System.out.println("Attempting to add duplicate ID: BG101");
        bogieIds.add("BG101");

        // 3. Display the final set
        // Notice that the duplicate "BG101" is automatically ignored
        System.out.println("Unique Bogie IDs registered: " + bogieIds);
        System.out.println("Total unique bogies: " + bogieIds.size());
    }
}