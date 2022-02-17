package controller;
import database1.ScheduleConnection;
import model.ModelSchedule;
import java.sql.*;

import java.util.List;
import java.util.ArrayList;



public class ScheduleController{
    static ScheduleConnection db = new ScheduleConnection();

    public int registerSchedulePreparedStatement(ModelSchedule schedule) {

        try {
           

            String query = "INSERT INTO `schedule`.`schedule` (`PatientName`, `Age`, `Gender`, `Problems`, `DoctorName`, `Year`, `Month`, `Day`, `Time`, `Am_Pm`) VALUES ('?', '?', '?', '?', '?', '?', '?', '?', '?','?')";
            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, schedule.getTxtPatient_Name());
            st.setString(2, schedule.getComboboxAge());
            st.setString(3, schedule.getJComboBoxGender());
            st.setString(4, schedule.getTxtAreaProblems());
            st.setString(5, schedule.getJcomboBoxDoctorName());
            st.setString(6, schedule.getJSpinner1());
            st.setString(7, schedule.getMonthSipnner());
            st.setString(8, schedule.getDaySpinner());
            st.setString(9, schedule.getTxtTime());
            st.setString(10, schedule.getJComboBoxTime());

            
            return db.maniulateschedule(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
 }

    //delete customer
    public void deleSchedule(String username) {
        String query;
        query = "delete from schedule where Am_Pm = "+ Integer.valueOf(username) +";";
        db = new ScheduleConnection();
        db.maniulateschedule(query);
    }

    // Register ;
    public int registerSchedule(ModelSchedule schedule){
        String query;
        query= "INSERT INTO `schedule`.`schedule` (`PatientName`, `Age`, `Gender`, `Problems`, `DoctorName`, `Year`, `Month`, `Day`, `Time`, `Am_Pm`) VALUES('"+ 
            schedule.getTxtPatient_Name()+"','"+
            schedule.getComboboxAge()+"','"+
            schedule.getJComboBoxGender()+"','"+
            schedule.getTxtAreaProblems()+"','"+
            schedule.getJcomboBoxDoctorName()+"','"+
            schedule.getJSpinner1()+"','"+
            schedule.getMonthSipnner()+"','"+
            schedule.getDaySpinner()+"','"+
            schedule.getTxtTime()+"','"+
            schedule.getJComboBoxTime()+"');";
        
        db = new ScheduleConnection();
        return db.maniulateschedule(query);
     }


     public List<ModelSchedule> getAllSchedules() {
        String query;
        query = "select * from schedule";
        db = new ScheduleConnection();
        ResultSet rs = db.retrieveschedule(query);
        List<ModelSchedule> lstSchedules = new ArrayList<ModelSchedule>();

        try {
            while (rs.next()) {
                ModelSchedule schedule = new ModelSchedule();
                schedule.setPatientstId(rs.getInt("PatientstId"));
                
                schedule.setTxtPatient_Name(rs.getString("PatientName"));
                schedule.setComboboxAge(rs.getString("Age"));
                schedule.setJComboBoxGender(rs.getString("Gender"));
                schedule.setTxtAreaProblems(rs.getString("Problems"));
                schedule.setJcomboBoxDoctorName(rs.getString("DoctorName"));
                schedule.setJSpinner1(rs.getString("Year"));
                schedule.setMonthSipnner(rs.getString("Month"));
                schedule.setDaySpinner(rs.getString("Day"));
                schedule.setTxtTime(rs.getString("Time"));
                schedule.setJComboBoxTime("Am_Pm");

                lstSchedules.add(schedule);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstSchedules;
    }
}



    

    

