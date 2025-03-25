import java.util.*;
import java.util.stream.Collectors;
public class StreamProgram6 {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("laptop", "desktop", "mouse", "keyboard", "monitor", "printer", "headset", "webcam");     
        // Group products by category
        Map<String, List<String>> groupedProducts = products.stream()
                .collect(Collectors.groupingBy(product -> {
                    if (Arrays.asList("laptop", "desktop").contains(product)) return "Computer";
                    else if (Arrays.asList("mouse", "keyboard", "monitor").contains(product)) return "Peripheral";
                    else return "Accessory";
                }));
        // Print grouped products
        groupedProducts.forEach((category, items) -> System.out.println(category + " : " + items));
    }
}