import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Welcome Header
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize HashMap (Bogie Name -> Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // 3. Mapping Bogie Attributes (put() method)
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);

        System.out.println("Bogie capacities mapped.");

        // 4. Iterating through the Map using entrySet()
        System.out.println("\nBogie-Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }
    }
}