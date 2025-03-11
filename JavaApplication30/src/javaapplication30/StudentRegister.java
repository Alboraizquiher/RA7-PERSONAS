/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import biblioteca_personal.Biblio;
import java.util.ArrayList;
import javaapplication30.Student;
import biblioteca_personal.Biblio;
import static biblioteca_personal.Biblio.Create;
import static biblioteca_personal.Biblio.Read;
import static biblioteca_personal.Biblio.Write;
import static biblioteca_personal.Biblio.saveData;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Albora
 */
public class StudentRegister {

    ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        StudentRegister studentRegister = new StudentRegister();

        Scanner sc = new Scanner(System.in);
        int option;
        
       
       /*I have created a method 
        that shows what is inside the user registry every time 
        I start the exercise*/
        studentRegister.iniciar();

        do {
            menu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    studentRegister.addStudent(true);
                    break;
                case 2:
                    studentRegister.showList();
                    break;
                case 3:
                    studentRegister.deleteStudent();
                    break;
                case 4:
                    studentRegister.searchStudent();
                    break;
                case 5:
                    System.out.println(" SEE YOU SOON ");
                    break;

            }

        } while (option != 5);

    }

    public static void menu() {
        System.out.println("--------------------------------");

        System.out.println(" < THE MENU IS > ");
        System.out.println(" < 1. Add a new student in the register> ");
        System.out.println(" < 2. Display the list of students who have registered> ");
        System.out.println(" < 3. Remove a student from the registry > ");
        System.out.println(" < 4. Search a student by their Dni> ");
        System.out.println(" < 5. Exit > ");
        System.out.println("--------------------------------");
    }

    public void iniciar() {
        System.out.println("--------------------------------");

        try {
            Create();
        } catch (IOException ex) {
            System.err.println(" ERROR ");
        }
        
        

        try {
            saveData(students);
            System.out.println(students);
        } catch (IOException ex) {
            System.err.println(" ERROR ");
        } catch (NullPointerException ex) {
            System.err.println(" ERROR ");
        }

        System.out.println("--------------------------------");

    }
    
    /**
     * 
     * @param introData 
     * 
     * Add a new student to the registry.
            o Ask the user to enter the student's data (name, surname, age, courses,
            and ID). Create an object of the "Student" class with the entered data and save the
            information in the file "registration.txt"
     */

    public void addStudent(boolean introData) {

        /* I CALL TO THE METHOD CREATE*/
        System.out.println("--------------------------------");

        if (introData) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Introduce the name ");
            String name = sc.nextLine();
            System.out.println(" Introduce the last name ");
            String lastName = sc.nextLine();
            System.out.println(" Introduce the age ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println(" Introduce the course ");
            String course = sc.nextLine();
            System.out.println(" Introduce the Dni ");
            String Dni = sc.nextLine();

            Student student1 = new Student(name, lastName, age, course, Dni);

            students.add(student1);
        }

        String ls = System.getProperty("line.separator");
        String registerStudent = "";
        for (int i = 0; i < students.size(); i++) {

            if (i == 0) {

                registerStudent += (students.get(i).getName() + "; " + students.get(i).getLastName() + "; " + students.get(i).getAge() + "; " + students.get(i).getCourse() + "; " + students.get(i).getDni());

            } else {

                registerStudent += ls + (students.get(i).getName() + "; " + students.get(i).getLastName() + "; " + students.get(i).getAge() + "; " + students.get(i).getCourse() + "; " + students.get(i).getDni());

            }

        }
        System.out.println(registerStudent);
        try {
            Write(registerStudent);
            System.out.println("");
        } catch (IOException ex) {
            System.err.println(" ERROR ");
            System.out.println("--------------------------------");
        }
        System.out.println("--------------------------------");

    }
    
    /**
     *  Display the list of registered students.
                o Read the content of the "registration.txt" 
                * file and display the data of each 
                * stored student on the screen.
     */

    public void showList() {
        System.out.println("--------------------------------");
        try {
            Read();
        } catch (IOException ex) {
            System.err.println(" ERROR ");
        }
        System.out.println("--------------------------------");
    }
    
    /**
     * Delete a student from the registry.
            o The list of students will be displayed 
            * and the user will be asked to indicate 
            * the ID of the student they want to delete.
     */

    public void deleteStudent() {

        try {
            
            Read();
        } catch (IOException ex) {
            System.err.println(" ERROR ");
        }

        System.out.println("-------------------------");
        System.out.println(" Enter the Dni of the user to delete ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce the Dni ");
        String Dni = sc.nextLine();
        String esElEstudiante = "";

        for (int i = 0; i < students.size(); i++) { 

            if (students.get(i).getDni().equals(Dni)) {

                esElEstudiante += (students.get(i).getName() + students.get(i).getDni());
                System.out.println("");
                System.out.print(esElEstudiante + " This is the student? true/false ");
                boolean esOno = sc.nextBoolean();
                if (esOno == true) {

                    students.remove(i);

                    addStudent(false);

                    try {

                        Read();
                    } catch (IOException ex) {
                        System.err.println(" ERROR");
                        System.out.println("--------------------------------");
                    }
                    System.out.println("--------------------------------");
                } else if (esOno == false) {

                    System.out.println("Okey, bye");
                    System.out.println("--------------------------------");

                }

            } else {

                System.out.println("That student does not exist");
                System.out.println("--------------------------------");

            }

        }
    }
    
    /**
     * Buscar un alumno por su DNI.
            o Solicitar al usuario que ingrese el DNI del alumno a buscar. 
            * Leer el archivo "registro.txt" y mostrar en pantalla 
            * los datos del alumno que coincidan con el DNI
            * ingresado.
     */

    public void searchStudent() {

        System.out.println("-------------------------");
        System.out.println(" Enter the Dni of the user to search ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce the Dni ");
        String DniSearch = sc.nextLine();

        String Estudiante = "";

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getDni().equals(DniSearch)) {

                Estudiante += (students.get(i).getName() + " ; " + students.get(i).getLastName() + " ; " + students.get(i).getCourse() + " ; " + students.get(i).getDni());
                System.out.println(Estudiante);
                System.out.println("-------------------------");

            } else {

                System.out.println("That student does not exist");
                System.out.println("--------------------------------");
            }

        }
    }

}
