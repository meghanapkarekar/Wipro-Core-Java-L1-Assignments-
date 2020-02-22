import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class EmployeeDB {
    List<Employee> employeeDb = new ArrayList<Employee>();


    public boolean addEmployee(Employee e) {
        return employeeDb.add(e);
    }

    public boolean deleteEmployee(int empId) {
        boolean isRemoved = false;

        Iterator<Employee> it = employeeDb.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getEmpId() == empId) {
                isRemoved = true;
                it.remove();
            }
        }

        return isRemoved;
    }

    public String showPaySlip(int empId) {
        String paySlip = "Invalid employee id";

        for (Employee e : employeeDb) {
            if (e.getEmpId() == empId) {
                paySlip = "Pay slip for employee id " + empId + " is " +
                        e.getEmpSalary();
            }
        }

        return paySlip;
    }

    public Employee[] listAll() {
        Employee[] empArray = new Employee[employeeDb.size()];
        for (int i = 0; i < employeeDb.size(); i++)
            empArray[i] = employeeDb.get(i);
        return empArray;
    }

}