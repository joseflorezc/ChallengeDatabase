# ChallengeDatabase

## 1.	Crear la tabla Institución que estará relacionada con la tabla Empleado, para poder mostrar los Estudios Realizados por el Empleado.  Usar llave foránea.   Enviar una imagen de como queda el modelo entidad relación de las tablas.

![ER Model](https://user-images.githubusercontent.com/53889184/134539085-04176038-6a28-4109-a33e-3caadbf36316.png)


## 2.	Utilizar el Join para traer información la tabla Empleado y la tabla institución.

Select e.*, i.* From InstitutionEmployee ie, Employee e, Institution i  <br/>
Where ie.idInstitution = i.idInstitution <br/>
And ie.idEmployee = e.idEmployee;

Select * From InstitutionEmployee ie <br/>
INNER JOIN Employee e <br/>
ON ie.idEmployee = e.idEmployee <br/>
INNER JOIN Institution i <br/>
ON ie.idInstitution = i.idInstitution; 

## 3.	Usando Subconsultas Traer la información de los niños “Tabla Children” cuyos papás Trabajan en PriceSmart el cual tiene un idCompany = 5. Nota: solo traer la información de la tabla Children.

Select ch.* From Children ch Where ch.idEmployee in ( <br/>
Select e.idEmployee From Employee e <br/>
Where e.idCompany = 5); 

## 4.	Hacer un programa en Java usando JPA+Hibernate para la conexión con la base de datos, donde El usuario pueda elegir:

  ### a.	Traer todos los Registros de la tabla Employee.
  
  ### b.	Buscar empleados por Apellido.
  
  ### c.	Insertar un nuevo Empleado en la tabla Employee.
  
  ### d.	Modificar un registro de la tabla Employee.
  
  ### e.	Eliminar un registro de la tabla Employee.
