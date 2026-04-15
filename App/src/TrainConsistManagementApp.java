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
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Performance Benchmarking ===");
        // 1. Prepare a larger dataset for more accurate measurement
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
        }

        // 2. Benchmarking Loop-Based Filtering
        long startTimeLoop = System.nanoTime();
        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                filteredLoop.add(b);
            }
        }
        long endTimeLoop = System.nanoTime();
        long durationLoop = endTimeLoop - startTimeLoop;

        // 3. Benchmarking Stream-Based Filtering
        long startTimeStream = System.nanoTime();
        List<Bogie> filteredStream = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endTimeStream = System.nanoTime();
        long durationStream = endTimeStream - startTimeStream;

        // 4. Display Results
        System.out.println("Loop-Based Time: " + durationLoop + " ns");
        System.out.println("Stream-Based Time: " + durationStream + " ns");

        // 5. Verification
        System.out.println("\nVerification:");
        System.out.println("Results Match: " + (filteredLoop.size() == filteredStream.size()));
        System.out.println("Bogie count filtered: " + filteredLoop.size());
    }
}
