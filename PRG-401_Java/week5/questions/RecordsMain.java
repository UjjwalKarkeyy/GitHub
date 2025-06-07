package week5.questions;

import javax.print.Doc;

class MedicalRecords{

    private String name, diseaseName;
    private int diseaseId;
    private double fees = 0.0;

    void getRecord(){

        System.out.printf("This record is of: %s. The patient is suffering with %s.\nThe disease id is: %d\nAnd the fees charged is: %f",
                            this.name, this.diseaseName, this.diseaseId, this.fees);
    }

    private void setRecord(String name, String diseaseName, int diseaseId, double fees){
        this.name = name;
        this.diseaseName = diseaseName;
        this.diseaseId = diseaseId;
        this.fees += fees;
    }

    public void updateRecords(String name, String diseaseName, int diseaseId, double fees){
        setRecord(name, diseaseName, diseaseId, fees);
    }
}

class Doctor{

    MedicalRecords m1 = new MedicalRecords();

    // Doctor can view the record
    public void viewRecord(){
        m1.getRecord();
    }
    
    // Doctor can also update the record
    public void updatePatientRecord(String name, String diseaseName, int diseaseId, double fees){
        m1.updateRecords(name, diseaseName, diseaseId, fees);
    }
}

class Patient{

    MedicalRecords m1 = new MedicalRecords();

    // Patient can only view the record
    public void viewRecord(){
        m1.getRecord();
    }

}
public class RecordsMain{
    public static void main(String[] args) {    

        Patient p1 = new Patient();
        Doctor d1 = new Doctor();

        d1.updatePatientRecord("Ujjwal", "Dengue", 101, 1000.50);
        d1.viewRecord();
        System.out.println("\n");
        p1.viewRecord();
        System.out.println();
    }
}
