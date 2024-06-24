public class Tv {
    private String brand;
    private int size;
    private double price;

    public Tv(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;
        if (size >= 50) {
            discount = 0.15;
        } else if (size >= 30) {
            discount = 0.10;
        }
        return price * discount;
    }

    public void printDetails() {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Discounted Price:$ " +discountedPrice);
    }

    public static void main(String[] args) {
        Tv tv1 = new Tv("Samsung", 55, 1000.0);
        tv1.printDetails();

        Tv tv2 = new Tv("LG", 25, 800.0);
        tv2.printDetails();
    }
}

