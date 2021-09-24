package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name="Employee")  //Declara Entidad Company, que Representa una tabla en la Base de Datos
@Table(name="Employee")  // Anotacion para referirnos a la tabla en la base de Datos
public class Employee {

    @Id
    @Column(name = "idEmployee")
    protected int idEmployee;
    @Column(name = "idCompany")
    protected int idCompany;
    @Column(name = "firstName")
    protected String firstName;
    @Column(name = "lastName")
    protected String lastName;
    @Column(name = "email")
    protected String email;
    @Column(name = "address")
    protected String address;
    @Column(name = "phoneNumber")
    protected String phoneNumber;
    @Column(name = "Salary")
    protected Double Salary;
    @Column(name = "birthDate")
    protected Date birthDate;

    // no-argument constructor
    public Employee()
    {
    }

    public Employee(int idEmployee ,int idCompany, String firstName,String lastName, String email, String address, String phoneNumber, Double Salary, Date birthDate) {
        this.idEmployee = idEmployee;
        this.idCompany = idCompany;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.Salary = Salary;
        this.birthDate = birthDate;
    }
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
