package controller;

import database1.DoctorConnection;
import model.Doctor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class DoctorController {
    DoctorConnection db = new DoctorConnection();

    public int registerCustomerPrepaedStatement(Doctor doctor) {
        try {
            String query = "insert into customer(custFname,custLname,address,phoneNo," +
                    "username,Field,password) values(?,?,?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, doctor.getCustFname());
            st.setString(2, doctor.getCustLname());
            st.setString(4, doctor.getPhoneNo());
            st.setString(5, doctor.getAddress());
            st.setString(6, doctor.getUsername());
            st.setString(7, doctor.getField());
            st.setString(8, doctor.getPassword());

            return db.maniulatedoctor(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    // Register customer;
    public int registerCustomer(Doctor doctor){
       String query;
       query= "insert into doctor(custFname, custLname,address, phoneNo,username,Field, password) values('"+
            doctor.getCustFname()+"','"+
            doctor.getCustLname()+"','"+
            doctor.getAddress()+"','"+
            doctor.getPhoneNo()+"','"+
            doctor.getUsername()+"','"+
            doctor.getField()+"','"+
            doctor.getPassword()+"');";
       
       db = new DoctorConnection();
       return db.maniulatedoctor(query);
    }

    //Login Customer
    // Login customer
    public Doctor loginCustomer(String username, String password) {
        String query;
        query = "select * from doctor where username = '" + username +
                "' and password = '" + password + "';";

        ResultSet rs = db.retrievedoctor(query);
        Doctor doctor = null;

        try {
            while (rs.next()) {
                doctor = new Doctor();
                doctor.setCustId(rs.getInt("custId"));
                doctor.setCustFname(rs.getString("custFname"));
                doctor.setCustLname(rs.getString("custLname"));
                doctor.setAddress(rs.getString("address"));
                doctor.setUsername(rs.getString("username"));
                doctor.setField(rs.getString("Field"));

            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return doctor;
    }

    public List<Doctor> getAllCustomers() {
        String query;
        query = "select * from doctor";
        db = new DoctorConnection();
        ResultSet rs = db.retrievedoctor(query);
        List<Doctor> lstCustomers = new ArrayList<Doctor>();

        try {
            while (rs.next()) {
                Doctor doctor = new Doctor();
                doctor.setCustId(rs.getInt("custId"));
                doctor.setCustFname(rs.getString("custFname"));
                doctor.setCustLname(rs.getString("custLname"));
                doctor.setPhoneNo(rs.getString("phoneNo"));
                doctor.setAddress(rs.getString("address"));
                doctor.setUsername(rs.getString("username"));
                doctor.setField(rs.getString("Field"));

                lstCustomers.add(doctor);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstCustomers;
    }
}

