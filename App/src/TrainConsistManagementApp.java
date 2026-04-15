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
        System.out.println(" UC16: Sort Passenger Bogies by Capacity ");

        // 1. Initial array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting: " + Arrays.toString(capacities));

        // 2. Bubble Sort Algorithm
        // The outer loop tracks the number of passes
        for (int i = 0; i < capacities.length - 1; i++) {
            // The inner loop compares adjacent elements
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                // If the left element is greater than the right, swap them
                if (capacities[j] > capacities[j + 1]) {
                    // Swapping Logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // 3. Display the sorted result
        System.out.println("After Sorting (Bubble Sort): " + Arrays.toString(capacities));

        System.out.println("\nUC16 manual sorting completed...");
    }
}
