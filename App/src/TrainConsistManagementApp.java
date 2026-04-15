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

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Current Bogies: " + bogies);

        // 2. Stream API Aggregation
        // map() transforms Bogie objects into Integers
        // reduce() sums them up starting from 0 (identity)
        System.out.println("\nCalculating total seating capacity...");

        int totalCapacity = bogies.stream()
                .map(Bogie::getCapacity)        // Transformation
                .reduce(0, Integer::sum);      // Aggregation

        // 3. Display the result
        System.out.println("Total Seating Capacity: " + totalCapacity + " seats");

        // 4. Verification for Test Cases
        System.out.println("\nVerification:");
        System.out.println("Original list integrity maintained: " + (bogies.size() == 4));
    }
}
