import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        List<String> trainBogies = new ArrayList<>();

        System.out.println("Train initialized successfully....");
        System.out.println("Initial bogie count: " + trainBogies.size());
        System.out.println("Current train consist: " + trainBogies);

        System.out.println("System ready for operations...");
    }
}