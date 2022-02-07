package View.view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controller.DoctorController;
import model.Doctor;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
public class dermato extends JFrame implements ActionListener {
    Object[] columns = { "First name", "Last Name", "Phone", "Address","Field" };
    String data[][];
    JTable table;
    DefaultTableModel model;
    public dermato(Doctor doctor) {
        fillArray();
        setTitle("Doctor Details");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JLabel lblUsername = new JLabel("Welcome " + doctor.getCustFname() +
                " " + doctor.getCustLname());
        lblUsername.setFont(new Font("Arial", Font.BOLD, 20));
        lblUsername.setHorizontalAlignment(JLabel.CENTER);
        // Bind model to JTable
        table = new JTable(model);
        table.setFont(new Font("Serif", Font.ITALIC, 16));
        table.setSelectionBackground(Color.green);
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 16));
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(lblUsername, BorderLayout.NORTH);
        setVisible(true);
    }
    public dermato() {
    }

    private void fillArray() {
        DoctorController controller = new DoctorController();
        List<Doctor> lstCustomer = controller.dermatologiList();
        
        data = new String[lstCustomer.size()][5];

        for (int i = 0; i < lstCustomer.size(); i++) {
            data[i][0] = lstCustomer.get(i).getCustFname();
            data[i][1] = lstCustomer.get(i).getCustLname();
            data[i][2] = lstCustomer.get(i).getPhoneNo();
            data[i][3] = lstCustomer.get(i).getAddress();
            data[i][4] = lstCustomer.get(i).getField();
        }
        model = new DefaultTableModel(data, columns);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
