public class Employee {
    int id;
    String name;
    double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public String CalcSal(double sal) {
        return "Annual salary of Employee is " + sal * 12;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + ", sal = " + sal;
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(1, "Nihar", 35000);
        System.out.println(obj1.CalcSal(35000));
        System.out.println("Employee Details are " + obj1.toString());
    }
}
