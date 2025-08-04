/**
 * Author: Sireesha Munnamgi
 * Purpose: Custom Logger using Singleton Design Pattern
 * Date: June 20, 2025
 * Big O is a way to measure how fast or slow  code runs as the input gets bigger.
 *  If we check every name one by one, it will take longer as the notebook gets bigger.
 * that is called O(n) — “linear time” (more pages = more time)
 * It helps us:
Understand how the algorithm scales
Predict performance before running code
Compare different algorithms objectively
cases 	Linear Search	Binary Search
Best Case	O(1) (first element)	O(1) (middle element)
Average	O(n/2) → O(n)	O(log n)
Worst Case	O(n) (last element or not found)	O(log n)
*/

/** Time Complexity | Sorted Input Required | Speed                        |
| **Linear**    | `O(n)`          | No                   | Slower on large datasets     |
| **Binary**    | `O(log n)`      |  Yes (must be sorted) | Much faster for large arrays |

Best Choice for E-commerce:
Use Binary Search on sorted arrays for product names or categories.

Combine with HashMaps or Tries for category or ID-based lookups for large-scale systems.

Best Choice for E-commerce:
Use Binary Search on sorted arrays for product names or categories.

Combine with HashMaps or Tries for category or ID-based lookups for large-scale systems.

Best Choice for E-commerce:
Use Binary Search on sorted arrays for product names or categories.
*/


 * public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Mobile", "Electronics"),
            new Product(4, "Book", "Stationery")
        };

        // Linear Search
        Product result1 = LinearSearch.linearSearch(products, "Mobile");
        System.out.println("Linear Search Result: " + result1);

        // Binary Search
        Product result2 = BinarySearch.binarySearch(products, "Mobile");
        System.out.println("Binary Search Result: " + result2);
    }
}
