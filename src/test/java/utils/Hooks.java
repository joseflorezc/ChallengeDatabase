package utils;

import helper.CrudCompany;
import helper.CrudEmployee;
import org.testng.annotations.BeforeClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    protected CrudCompany crudCompany;
    protected CrudEmployee crudEmployee;
    protected Date birthDate;
    protected Date birthDateUpdate;

    @BeforeClass
    public void setUp() throws ParseException {
        SimpleDateFormat formatter =new SimpleDateFormat("yyyy-MM-dd");

        String birthD = "1998-02-11";


        birthDate = formatter.parse(birthD);

        String birthDUpdate = "1993-12-28";
        birthDateUpdate = formatter.parse(birthDUpdate);
        crudCompany = new CrudCompany();
        crudEmployee= new CrudEmployee();
    }
}
