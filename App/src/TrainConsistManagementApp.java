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
        System.out.println(" UC18: Linear Search for Bogie ID ");

        // 1. Array of Bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        // 2. Display Available Bogies (As requested)
        System.out.print("Available Bogies IDs: ");
        for (int i = 0; i < bogieIds.length; i++) {
            System.out.print(bogieIds[i] + (i < bogieIds.length - 1 ? ", " : ""));
        }
        System.out.println("\n");

        // 3. Linear Search Logic
        boolean found = false;
        int position = -1;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                position = i + 1; // Human-readable position (1-based)
                break;
            }
        }

        // 4. Display Search Result
        if (found) {
            System.out.println("Bogie " + searchKey + " found in train consist at position " + position);
        } else {
            System.out.println("Bogie " + searchKey + " not found in train consist.");
        }

        System.out.println("\nUC18 search completed...");
    }
}
