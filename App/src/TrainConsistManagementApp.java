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
        System.out.println(" UC19: Binary Search for Bogie ID  ");

        // 1. Array of Bogie IDs (Pre-sorted for Binary Search)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        // 2. Display Available Bogies
        System.out.print("Available Bogies IDs: ");
        for (int i = 0; i < bogieIds.length; i++) {
            System.out.print(bogieIds[i] + (i < bogieIds.length - 1 ? ", " : ""));
        }
        System.out.println("\n");

        // 3. Binary Search Logic
        int low = 0;
        int high = bogieIds.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Lexicographical comparison using compareTo()
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                foundIndex = mid;
                break; // Match found
            } else if (comparison > 0) {
                low = mid + 1; // Key is in the right half
            } else {
                high = mid - 1; // Key is in the left half
            }
        }

        // 4. Display Search Result
        if (foundIndex != -1) {
            System.out.println("Bogie " + searchKey + " found in train consist using binary search at position " + (foundIndex + 1));
        } else {
            System.out.println("Bogie " + searchKey + " not found in train consist.");
        }

        System.out.println("\nUC19 search completed...");
    }
}
