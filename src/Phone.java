//
public class Phone {
     private String make;
     private String model;
     private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 300;
        double pricePerGB = 2;
        if (make.equalsIgnoreCase("Apple")) {
            basePrice = basePrice + 200;
        } else if (make.equalsIgnoreCase("Samsung")) {
            basePrice = basePrice + 150;
        }
        if (model.equalsIgnoreCase("Pro")) {
            basePrice = basePrice + 100;
        }
        return basePrice + (storage * pricePerGB);
    }

    public void printDetails() {
        System.out.println("Phone make: " + make);
        System.out.println("Phone model: " + model);
        System.out.println("Phone storage: " + storage);
        System.out.println("Phone price: $" + calculatePrice());
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "Pro", 256);
        phone1.printDetails();

        Phone phone2 = new Phone("Samsung", "Standard", 128);
        phone2.printDetails();
    }
}





