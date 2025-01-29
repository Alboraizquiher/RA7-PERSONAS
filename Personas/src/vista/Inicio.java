/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import personas.Empleado;
import personas.Personas;
import personas.cliente;

/**
 *
 * @author Usuario 1
 */

/*   /**
     * 1) Dar de alta
     * 2) Dar de baja
     * 3) Modificar
     * 4) Mostrar
     * 5) Buscar
     * 6) Salir
     * 
     /
 */
public class Inicio {

    /*
    ID CONTADOR
    I create differents id to coordinate the id about employees,customers and people.
    The last one have the information of the employees and the customers
    You can repeat, for example, the same id in customers(1) = employees(1), but in int person the id is never repeated:
    person(1->customer),person(2->employee) 
    */
    int idEmpleado = 1;
    int idPersona = 1;
    int idCliente = 1;

    Scanner sc = new Scanner(System.in);
    
    /*  I create this private arraylist to save in there the differrents class that I have in 
        the project*/

    private ArrayList<cliente> customers;
    private ArrayList<Empleado> employee;

    public Inicio() {

    /*  Then i create the method INICIO to save in there the arrays that I create*/
    
        customers = new ArrayList<>();
        employee = new ArrayList<>();

    }

    public static void main(String[] args) {

        Inicio inicio = new Inicio();

        Scanner sc = new Scanner(System.in);

        /*The menu has create following the sentence of the project*/
        
        System.out.println("<< OPTIONS MENU >>");
        System.out.println("<< 1 -> REGISTER >>");
        System.out.println("<< 2 -> UNSUBSCRIBE >>");
        System.out.println("<< 3 -> MODIFY >>");
        System.out.println("<< 4 -> SHOW >>");
        System.out.println("<< 5 -> SEARCH >>");
        System.out.println("<< 6 -> EXIT  >>");

        int menu = sc.nextInt();

        do {

            switch (menu) {

                case 1:
                    inicio.register();
                    break;

                case 2:
                    inicio.unsubscribe();

                    break;

                case 3:
                    inicio.modify();

                    break;

                case 4:
                    inicio.show();

                    break;

                case 5:
                    inicio.search();

                    break;

                case 6:
                    System.out.println("thank you , good bye");

                    break;

            }

        } while (menu != 6);

    }

    /* DAR DE ALTA [1p]
     * Esta opción le pedirá al usuario si quiere dar de 
     * alta a un empleado o a un cliente. Posteriormente 
     * pedirá y validará los datos y se guardará el objeto 
     * creado en un ArrayList<Persona> denominado
     * “personas”.
     * - No puede haber personas con el mismo idPersona. 
     * Tampoco puede haber empleados con el mismo idEmpleado ni clientes con el mismo idCliente, 
     * aunque sí podrían existir empleados y clientes 
     * que tuvieran el mismo ID, es decir (idEmpleado = idCliente, pero con distinto idPersona. 
     * */
    public void register() {

        System.out.println(" << THE SELECTED OPTION IS TO REGISTER >> ");
        System.out.println(" Do you want to register: employee [0] or customer [1] ,if you dont want put [8] ");

        int toRegister = sc.nextInt();
        do {
            if (toRegister == 0) {

                System.out.println(" Perfect you select the option << EMPLOYEE >>");

                System.out.println("PLEASE ENTER THE EMPLOYEE THAT YOU WANT TO REGISTER");

                System.out.println("Introduce the IDEMPLOYEE ");

                System.out.println("Introduce the salary");
                double sueldo = sc.nextDouble();

                System.out.println("Introduce the IDPERSON ");
                int idPersona = sc.nextInt();

                System.out.println("Introduce the gender");
                String genero = sc.nextLine();

                System.out.println("Introduce the age ");
                int edad = sc.nextInt();

                System.out.println("Introduce the name ");
                String nombre = sc.nextLine();

                System.out.println("Introduce the direction");
                String direccion = sc.nextLine();

                Empleado newEmployee = new Empleado(idEmpleado, sueldo, idPersona, nombre, genero, edad, direccion);

                employee.add(newEmployee);
                idEmpleado++;
                idPersona++;

                System.out.println("THE EMPLOYEE HAS BEEN REGISTERED SUCCESSFULLY.");

            } else if (toRegister == 1) {

                System.out.println(" Perfect you select the option << CUSTOMER >>");

                System.out.println(" the IDEMPLOYEE ");

                System.out.println("Introduce the salary");
                boolean vip = sc.nextBoolean();

                System.out.println(" the data ");
                String Date  = sc.nextLine();

                

                System.out.println(" Tu idCliente es:" + idCliente);

                System.out.println("Introduce the gender");
                String genero = sc.nextLine();

                System.out.println("Introduce the age ");
                int edad = sc.nextInt();

                System.out.println("Introduce the name ");
                String nombre = sc.nextLine();

                System.out.println("Introduce the direction");
                String direccion = sc.nextLine();

                cliente newCustomer = new cliente(idCliente, Date, vip, idPersona, nombre, genero, edad, direccion);

                customers.add(newCustomer);
                idCliente++;
                idPersona++;

            }

        } while (toRegister != 8);

    }

    /**
     * DAR DE BAJA [1p] Esta opción le pedirá al usuario qué persona quiere dar
     * de baja, identificada por su ID, y posteriormente la borrará del
     * ArrayList “personas”.
     *
     */
    public void unsubscribe() {

    }

    /* * MODIFICAR [1p]
     * En esta opción se podrá modificar cualquier atributo 
     * de una persona excepto los ids que tenga asociados. 
     * 
     */
    public void modify() {
    }

    /**
     * MOSTRAR [1p] Esta opción mostrará los atributos de una persona
     * seleccionada a partir de su idPersona.
     *
     */
    public void show() {
    }

    /* BUSCAR [1p]
     * En esta opción se buscará a las personas por su nombre 
     * y se mostrará sus atributos por consola.
     * */
    public void search() {
    }
}
