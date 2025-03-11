/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication30;

/**
 *
 * @author Albora
 */
public class Student {
    private String Name;
    private String LastName;
    private int Age;
    private String Course;
    private String Dni;

    public Student(String Name, String LastName, int Age, String Course, String Dni) {
        this.Name = Name;
        this.LastName = LastName;
        this.Age = Age;
        this.Course = Course;
        this.Dni = Dni;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    @Override
    public String toString() {
        return " " + Name + "; " + LastName + "; " + Age + "; " + Course + "; " + Dni;
    }

   
    
}
