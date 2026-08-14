package Practice.CE2;
import java.util.*;

class Product{
    int productId;
    String productName;
    int price; 
    int quantity;

    Product(int productId, String productName, int price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        
    }
    int calculateTotal(){
        return price*quantity;
    }

    void displayDetails(){
    System.out.println("Product ID : " + productId);
    System.out.println("Product Name : " + productName);
    System.out.println("Price : ₹" + price);
    System.out.println("Quantity : " + quantity);
    System.out.println("Total : ₹" + calculateTotal());

    }
}

public class shoppingcart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        Product[] products = new Product[n];

        for(int i = 0; i<n;i++){
            
        }
    }
    
}
