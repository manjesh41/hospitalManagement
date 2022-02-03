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

    public int registerSchedulePreparedStatement(ModelSchedule schedule) {

        try {
            String query = "INSERT INTO `registerschedule`.`schedule` (`PatientName`, `Age`, `Gender`, `Problems`, `DoctorName`, `Year`, `Month`, `Day`, `Time`) VALUES ('?', '?', '?', '?', '?', '?', '?', '?', '?')";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, schedule.getTxtPatient_Name());
            st.setString(2, schedule.getComboboxAge());
            st.setString(3, schedule.getJComboBoxGender());
            st.setString(4, schedule.getTxtAreaProblems());
            st.setString(5, schedule.getJcomboBoxDoctorName());
            st.setString(6, schedule.getJSpinner1());
            st.setString(7, schedule.getMonthSipner());
            st.setString(8, schedule.getDaySpinner());
            st.setString(9, schedule.getJComboBoxTime());

            
            return db.maniulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Register ;
    public static int registerSchedule(ModelSchedule schedule){
        String query;
        query= "INSERT INTO schedule (PatientName, Age, Gender, Problems, DoctorName, Date, Time) VALUES ('"+
        
        schedule.getTxtPatient_Name()+"','"+
        schedule.getComboboxAge()+"','"+
        schedule.getJComboBoxGender()+"','"+
        schedule.getTxtAreaProblems()+"','"+
        schedule.getJcomboBoxDoctorName()+"','"+
        schedule.getDaySpinner()+"','"+
        schedule.getJComboBoxTime()+"');";
        
        db = new ScheduleConnection();
        return db.maniulate(query);
     }


     public List<ModelSchedule> getAllSchedules() {
        String query;
        query = "select * from schedule";
        db = new ScheduleConnection();
        ResultSet rs = db.retrieve(query);
        List<ModelSchedule> lstSchedules = new ArrayList<ModelSchedule>();

        try {
            while (rs.next()) {
                ModelSchedule schedule = new ModelSchedule();
                schedule.setPatientstId(rs.getInt("PatientstId"));
                schedule.setTxtPatient_Name(rs.getString("TxtPatient_Name"));
                schedule.setComboboxAge(rs.getString("ComboboxAge"));
                schedule.setJComboBoxGender(rs.getString("JComboBoxGender"));
                schedule.setTxtAreaProblems(rs.getString("TxtAreaProblems"));
                schedule.setJcomboBoxDoctorName(rs.getString("jComboBoxDoctorName"));
                schedule.setDaySpinner(rs.getString("DaySpinner"));
                schedule.setJComboBoxTime(rs.getString("jComboBoxTime"));

                lstSchedules.add(schedule);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstSchedules;
    }
}



    

    


