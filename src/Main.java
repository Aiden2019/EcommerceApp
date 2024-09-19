import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(102, "Headphones", 49.99);
        Product product3 = new Product(103, "Mouse", 991.99);
        Product product4 = new Product(104, "Earphone", 59.99);
        Product product5 = new Product(105, "Palmtop", 999.99);
        Product product6 = new Product(106, "Tablet", 89.99);
        Product product7 = new Product(107, "Laptop", 909.99);
        Product product8 = new Product(108, "Headphones", 49.99);




        // Create a customer
        Customer customer = new Customer(1, "Susan Nduta");

        // Add products to the shopping cart
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);
        customer.addToCart(product4);
        customer.addToCart(product5);
        customer.addToCart(product6);
        customer.addToCart(product7);

        // Display the cart
        customer.displayCart();

        // Create an order
        Order order = new Order(1001);
        customer.placeOrder(order);

        // Display order summary
        System.out.println(order.generateSummary());
    }
}
