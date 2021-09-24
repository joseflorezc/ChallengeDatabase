package helper;

import database.EmployeeQuery;
import entities.Company;
import entities.Employee;

import java.util.Date;
import java.util.List;

public class CrudEmployee {

    protected Employee employee = new Employee();
    protected EmployeeQuery employeeQuery = new EmployeeQuery();
    protected List<Employee> resultsEmployee;

    // no-argument constructor
    public CrudEmployee() { }

    public Boolean insertEmployee(int idEmpl, int idComp, String firstName, String lastName, String email, String address, String phoneNumb, Double Salary, Date birthDa) {
        Boolean result = employeeQuery.addEmployee(idEmpl, idComp, firstName, lastName, email, address, phoneNumb, Salary, birthDa);

        if ( result == true )
            System.out.println(" Employee Added ");
        else
            System.out.println(" Employee NOT Added ");

        return result;
    }

    public int getAllEmployees() {
        resultsEmployee = employeeQuery.getAllEmployees();
        int numberOfEmployees = 0;
        for (Employee emplo : resultsEmployee) {
            numberOfEmployees+=1;
            System.out.print(emplo.getIdEmployee()+"  -  ");
            System.out.print(emplo.getIdCompany()+"  -  ");
            System.out.print(emplo.getFirstName()+"  -  ");
            System.out.print(emplo.getLastName()+"  -  ");
            System.out.print(emplo.getEmail()+"  -  ");
            System.out.print(emplo.getAddress()+"  -  ");
            System.out.print(emplo.getPhoneNumber()+"  -  ");
            System.out.print(emplo.getSalary()+"  -  ");
            System.out.println(emplo.getBirthDate());
        }
        return numberOfEmployees;
    }

    public void findEmployeeById(int idEmplo) {
        employee = employeeQuery.getEmployeeById(idEmplo);
            System.out.print(employee.getIdEmployee()+"  -  ");
            System.out.print(employee.getIdCompany()+"  -  ");
            System.out.print(employee.getFirstName()+"  -  ");
            System.out.print(employee.getLastName()+"  -  ");
            System.out.print(employee.getEmail()+"  -  ");
            System.out.print(employee.getAddress()+"  -  ");
            System.out.print(employee.getPhoneNumber()+"  -  ");
            System.out.print(employee.getSalary()+"  -  ");
            System.out.println(employee.getBirthDate());
    }

    public int findEmployeeByName(String emploName) {
        resultsEmployee = employeeQuery.getEmployeeByName(emploName);
        int resultNumberOfEmployees = 0;
        for (Employee emplo : resultsEmployee) {
            resultNumberOfEmployees+=1;

            System.out.print(emplo.getIdEmployee()+"  -  ");
            System.out.print(emplo.getIdCompany()+"  -  ");
            System.out.print(emplo.getFirstName()+"  -  ");
            System.out.print(emplo.getLastName()+"  -  ");
            System.out.print(emplo.getEmail()+"  -  ");
            System.out.print(emplo.getAddress()+"  -  ");
            System.out.print(emplo.getPhoneNumber()+"  -  ");
            System.out.print(emplo.getSalary()+"  -  ");
            System.out.println(emplo.getBirthDate());
        }
        return resultNumberOfEmployees;
    }

    public Boolean updateEmployee(int idEmpl, int idComp, String firstName, String lastName, String email, String address, String phoneNumb, Double Salary, Date birthDa) {
        Boolean result = employeeQuery.updateEmployee(idEmpl, idComp, firstName, lastName, email, address, phoneNumb, Salary, birthDa);
        if ( result == true )
            System.out.println(" Employee Updated ");
        else
            System.out.println(" Employee NOT Updated ");
        return result;
    }

    public int deleteEmployee(int idEmplo) {
        int result = employeeQuery.deleteEmployee(idEmplo);

        if ( result == 1 )
            System.out.println(" Employee Deleted ");
        else
            System.out.println(" Employee NOT Deleted ");
        return result;
    }
}
