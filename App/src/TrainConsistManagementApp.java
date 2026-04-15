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

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("==========================================\n");

        // 1. Define Regex Patterns
        // Train ID: TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // Cargo Code: PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile Patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // 3. User Input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainInput = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoInput = scanner.nextLine();

        // 4. Matcher and Validation
        Matcher trainMatcher = trainPattern.matcher(trainInput);
        Matcher cargoMatcher = cargoPattern.matcher(cargoInput);

        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // 5. Display Validation Results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
        scanner.close();
    }

}
