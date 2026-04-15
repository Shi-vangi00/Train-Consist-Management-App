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

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    /**
     * Assigns cargo with safety validation.
     */
    public void assignCargo(String cargoType) {
        System.out.println("Validating assignment: " + cargoType + " to " + shape + " bogie...");

        try {
            // Safety Rule: Petroleum must not be in a Rectangular bogie
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("SAFETY ALERT: Petroleum cannot be assigned to a Rectangular bogie!");
            }

            this.cargo = cargoType;
            System.out.println("Success: Cargo '" + cargoType + "' assigned safely.");

        } catch (CargoSafetyException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("[System Log]: Cargo validation process completed.");
        }
    }

    @Override
    public String toString() {
        return "Bogie [Shape=" + shape + ", Cargo=" + (cargo != null ? cargo : "None") + "]";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println(" UC15: Safe Cargo Assignment Using try-catch-finally ");

        // 1. Valid Assignment
        System.out.println("\n--- Test Case 1: Safe Assignment ---");
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");

        // 2. Unsafe Assignment
        System.out.println("\n--- Test Case 2: Unsafe Assignment ---");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum");

        // 3. Verification of system stability
        System.out.println("\n--- Test Case 3: Post-Exception Continuity ---");
        rectangular.assignCargo("Grain");

        System.out.println("\nFinal State: " + rectangular);
        System.out.println("App status: Running safely.");
    }
}
