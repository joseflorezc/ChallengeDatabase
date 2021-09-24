package mainTest;


import helper.CrudCompany;
import helper.CrudEmployee;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Principal {

    protected static CrudCompany crudCompany = new CrudCompany();
    protected static CrudEmployee crudEmployee= new CrudEmployee();

    public static void main(String[] args) throws ParseException {

//        SimpleDateFormat formatter =new SimpleDateFormat("yyyy-MM-dd");
//        crudEmployee.getAllEmployees();
//        crudEmployee.findEmployeeByName("Kameja");
//
//        String birthD = "1998-02-11";
//        Date birthDate = formatter.parse(birthD);
//        crudEmployee.insertEmployee(200, 1, "jose", "florez", "jf@gmail.com","calle 100 # 7 12", "3114442267", 333.0, birthDate );
//
//        String birthD = "1993-12-28";
//        Date birthDate = formatter.parse(birthD);
//        crudEmployee.updateEmployee(200, 2, "jose daniel", "florez", "jdf@gmail.com","calle 110 # 77 11", "3111234567", 11000.0, birthDate );
//
//        crudEmployee.deleteEmployee(200);

        //crudCompany.getAllCompanies();
       // crudCompany.findCompanyId(3);
       // crudCompany.findCompanyName("Exito");
       // crudCompany.insertCompany(8, "Carrefur", "5893242", "carrefur@gmail.com", "14 trash rd.");
       // crudCompany.updateCompany(8, "Jumbo", "789624", "jumbo@gmail.com", "27 trash rd.");
       // crudCompany.deleteCompany(8);
    }
}
