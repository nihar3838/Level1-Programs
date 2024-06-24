public class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 500;
        double processorPrice = 0;
        double ramPrice = ram * 10;
        double storagePrice = storage * 0.5;

        if (processor.equalsIgnoreCase("Intel i9")) {
            processorPrice = 300;
        } else if (processor.equalsIgnoreCase("Amd Ryzen 7")) {
            processorPrice = 250;
        } else {
            processorPrice = 100;
        }
        return basePrice + processorPrice + ramPrice + storagePrice;
    }

    public void printDetails() {
        System.out.println("Computere Processor :" + processor);
        System.out.println("Computer Ram :" + ram);
        System.out.println("Computer Storage :" + storage);
        System.out.println("Price of Computer:$" + calculatePrice());
    }

    public static void main(String[] args) {
        Computer com1 = new Computer("Intel i9", 16, 500);
        com1.printDetails();

        Computer com2 = new Computer("Amd Ryzen 7", 8, 1000);
        com2.printDetails();
    }
}




