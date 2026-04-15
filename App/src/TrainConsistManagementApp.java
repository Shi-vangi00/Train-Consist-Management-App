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

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

/**
 * Bogie class with Fail-Fast constructor validation.
 */
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) throws InvalidCapacityException {
        // Enforce business rule: Capacity must be > 0
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=UC14: Handle Invalid Bogie Capacity =");

        // Scenario 1: Creating a Valid Bogie
        try {
            System.out.println("\nAttempting to create a valid bogie...");
            Bogie validBogie = new Bogie("Sleeper", 72);
            System.out.println("Success: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Scenario 2: Creating an Invalid Bogie (Zero Capacity)
        try {
            System.out.println("\nAttempting to create an invalid bogie (Capacity: 0)...");
            Bogie invalidBogie = new Bogie("AC Chair", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        // Scenario 3: Creating an Invalid Bogie (Negative Capacity)
        try {
            System.out.println("\nAttempting to create an invalid bogie (Capacity: -10)...");
            Bogie negativeBogie = new Bogie("First Class", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        System.out.println("\nUC14 validation completed...");
    }
}
