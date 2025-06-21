// Main.java
public class Main {

    static final int MAX_EMPLOYEES = 100;
    static Employee[] employees = new Employee[MAX_EMPLOYEES];
    static int size = 0;

    // Add employee
    public static void addEmployee(Employee emp) {
        if (size < MAX_EMPLOYEES) {
            employees[size++] = emp;
            System.out.println("Employee added: " + emp);
        } else {
            System.out.println("Employee list is full.");
        }
    }

    // Search employee by ID
    public static Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and print all employees
    public static void displayEmployees() {
        if (size == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public static void deleteEmployee(int id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            // Shift left
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--size] = null; // Clear last reference
            System.out.println("Employee with ID " + id + " deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        addEmployee(new Employee(101, "Alice", "Developer", 80000));
        addEmployee(new Employee(102, "Bob", "Manager", 120000));
        addEmployee(new Employee(103, "Charlie", "Analyst", 60000));

        System.out.println("\nAll Employees:");
        displayEmployees();

        System.out.println("\nSearching for employee with ID 102:");
        Employee e = searchEmployee(102);
        System.out.println(e != null ? e : "Not found");

        System.out.println("\nDeleting employee with ID 101:");
        deleteEmployee(101);

        System.out.println("\nUpdated Employee List:");
        displayEmployees();
    }
}
