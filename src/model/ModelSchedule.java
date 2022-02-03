package model;

public class ModelSchedule {
    private int PatientstId;
    private String TxtPatient_Name;
    private String ComboboxAge;
    private String jComboBoxGender;
    private String  TxtAreaProblems;
    private String jComboBoxDoctorName;
    private String jspinner1;
    private String monthSipner;
    private String DaySpinner;
    private String jComboBoxTime;

    public ModelSchedule(){
        
    }

    public ModelSchedule(String TxtPatient_Name,String ComboboxAge ,String jComboBoxGender,String TxtAreaProblems, String jComboBoxDoctorName,String jspinner1,String monthSipner,String DaySpinner,String jComboBoxTime){
        this.TxtPatient_Name = TxtPatient_Name;
        this.ComboboxAge = ComboboxAge;
        this.jComboBoxGender = jComboBoxGender;
        this.TxtAreaProblems = TxtAreaProblems;
        this.jComboBoxDoctorName = jComboBoxDoctorName;
        this.jspinner1=jspinner1;
        this.monthSipner=monthSipner;
        this.DaySpinner = DaySpinner;
        this.jComboBoxTime =jComboBoxTime;
    }

    public ModelSchedule(int PatientstId,String TxtPatient_Name,String ComboboxAge ,String jComboBoxGender,String TxtAreaProblems,String jComboBoxDoctorName,String jspinner1,String monthSipner,String DaySpinner,String jComboBoxTime){
        this.PatientstId = PatientstId;
        this.TxtPatient_Name = TxtPatient_Name;
        this.ComboboxAge = ComboboxAge;
        this.jComboBoxGender = jComboBoxGender;
        this.TxtAreaProblems = TxtAreaProblems;
        this.jComboBoxDoctorName = jComboBoxDoctorName;
        this.jspinner1=jspinner1;
        this.monthSipner=monthSipner;
        this.DaySpinner = DaySpinner;
        this.jComboBoxTime =jComboBoxTime;
    }
    
    public int getPatientstId() {
        return PatientstId;
    }

   
    public void setPatientstId(int PatientstId) {
        this.PatientstId = PatientstId;
    }

   
    public String getTxtPatient_Name() {
        return TxtPatient_Name;
    }

   
    public void setTxtPatient_Name(String TxtPatient_Name) {
        this.TxtPatient_Name = TxtPatient_Name;
    }

   
    public String getComboboxAge() {
        return ComboboxAge;
    }

    public void setComboboxAge(String ComboboxAge) {
        this.ComboboxAge = ComboboxAge;
    }
   
    public String getJComboBoxGender() {
        return jComboBoxGender;
    }

    public void setJComboBoxGender(String jComboBoxGender) {
        this.jComboBoxGender = jComboBoxGender;
    }

  
    public String getTxtAreaProblems() {
        return TxtAreaProblems;
    }

   
    public void setTxtAreaProblems(String TxtAreaProblems ) {
        this.TxtAreaProblems = TxtAreaProblems;
    }

    
    public String getJcomboBoxDoctorName() {
            return jComboBoxDoctorName ;
    }

    
    public void setJcomboBoxDoctorName(String jComboBoxDoctorName) {
            this.jComboBoxDoctorName = jComboBoxDoctorName;
     }

    public String getJspinner1(){
        return jspinner1;
    } 

    public void setJspinner1(){
        this.jspinner1 = jspinner1;
    }

    public String getMonthSipner(){
        return monthSipner;
    } 

    public void setMonthSipner(){
        this.monthSipner = monthSipner ;
    
    }
  
    public String getDaySpinner() {
        return DaySpinner;
    }

     public void setDaySpinner(String DaySpinner) {
        this.DaySpinner= DaySpinner;
    }

    public String getJComboBoxTime() {
        return jComboBoxTime;
    }

     public void setJComboBoxTime(String jComboBoxTime) {
        this.jComboBoxTime= jComboBoxTime;
    }

    
    

}
