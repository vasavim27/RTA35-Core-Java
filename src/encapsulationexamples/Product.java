package encapsulationexamples;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name,double price,int stockQuantity){
        this.name=name;
        this.price=price;
        this.stockQuantity=stockQuantity;

    }
    public String getName() {

        return name;

    }
    public double getPrice(){
        return price;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
    public void updatePrice(double price){
        if (price>0){
            this.price=price;
        }
        else {
            System.out.println("Please enter a valid price for product "+name);
        }
    }
    public void checkStock(int quantity) {
        if (quantity > 0 && quantity < stockQuantity) {
            stockQuantity -= quantity;
            System.out.println("The remaining stock of Product "+name+" is "+stockQuantity);
        } else {
            System.out.println("Insufficient "+name+" Stock!! Please Enter  valid quantity details");
        }
    }
    public static void main(String[] args)
    {
        Product product=new Product("Printer",200.00,12);
        System.out.println("The name of the product purchased is "+product.getName());
        System.out.println("The stock available for the product "+product.getName()+" is "+product.getStockQuantity());
        product.updatePrice(210.00);
        System.out.println("The updated price of the product is "+product.getPrice());
        product.checkStock(5);
        product.checkStock(13);
    }

    }
