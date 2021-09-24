package database;

import entities.Company;
import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeQuery {

    EntityManager entityManager;  // Variable para obtener la conexion.
    Employee employee;
    List<Employee> listEmployee = null;

    // constructor
    public EmployeeQuery() {
        entityManager = JPAUtil.getEntityManagerFactory().createEntityManager(); // abre la conexion con la BD.
        listEmployee = new ArrayList<Employee>();
    }

    public Boolean addEmployee(int idEmpl, int idComp, String firstName, String lastName, String email, String address, String phoneNumb, Double Salary, Date birthDa)
    {
        employee = new Employee(idEmpl, idComp, firstName, lastName, email, address, phoneNumb, Salary, birthDa);

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        return entityManager.contains(employee);
    }

    public List<Employee> getAllEmployees()
    {
        Query query=entityManager.createQuery("From Employee");
        listEmployee = (List<Employee>) query.getResultList();
        return listEmployee;
    }

    public Employee getEmployeeById(int idEmpl)
    {
        employee = entityManager.find(Employee.class, idEmpl);
        return employee;
    }

    public List<Employee> getEmployeeByName(String lastName)
    {
        Query query=entityManager.createQuery("SELECT p FROM Employee p WHERE p.lastName = :lastName");
        query.setParameter("lastName", lastName);
        listEmployee = query.getResultList();
        return listEmployee;
    }

    public Boolean updateEmployee(int idEmpl, int idComp, String firstName, String lastName, String email, String address, String phoneNumb, Double Salary, Date birthDa)
    {
        Boolean result = false;
        employee = new Employee();

        employee = entityManager.find(Employee.class, idEmpl);
        if(employee != null) {

            employee.setIdCompany(idComp);
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setEmail(email);
            employee.setAddress(address);
            employee.setPhoneNumber(phoneNumb);
            employee.setSalary(Salary);
            employee.setBirthDate(birthDa);

            entityManager.getTransaction().begin();
            entityManager.merge(employee);
            entityManager.getTransaction().commit();
            result = entityManager.contains(employee);
        }
        else ;
        return result;
    }

    public int deleteEmployee(int idEmpl)
    {
        int result = 0;
        employee = new Employee();

        employee = entityManager.find(Employee.class, idEmpl);
        if(employee != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(employee);
            entityManager.getTransaction().commit();
            result=1;
        }
        else ;
        return result;
    }
}
