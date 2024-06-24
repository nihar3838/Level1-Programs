public class Student1 {
    int id;
    String name;
    int age;

    Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "id =" + id + ", name=" + name + ", age =" + age ;
    }

    public static void main(String[] args) {
        Student1 obj = new Student1(4, "Nihar", 22);
        System.out.println("The details of students are: " + obj.toString());
    }
}


