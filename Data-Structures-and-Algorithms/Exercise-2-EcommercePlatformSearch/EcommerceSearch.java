import java.util.Arrays;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) {
                return mid;
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Product[] products = new Product[]{
            new Product(101, "Laptop",     "Electronics"),
            new Product(205, "Shoes",      "Footwear"),
            new Product(312, "Watch",      "Accessories"),
            new Product(418, "Book",       "Education"),
            new Product(523, "Headphones", "Electronics"),
            new Product(634, "Bag",        "Accessories"),
            new Product(745, "Phone",      "Electronics"),
            new Product(856, "Keyboard",   "Electronics")
        };

        Arrays.sort(products, (a, b) -> a.productId - b.productId);

        int searchId = 523;

        int linearResult = linearSearch(products, searchId);
        System.out.println("=== Linear Search ===");
        System.out.println(linearResult != -1
            ? "Found: " + products[linearResult].productName + " at index " + linearResult
            : "Product not found");

        int binaryResult = binarySearch(products, searchId);
        System.out.println("\n=== Binary Search ===");
        System.out.println(binaryResult != -1
            ? "Found: " + products[binaryResult].productName + " at index " + binaryResult
            : "Product not found");

        System.out.println("\n=== Time Complexity Analysis ===");
        System.out.println("Linear Search  -> Best: O(1) | Avg: O(n) | Worst: O(n)");
        System.out.println("Binary Search  -> Best: O(1) | Avg: O(log n) | Worst: O(log n)");
        System.out.println("\nConclusion: Binary search is better for large sorted product catalogs.");
    }
}