
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mardiyya S
 */
public class Question3cll {
    static String name, address, job, annualsalary;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Question3cll.name = name;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Question3cll.address = address;
    }

    public static String getJob() {
        return job;
    }

    public static void setJob(String job) {
        Question3cll.job = job;
    }

    public static String getAnnualsalary() {
        return annualsalary;
    }

    public static void setAnnualsalary(String annualsalary) {
        Question3cll.annualsalary = annualsalary;
    }
    
    public static void writeFile() throws IOException
    {
     BufferedWriter myBF = new BufferedWriter (new FileWriter("StudentRecord.txt",true));  
     myBF.write(getName() + " " + getaddress() + " " + getjob() +" " + getannualsalary());
     myBF.newLine();
     myBF.close();
    }

    private static String getaddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String getjob() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String getannualsalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
