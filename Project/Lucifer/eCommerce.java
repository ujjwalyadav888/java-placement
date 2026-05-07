import java.util.*;

class product{
    int id;
    String productName;
    int price;
   
    product(int id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }
    
     void show() {
        System.out.println(id + " " + productName + " " + price);
    }
}

class cart extends product{

    cart(int id, String productName, int price) {
        super(id, productName, price);   
    }  
    @Override
    void show() {
        System.out.println("Product in Cart:");
        System.out.println(id + " " + productName + " " + price);
    }
    
}

public class eCommerce {
    public static void main(String [] args){
        product p1= new product(1,"leptop",55000);
        p1.show();
       
    }
}
