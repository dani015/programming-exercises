import java.util.*;

public class productShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        Map<String, List<String>> shop = new TreeMap<>();

        while (!"Revision".equals(input = scanner.nextLine())){
            String[] tokens = input.split(",\\s+");
            String shopName = tokens[0];
            String productName = tokens[1];
            Double productPrice = Double.parseDouble(tokens[2]);
            shop.putIfAbsent(shopName, new LinkedList<>());
            shop.get(shopName).add(String.format(
                    "Product: %s, Price: %.1f",
                    productName,
                    productPrice
            ));
        }

        shop.forEach((shopName,products) -> {
            System.out.println(shopName + "->" +
                    System.lineSeparator() +
                    String.join(System.lineSeparator(),products)

            );
        });

    }


}
