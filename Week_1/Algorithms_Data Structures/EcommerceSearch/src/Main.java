
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Iphone", "Electronics"),
            new Product(205, "Shirt", "Clothing"),
            new Product(150, "Dictionary", "Stationery"),
            new Product(123, "Headphone", "Electronics"),
            new Product(170, "Shoes", "Footwear")
        };

        // Linear Search
        Product result1 = LinearSearch.searchById(products, 150);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product Not Found"));

        // Binary Search
        Product result2 = BinarySearch.searchById(products, 150);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product Not Found"));
    }
}
