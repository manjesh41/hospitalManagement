package model;

public class ModelSchedule {
    private int PatientstId;
    private String TxtPatient_Name;
    private String ComboboxAge;
    private String jComboBoxGender;
    private String  TxtAreaProblems;
    private String jComboBoxDoctorName;
    private String jSpinner1;
    private String monthSipnner;
    private String DaySpinner;
    private String TxtTime;
    private String jComboBoxTime;

    public ModelSchedule(){
        
    }

    public ModelSchedule(String TxtPatient_Name,String ComboboxAge ,String jComboBoxGender,String TxtAreaProblems, String jComboBoxDoctorName,String jSpinner1,String monthSipnner,String DaySpinner,String TxtTime,String jComboBoxTime){
        this.TxtPatient_Name = TxtPatient_Name;
        this.ComboboxAge = ComboboxAge;
        this.jComboBoxGender = jComboBoxGender;
        this.TxtAreaProblems = TxtAreaProblems;
        this.jComboBoxDoctorName = jComboBoxDoctorName;
        this.jSpinner1=jSpinner1;
        this.monthSipnner=monthSipnner;
        this.DaySpinner = DaySpinner;
        this.TxtTime =TxtTime;
        this.jComboBoxTime=jComboBoxTime;
    }

    public ModelSchedule(int PatientstId,String TxtPatient_Name,String ComboboxAge ,String jComboBoxGender,String TxtAreaProblems,String jComboBoxDoctorName,String jSpinner1,String monthSipnner,String DaySpinner,String TxtTime,String jComboBoxTime){
        this.PatientstId = PatientstId;
        this.TxtPatient_Name = TxtPatient_Name;
        this.ComboboxAge = ComboboxAge;
        this.jComboBoxGender = jComboBoxGender;
        this.TxtAreaProblems = TxtAreaProblems;
        this.jComboBoxDoctorName = jComboBoxDoctorName;
        this.jSpinner1=jSpinner1;
        this.monthSipnner=monthSipnner;
        this.DaySpinner = DaySpinner;
        this.TxtTime =TxtTime;
        this.jComboBoxTime=jComboBoxTime;
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

    public String getJSpinner1(){
        return jSpinner1;
    } 

    public void setJSpinner1(String jSpinner1){
        this.jSpinner1=jSpinner1;
    }
    

    public String getMonthSipnner(){
        return monthSipnner;
    } 

    public void setMonthSipnner(String monthSipnner){
        this.monthSipnner = monthSipnner ;
    
    }
  
    public String getDaySpinner() {
        return DaySpinner;
    }

     public void setDaySpinner(String DaySpinner) {
        this.DaySpinner= DaySpinner;
    }

    public String getTxtTime() {
        return TxtTime;
    }

     public void setTxtTime(String TxtTime) {
        this.TxtTime= TxtTime;
    }

    public String getJComboBoxTime() {
        return jComboBoxTime;
    }

     public void setJComboBoxTime(String jComboBoxTime) {
        this.jComboBoxTime= jComboBoxTime;
    }


    
    

    
    

}
