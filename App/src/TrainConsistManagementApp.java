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
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the list of bogies (Reuse from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All bogies: " + bogies);

        // 2. Stream API Filtering
        // Goal: Identify high-capacity bogies (Capacity > 60)
        System.out.println("\nFiltering bogies with capacity > 60...");

        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60) // Condition logic
                .collect(Collectors.toList()); // Terminal operation

        // 3. Display Result
        System.out.println("High-Capacity Bogies: " + highCapacityBogies);

        // Verify original list integrity
        System.out.println("Original list remains unchanged: " + bogies.size() + " items.");
    }
}
