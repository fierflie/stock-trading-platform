// DataProcessor.java
// Handles data processing logic for the project.

import java.util.List;
import java.util.stream.Collectors;

public class DataProcessor {
    public static List<Integer> processData(List<Integer> data) {
        // Example: Double each value in the list
        return data.stream().map(x -> x * 2).collect(Collectors.toList());
    }
}
