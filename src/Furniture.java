public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;
        if (material.equalsIgnoreCase("Wood")) {
            discount = 0.20;
        } else if (material.equalsIgnoreCase("Plastic")) {
            discount = 0.10;
        } else if (material.equalsIgnoreCase("Metal")) {
            discount = 0.15;
        }
        return price * discount;
    }

    public void printDetails() {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;
        System.out.println("Furniture type: "  +type);
        System.out.println("Furniture material "  +material);
        System.out.println("Original Price is: "  +price);
        System.out.println("Discounted Price of Furniture is: " + discountedPrice);
    }

    public static void main(String[] args) {
        Furniture f1 = new Furniture("Chair", "Wood", 400);
        f1.printDetails();

        Furniture f2 = new Furniture("Table", "Plastic", 800);
        f2.printDetails();
    }
}







