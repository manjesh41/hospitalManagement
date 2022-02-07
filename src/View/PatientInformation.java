
package View;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import controller.CustomerController;
import model.Customer;

import java.awt.*;

import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
*
* @author NoOne
*/
public class PatientInformation extends javax.swing.JFrame {

   /**
    * Creates new form PatientInformation
    */
   public PatientInformation() {
       initComponents();
   }
   
   Object[] columns = { "First name", "Last Name", "Phone", "Address" };
   String data[][];
   JTable table;
   DefaultTableModel model;


   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       jPanel3 = new javax.swing.JPanel();
       jPanel4 = new javax.swing.JPanel();
       jLabel1 = new javax.swing.JLabel();
       BackBtn = new javax.swing.JButton();
       jLabel2 = new javax.swing.JLabel();
       jScrollPane1 = new javax.swing.JScrollPane();
       jTable1 = new javax.swing.JTable();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       setTitle("Patient Information");

       jPanel3.setBackground(new java.awt.Color(102, 153, 255));

       jPanel4.setBackground(new java.awt.Color(0, 153, 0));
       jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));

       jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
       jLabel1.setForeground(new java.awt.Color(255, 255, 255));
       jLabel1.setText("Patient Information");

       BackBtn.setBackground(new java.awt.Color(204, 0, 0));
       BackBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
       BackBtn.setText("<-");
       BackBtn.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               BackBtnActionPerformed(evt);
           }
       });

       jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
       jLabel2.setText("Swastha Sewa");
       fillArray();
       table = new JTable(model);

        table.setFont(new Font("Serif", Font.ITALIC, 16));
        table.setSelectionBackground(Color.green);
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 16));
       javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
       jPanel4.setLayout(jPanel4Layout);
       jPanel4Layout.setHorizontalGroup(
           jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
               .addGap(28, 28, 28)
               .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
               .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(55, 55, 55)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(22, 22, 22))
       );
       jPanel4Layout.setVerticalGroup(
           jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel4Layout.createSequentialGroup()
               .addContainerGap()
               .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                   .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(23, 23, 23))
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap())
       );
       jTable1.setBackground(new java.awt.Color(0, 153, 204));
       jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
       jTable1.setForeground(new java.awt.Color(0, 0, 255));
       jTable1.setModel(model);
       jScrollPane1.setViewportView(jTable1);

       javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
       jPanel3.setLayout(jPanel3Layout);
       jPanel3Layout.setHorizontalGroup(
           jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           .addComponent(jScrollPane1)
       );
       jPanel3Layout.setVerticalGroup(
           jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel3Layout.createSequentialGroup()
               .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
       );

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(0, 0, Short.MAX_VALUE))
       );

    //    jPanel3.add(new JScrollPane(table), BorderLayout.CENTER);
       pack();
   }// </editor-fold>                        

     
   private void fillArray() {
    CustomerController controller = new CustomerController();
    List<Customer> lstCustomer = controller.getAllCustomers();
    
    data = new String[lstCustomer.size()][4];

    for (int i = 0; i < lstCustomer.size(); i++) {
        data[i][0] = lstCustomer.get(i).getCustFname();
        data[i][1] = lstCustomer.get(i).getCustLname();
        data[i][2] = lstCustomer.get(i).getPhoneNo();
        data[i][3] = lstCustomer.get(i).getAddress();
    }
    model = new DefaultTableModel(data, columns);

}
   private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
       // TODO add your handling code here:
       new DoctorPanel().setVisible(true);
               dispose();
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
           java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new PatientInformation().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JButton BackBtn;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   // End of variables declaration                   
}