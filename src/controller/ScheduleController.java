package controller;
import database2.ScheduleConnection;
import model.ModelSchedule;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;



public class ScheduleController{
    static ScheduleConnection db = new ScheduleConnection();
    private ModelSchedule registersschedule;

    public int registerSchedulePrepaedStatement(ModelSchedule registerschedule) {

        try {
            String query = "INSERT INTO schedule (PatientName, Age, Gender, Problems, DoctorName, Year, Month, Day, Time,Am_Pm) VALUES ('?', '?', '?', '?', '?', '?', '?', '?', '?','?')";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, registerschedule.getTxtPatient_Name());
            st.setString(2, registerschedule.getComboboxAge());
            st.setString(3, registerschedule.getJComboBoxGender());
            st.setString(4, registerschedule.getTxtAreaProblems());
            st.setString(5, registerschedule.getJcomboBoxDoctorName());
            st.setString(6, registerschedule.getJSpinner1());
            st.setString(7, registerschedule.getMonthSipnner());
            st.setString(8, registerschedule.getDaySpinner());
            st.setString(9, registerschedule.getTxtTime());
            st.setString(10, registerschedule.getJComboBoxTime());

            
            return db.maniulateregisterschedule(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
 }

    // Register ;
    public static int registerSchedule(ModelSchedule registerschedule){
        String query;
        query= "INSERT INTO schedule (PatientName, Age, Gender, Problems, DoctorName, Year, Month, Day, Time, Am_Pm) VALUES'"+ 
        registerschedule.getTxtPatient_Name()+"','"+
        registerschedule.getComboboxAge()+"','"+
        registerschedule.getJComboBoxGender()+"','"+
        registerschedule.getTxtAreaProblems()+"','"+
        registerschedule.getJcomboBoxDoctorName()+"','"+
        registerschedule.getJSpinner1()+"','"+
        registerschedule.getMonthSipnner()+"','"+
        registerschedule.getDaySpinner()+"','"+
        registerschedule.getTxtTime()+"','"+
        registerschedule.getJComboBoxTime()+"');";
        
        db = new ScheduleConnection();
        return db.maniulateregisterschedule(query);
     }


     public List<ModelSchedule> getAllSchedules() {
        String query;
        query = "select * from schedule";
        db = new ScheduleConnection();
        ResultSet rs = db.retrieveregisterschedule(query);
        List<ModelSchedule> lstSchedules = new ArrayList<ModelSchedule>();

        try {
            while (rs.next()) {
                ModelSchedule registerschedule = new ModelSchedule();
                registerschedule.setPatientstId(rs.getInt("PatientstId"));
                registerschedule.setTxtPatient_Name(rs.getString("TxtPatient_Name"));
                registersschedule.setTxtPatient_Name(rs.getString("TxtPatient_Name"));
                registersschedule.setTxtPatient_Name(rs.getString("TxtPatient_Name"));
                registersschedule.setComboboxAge(rs.getString("ComboboxAge"));
                registersschedule.setJComboBoxGender(rs.getString("JComboBoxGender"));
                registersschedule.setTxtAreaProblems(rs.getString("TxtAreaProblems"));
                registersschedule.setJcomboBoxDoctorName(rs.getString("jComboBoxDoctorName"));
                registersschedule.setJSpinner1(rs.getString("jSpinner1"));
                registersschedule.setMonthSipnner(rs.getString("monthSipnner"));
                registersschedule.setDaySpinner(rs.getString("DaySpinner"));
                registersschedule.setTxtTime(rs.getString("TxtTime"));
                registersschedule.setJComboBoxTime("jComboBoxTime");

                lstSchedules.add(registersschedule);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstSchedules;
    }
}



    

    

