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
    public static void main(String[] args) {
        System.out.println(" UC17: Sort Bogie Names Using Arrays.sort()\n ");

        // 1. Initial array of unsorted bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // 2. Built-in Sorting (Optimized Library Method)
        // Uses Natural Ordering (Alphabetical for Strings)
        Arrays.sort(bogieNames);

        // 3. Display the sorted result using Arrays.toString()
        System.out.println("After Sorting (Arrays.sort): " + Arrays.toString(bogieNames));

        System.out.println("\nUC17 library sorting completed...");
    }
}
