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

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " [" + cargo + "]";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==========================================\n");

        // 1. Prepare list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        System.out.println("Goods Bogies: " + goodsBogies);

        // 2. Stream Safety Validation
        // Rule: If type is "Cylindrical", cargo must be "Petroleum"
        System.out.println("\nVerifying safety compliance...");

        boolean isSafe = goodsBogies.stream().allMatch(b -> {
            if (b.type.equals("Cylindrical")) {
                return b.cargo.equals("Petroleum");
            }
            return true; // Non-cylindrical bogies are always safe for now
        });

        // 3. Display Result
        System.out.println("Train Safety Compliant: " + isSafe);

        // 4. Testing a violation
        System.out.println("\nScenario: Adding unsafe bogie (Cylindrical carrying Coal)...");
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        boolean isStillSafe = goodsBogies.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
        );

        System.out.println("Updated Train Safety Compliant: " + isStillSafe);
    }

}
