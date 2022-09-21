package HomeWork2;

public class Main{

    public static void main(String[] args) {  //воид говорит что ничего не возвращает
        Employee employee = new Employee();
        employee.firstName = "Alex";
        employee.lastName = "Klein";

        EmployeePrinter employeePrinter = new EmployeePrinter();
        employeePrinter.print(employee);

    }
}

