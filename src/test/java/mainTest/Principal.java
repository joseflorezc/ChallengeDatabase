package mainTest;


import helper.CrudCompany;
import helper.CrudEmployee;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Hooks;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Principal extends Hooks {




    @Test(priority = 0)
    public void allEmployeesFromDatabase(){
        int numberOfEmployees = crudEmployee.getAllEmployees();

        Assert.assertEquals(numberOfEmployees, 5);
    }

    @Test(priority = 1)
    public void findEmployeeByLastName () {
        int employeesFound = crudEmployee.findEmployeeByName("Kameja");

        Assert.assertEquals(employeesFound, 1);
    }

    @Test(priority = 2)
    public void  addingEmployeeToDB(){
        Boolean successfullyAdded = crudEmployee.insertEmployee(200, 1, "jose", "florez", "jf@gmail.com",
                "calle 100 # 7 12", "3114442267", 333.0, birthDate );

        Assert.assertTrue(successfullyAdded);
    }

    @Test(priority = 3)
    public void updatingEmployeeFromDB(){
        Boolean successfullyUpdated = crudEmployee.updateEmployee(200, 2, "jose daniel", "florez", "jdf@gmail.com",
                "calle 110 # 77 11", "3111234567", 11000.0, birthDateUpdate );
        Assert.assertTrue(successfullyUpdated);
    }


    @Test(priority = 4)
    public void deleteEmployeeFromDBWithID(){
       int deletedSuccessfully= crudEmployee.deleteEmployee(200);
       Assert.assertEquals(deletedSuccessfully, 1);
    }

}
