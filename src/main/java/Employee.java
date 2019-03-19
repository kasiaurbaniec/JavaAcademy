import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;
    private static int nextId = 1;

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setId() {
        id=nextId;
        nextId++;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);

    }

    public void raiseSalary(double byPersent) {
        double raise = salary * byPersent / 100;
        salary += raise;
    }
public static void trippleSalary(Employee x){
        x.raiseSalary(200);
}
    public static void main(String[] args) {

Employee[]staff=new Employee[3];
staff[0]=new Employee("Janek Jakiś",700,2017,4,30);
staff[1]=new Employee("Asia Inna",300,2010,3,17);
staff[2]=new Employee("Ela Mamuśka",10000,2018,1,1);

        for (Employee empl:staff
             ) {
            System.out.println(empl.getName() + " salary: "+empl.getSalary()+" hired: "+empl.getHireDay());

        }

    }
}
