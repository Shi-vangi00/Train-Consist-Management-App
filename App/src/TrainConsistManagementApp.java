import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Cap: " + capacity + ")";
    }

    // Getter needed for grouping classification
    public String getName() {
        return name;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the list with multiple bogies of the same type
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("Original List: " + bogies);

        // 2. Stream API Grouping
        // Uses Collectors.groupingBy to classify bogies by their name
        System.out.println("\nGrouping bogies by type...");

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // 3. Display Result (Restructured Map)
        System.out.println("Grouped Bogie Structure:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });

        // 4. Verification for Test Cases
        System.out.println("\nVerification:");
        System.out.println("Total Categories: " + groupedBogies.size());
        System.out.println("Original list integrity maintained: " + (bogies.size() == 5));
    }
}
