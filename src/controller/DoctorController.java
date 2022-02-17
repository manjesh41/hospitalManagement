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
                    "Field,username,,password) values(?,?,?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, doctor.getCustFname());
            st.setString(2, doctor.getCustLname());
            st.setString(4, doctor.getPhoneNo());
            st.setString(5, doctor.getAddress());
            st.setString(7, doctor.getField());
            st.setString(6, doctor.getUsername());
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
       query= "insert into doctor(custFname, custLname,address, phoneNo,Field,username, password) values('"+
            doctor.getCustFname()+"','"+
            doctor.getCustLname()+"','"+
            doctor.getAddress()+"','"+
            doctor.getPhoneNo()+"','"+
            doctor.getField()+"','"+
            doctor.getUsername()+"','"+
            doctor.getPassword()+"');";
       
       db = new DoctorConnection();
       return db.maniulatedoctor(query);
    }

    //Login Customer
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
    
    public List<Doctor> searchlList(String username) {
        String query;
        query = "select * from doctor where custFname='"+username+"';";
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
    //delete doctor
    public void deleteDoctor(String username) {
        String query;
        query = "delete from doctor where custId = "+ Integer.valueOf(username) +";";
        db = new DoctorConnection();
        db.maniulatedoctor(query);
    }
    //update doctor
    public List<Doctor> updatDoctors(String username) {
        String query;
        query = "update * from doctor where custFname='"+username+"';";
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
 //to get the details of the customers
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
    //for the admin panel
    public List<Doctor> aDoctors() {
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
                doctor.setPassword(rs.getString("password"));

                lstCustomers.add(doctor);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstCustomers;
    }
    //for neurologist
    public List<Doctor> neurList() {
        String query;
        query = "select * from doctor where Field = 'Neurotherapist'";
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
    // gyno doctor
    public List<Doctor> gynList() {
        String query;
        query = "select * from doctor where Field = 'Gynecologist'";
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
    // for optometrist doctor
    public List<Doctor> optoList() {
        String query;
        query = "select * from doctor where Field = 'Optometrist'";
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
    //for paediaterian doctor
    public List<Doctor> paediatList() {
        String query;
        query = "select * from doctor where Field = 'Paediatrician'";
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
    // for dermatologist doctor
    public List<Doctor> dermatologiList() {
        String query;
        query = "select * from doctor where Field = 'Dermatologist'";
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

