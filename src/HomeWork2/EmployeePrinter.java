package HomeWork2;

public class EmployeePrinter implements Printer{

    public void print(Employee employee) {
        System.out.println(employee.firstName + ' ' + employee.lastName);
    }
}
