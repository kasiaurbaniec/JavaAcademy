import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

class EmployeeTest {
    private static Employee[] staff;

    @BeforeAll
    public static void setUp() {
        staff=new Employee[3];
        staff[0] = new Employee("Rysiek Bober", 2300, 2010, 4, 7);
        staff[1] = new Employee("Ania Bober", 4300, 2016, 3, 16);
        staff[2] = new Employee("Stachu Fojkis", 5600, 2009, 12, 31);
    }

    @Test
    public void shouldcheckIfObjectWereMade() {
        // When
        for (Employee empoy : staff) {
            empoy.raiseSalary(8);
        }
        // Then
        for (Employee employee : staff) {
            System.out.println(employee.getName() + " salary - " + employee.getSalary() + " hired : " + employee.getHireDay());
        }
        assertThat(staff[2].getName()).isEqualTo("Stachu Fojkis");
    }

    @Test
    public void shouldCheckSetId() {
        // When
        for (Employee e : staff) {
            e.setId();
            System.out.println(e.getName() + " id: " + e.getId());
        }
        int result = Employee.getNextId();
        // Then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void shouldCheckTripple() {
        // When
        Employee.trippleSalary(staff[1]);
        double result = staff[1].getSalary();
        // Then
        assertThat(result).isEqualTo(12900);
    }
}



