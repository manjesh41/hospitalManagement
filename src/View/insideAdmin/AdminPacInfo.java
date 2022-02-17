package View.insideAdmin;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.CustomerController;
import model.Customer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NoOne
 */
public class AdminPacInfo extends javax.swing.JFrame {

    /**
     * Creates new form PatientAppointment
     */
    public AdminPacInfo() {
        initComponents();
        setResizable(false);
    }
    Object[] columns = {"First name", "Last Name","Address", "Email", "Contact","password", "ID" };
   String data[][];
   JTable table;
   DefaultTableModel model;
    String selectionId;
    int selectionIndex;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        appLbl = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        acceptAndDeletPanel = new javax.swing.JPanel();
        //AcceptBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        appointmentInfoPanel = new javax.swing.JPanel();
        VerticalScroll = new javax.swing.JScrollBar();
        verticalScrollbar = new javax.swing.JScrollBar();
        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        JTable jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patients Details ");

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        appLbl.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        appLbl.setText("Patient's Information");

        BackBtn.setBackground(new java.awt.Color(255, 0, 0));
        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackBtn.setText("<-");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        fillArray();
        jTable1.setBackground(new java.awt.Color(0, 153, 204));
       jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
       jTable1.setForeground(new java.awt.Color(0, 0, 255));
       jTable1.setModel(model);
        //    jTable1.remove(index);
       jTable1.addMouseListener(new MouseListener(){

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            selectionId = data[jTable1.getSelectedRows()[0]][6];
            selectionIndex = jTable1.getSelectedRows()[0];
            // ;
            // System.out.println(selectionId);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
        
        
           
       });
       jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Swastha Sewa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(appLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(appLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        acceptAndDeletPanel.setBackground(new java.awt.Color(102, 255, 102));
        acceptAndDeletPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));

        // AcceptBtn.setBackground(new java.awt.Color(0, 0, 255));
        // AcceptBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        // AcceptBtn.setText("UPDATE");
        // AcceptBtn.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         AcceptBtnActionPerformed(evt);
        //     }
        // });

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DeleteBtn.setText("Remove");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // if(selectionIndex!=null)
                // jTable1.convertRowIndexToModel(selectionIndex);
                // DeleteBtnActionPerformed(evt);
                
                CustomerController controller = new CustomerController();
                 controller.dCustomers(selectionId);
                ((DefaultTableModel)jTable1.getModel()).removeRow(selectionIndex);
            }
        });

        javax.swing.GroupLayout acceptAndDeletPanelLayout = new javax.swing.GroupLayout(acceptAndDeletPanel);
        acceptAndDeletPanel.setLayout(acceptAndDeletPanelLayout);
        acceptAndDeletPanelLayout.setHorizontalGroup(
            acceptAndDeletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptAndDeletPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acceptAndDeletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              //      .addComponent(AcceptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        acceptAndDeletPanelLayout.setVerticalGroup(
            acceptAndDeletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptAndDeletPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                //.addComponent(AcceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        appointmentInfoPanel.setBackground(new java.awt.Color(153, 0, 153));

        verticalScrollbar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

        javax.swing.GroupLayout appointmentInfoPanelLayout = new javax.swing.GroupLayout(appointmentInfoPanel);
        appointmentInfoPanel.setLayout(appointmentInfoPanelLayout);
        appointmentInfoPanelLayout.setHorizontalGroup(
            appointmentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appointmentInfoPanelLayout.createSequentialGroup()
                .addComponent(verticalScrollbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerticalScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1));
        appointmentInfoPanelLayout.setVerticalGroup(
            appointmentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VerticalScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(appointmentInfoPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(verticalScrollbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(appointmentInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acceptAndDeletPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceptAndDeletPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                       
    private void fillArray() {
        CustomerController controller = new CustomerController();
        List<Customer> lstCustomer = controller.getAllACustomers();
        
        data = new String[lstCustomer.size()][7];
    
        for (int i = 0; i < lstCustomer.size(); i++) {
            data[i][0] = lstCustomer.get(i).getCustFname();
            data[i][1] = lstCustomer.get(i).getCustLname();
            data[i][2] = lstCustomer.get(i).getPhoneNo();
            data[i][3] = lstCustomer.get(i).getAddress();
            data[i][4] = lstCustomer.get(i).getUsername();
            data[i][5] = lstCustomer.get(i).getPassword();
            data[i][6] = lstCustomer.get(i).getCustIdString();
            
        }
        model = new DefaultTableModel(data, columns);
    
    } 

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        new AdminPanel().setVisible(true);
        dispose();
    }                                       

    private void AcceptBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        new Update().setVisible(true);
        dispose();
    }                                         

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPacInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPacInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPacInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPacInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPacInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    //private javax.swing.JButton AcceptBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JScrollBar VerticalScroll;
    private javax.swing.JPanel acceptAndDeletPanel;
    private javax.swing.JLabel appLbl;
    private javax.swing.JPanel appointmentInfoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar verticalScrollbar;
    // End of variables declaration                   
}
