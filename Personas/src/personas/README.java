/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author Usuario 1
 */
public class README {
    
    /**
     * Te han contratado para hacer un programa que gestione las altas y bajas tanto de empleados como de clientes de una empresa. 
     * Para ello, supón que has elaborado 
     * el siguiente diagrama de clases según sus necesidades
     * con el que podrás elaborar el modelo de datos inicial 
     * de la aplicación.
     * 
     * El programa ha de mostrar al usuario un menú con las 
     * siguientes opciones:
     * 
     * 1) Dar de alta
     * 2) Dar de baja
     * 3) Modificar
     * 4) Mostrar
     * 5) Buscar
     * 6) Salir
     * 
     * El proyecto debe tener un paquete Modelo con las clases Persona, Empleado y Cliente; 
     * un paquete Vista : 
     * con el archivo de Inicio y 
     * un paquete Controlador :
     * con un único archivo ControladorPersonas.
     * 
     * ENTIDIDAD ADICIONAL [2p]
     * 
     * Crea una nueva entidad B, vehículo, en el modelo de 
     * datos que tenga una relación unidireccional 0:1 con 
     * la clase Persona. Esta entidad B debe tener un 
     * elemento que la identifique del resto de entidades B
     * 
     * (matrícula). No puede haber entidades B con el mismo 
     * elemento (matrícula) duplicado y una misma entidad B
     * 
     * (vehículo) puede estar vinculada con diferentes 
     * 
     * DAR DE ALTA [1p]
     * Esta opción le pedirá al usuario si quiere dar de 
     * alta a un empleado o a un cliente. Posteriormente 
     * pedirá y validará los datos y se guardará el objeto 
     * creado en un ArrayList<Persona> denominado
     * “personas”.
     * - No puede haber personas con el mismo idPersona. 
     * Tampoco puede haber empleados con el mismo idEmpleado ni clientes con el mismo idCliente, 
     * aunque sí podrían existir empleados y clientes 
     * que tuvieran el mismo ID, es decir (idEmpleado = 
     * idCliente, pero con distinto idPersona. 
     * 
     * DAR DE BAJA [1p]
     * Esta opción le pedirá al usuario qué persona quiere 
     * dar de baja, identificada por su ID, y posteriormente 
     * la borrará del ArrayList “personas”. 
     * 
     * MODIFICAR [1p]
     * En esta opción se podrá modificar cualquier atributo 
     * de una persona excepto los ids que tenga asociados. 
     * 
     * MOSTRAR [1p]
     * Esta opción mostrará los atributos de una persona 
     * seleccionada a partir de su idPersona.
     * 
     * BUSCAR [1p]
     * En esta opción se buscará a las personas por su nombre 
     * y se mostrará sus atributos por consola.
     * 
     * FICHEROS [1p]
     * Para que la aplicación sea persistente, antes de 
     * finalizar el programa vuelca toda la información del 
     * ArrayList en un fichero y antes de arrancar carga 
     * toda la información del fichero en el ArrayList.
     * Implementa estas funciones en la clase Ficheros en 
     * el paquete Modelo.
     * SOBREESCRITURA DE MÉTODOS
     * 
     * Para que la actividad sea evaluable es obligatorio 
     * que sobrescribas los métodos necesarios en el modelo 
     * para agilizar la búsqueda de objetos en el ArrayList. 
     * También para mostrar la información por pantalla.
     */
}
