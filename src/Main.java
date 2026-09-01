import Model.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("==User==");
        User u1 = new User("qq@gmail.com", "Tom");
        User u2 = new User("qq@gmail.com", "Jerry");
        User u3 = new User("ww@gmail.com", "Billy");
        Set<User> userSet = new HashSet<>();
        userSet.add(u1);
        userSet.add(u2);
        userSet.add(u3);
        System.out.println("User Set size: " + userSet.size());
        for(User user: userSet){
            System.out.println(user);
        }
        System.out.println("==Product==");
        Product p1 = new Product(0L, "Milk", 1.49);
        Product p2 = new Product(1L, "Bread", 0.49);
        Product p3 = new Product(0L, "Water", 0.99);
        Set<Product> productSet = new HashSet<>();
        productSet.add(p1);
        productSet.add(p2);
        productSet.add(p3);
        System.out.println("Product Set size: " + productSet.size());
        for(Product product: productSet){
            System.out.println(product);
        }
        System.out.println("==Task==");
        Task t1 = new Task(0L, "Buy milk");
        Task t2 = new Task(1L, "Do homework");
        Task t3 = new Task(2L, "Read book");
        Task t4 = new Task(1L, "Do homework");
        Set<Task> taskSet = new HashSet<>();
        taskSet.add(t1);
        taskSet.add(t2);
        taskSet.add(t3);
        taskSet.add(t4);
        System.out.println("Task set size: " + taskSet.size());
        for(Task task: taskSet) {
            System.out.println(task);
        }
    }
}