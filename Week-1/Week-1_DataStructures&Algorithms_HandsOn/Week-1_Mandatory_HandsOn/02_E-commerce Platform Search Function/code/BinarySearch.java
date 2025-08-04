import java.util.Arrays;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String name) {
        Arrays.sort(products); // sorts using compareTo in Product class

        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = name.compareToIgnoreCase(products[mid].productName);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null; // not found
    }
}
