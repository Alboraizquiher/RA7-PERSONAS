/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_personal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication30.Student;

/**
 *
 * @author Albora
 */
public class Biblio {

    private static final String projectRoute = System.getProperty("user.dir");
    private static final String separatoor = File.separator;
    private static final String folderPath = projectRoute + separatoor + "nuevaCarpeta";
    private static final String fileRoute = folderPath + separatoor + "register.txt";
    
    /**
     * 
     * @throws IOException 
     * 
     * I have created the method to create the folder and the log file where 
     * I will put the users through the terminal
     * 
     */

    public static void Create() throws IOException {

        File carpeta = new File(folderPath);

        if (!carpeta.exists()) {

            carpeta.mkdir();

        }

        File register = new File(folderPath + separatoor + "register.txt");
        if (!register.exists()) {
            register.createNewFile();
        }

    }
    
    /**
     * 
     * @param register
     * @throws IOException 
     * 
     * It is the method to write inside the file created previously
     */

    public static void Write(String register) throws IOException {

        File document = new File(folderPath + separatoor + "register.txt");

       
            FileWriter fw = new FileWriter(document);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(register);
            bw.flush();
            bw.close();
        

    }
    
    /**
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     * 
     * is the method to read the previously created file
     */

    public static void Read() throws FileNotFoundException, IOException {
        File document = new File(folderPath + separatoor + "register.txt");
       
            FileReader fr = new FileReader(document);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null) {

                System.out.println(line);

                line = br.readLine();
            }

            br.close();

       

    }
    
    /**
     * 
     * @param students
     * @throws FileNotFoundException
     * @throws IOException
     * @throws NullPointerException 
     * 
     * This has been the most complicated on a personal level. 
     * It consists of saving the arrayList of students created in StudentRegister. 
     * It consists of saving the information from 
     * the registration file since every time the program 
     * is initialized it is necessary to load it with the registration data.
     */

    public static void saveData(ArrayList<Student> students) throws FileNotFoundException, IOException, NullPointerException {

        File savefile = new File(fileRoute);

        if (savefile.exists()) {

            FileReader fr = new FileReader(savefile);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String[] save = line.split("; ");

            while (line != null) {

                students.add(new Student(save[0], save[1], Integer.parseInt(save[2]), save[3], save[4]));
                line = br.readLine();
            }

            br.close();

        } else {

            System.out.println(" ERROR, THE FILE DOESN'T EXIST");

        }
    }

}
