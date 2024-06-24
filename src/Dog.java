public class Dog {
    int age, weight;
    String breed;

    Dog(int age, int weight, String breed) {
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public int CalculateAgeHumanYears() {
        int humanYears;
        if (age <= 2) {
            humanYears = age * 11;
        } else {
            humanYears = 22 + ((age - 2) * 5);
        }
        return humanYears;
    }

    public void printDogDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age:" + age + "years in dog years," + CalculateAgeHumanYears() + "years in human years");
    }

    public static void main(String[] args) {
        Dog obj1 = new Dog(5, 40, "Husky");
        obj1.CalculateAgeHumanYears();
        obj1.printDogDetails();

    }
}
