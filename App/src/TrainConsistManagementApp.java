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
import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void performSearch(List<String> bogieIds, String searchKey) {
        System.out.println("Initiating search for Bogie: " + searchKey);
        System.out.println("=== UC20: Exception Handling During Search Operations\n ===");

        // 1. State Validation (Fail-Fast)
        if (bogieIds == null || bogieIds.isEmpty()) {
            throw new IllegalStateException("Search Failed: No bogies available in the train consist.");
        }

        // 2. Search Logic (Only executes if state is valid)
        boolean found = bogieIds.contains(searchKey);

        if (found) {
            System.out.println("Success: Bogie " + searchKey + " located in consist.");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Scenario 1: Searching an empty list
        List<String> emptyConsist = new ArrayList<>();
        try {
            System.out.println("\n--- Testing Search on Empty Consist ---");
            performSearch(emptyConsist, "BG101");
        } catch (IllegalStateException e) {
            System.err.println("Caught Expected Exception: " + e.getMessage());
        }

        // Scenario 2: Searching a populated list
        List<String> activeConsist = new ArrayList<>();
        activeConsist.add("BG101");
        activeConsist.add("BG205");
        activeConsist.add("BG309");

        try {
            System.out.println("\n--- Testing Search on Populated Consist ---");
            System.out.println("Available Bogies: " + activeConsist);
            performSearch(activeConsist, "BG205");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 state validation completed...");
    }
}
