public class Shirt {
    private String size;
    private String colour;
    private int price;

    public Shirt(String size, String colour, int price) {
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;
        if (size.equalsIgnoreCase("L") || size.equalsIgnoreCase("XL")) {
            discount = 0.15;
        } else if (size.equalsIgnoreCase("M")) {
            discount = 0.10;
        } else if (size.equalsIgnoreCase("S")) {
            discount = 0.5;
        }
        return price * discount;
    }

    public void printDetails() {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;
        System.out.println("Shirt size: " + size);
        System.out.println("Shirt colour: " + colour);
        System.out.println("Shirt original price: " + price);
        System.out.println("Shirt's Discounted price: " + discountedPrice);
    }

    public static void main(String[] args) {
        Shirt s1 = new Shirt("L", "White", 200);
        s1.printDetails();

        Shirt s2 = new Shirt("M", "Black", 150);
        s2.printDetails();
    }
}




