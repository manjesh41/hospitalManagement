
// import java.awt.LayoutManager;

// /**
//  *
//  * @author Omen
//  */
// public class APanel extends javax.swing.JFrame {

   
//     public APanel() {
//         initComponents();
//     }
 
//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//     private void initComponents() {

//         jpanelbg = new javax.swing.JPanel();
//         jlabelAdminPanel = new javax.swing.JLabel();
//         Dbutton = new javax.swing.JButton();
//         Abutton = new javax.swing.JButton();
//         Pbutton = new javax.swing.JButton();
//         backgroundJL = new javax.swing.JLabel();
//         BannerJ = new javax.swing.JLabel();
//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//         setTitle("Admin Panel");
//         setBackground(new java.awt.Color(255, 255, 255));

//         jpanelbg.setBackground(new java.awt.Color(255, 255, 255));
//         jpanelbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

//         jlabelAdminPanel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
//         jlabelAdminPanel.setText("Admin Panel");
//         jpanelbg.add(jlabelAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 220, 40));

//         Dbutton.setBackground(new java.awt.Color(0, 146, 255));
//         Dbutton.setText("Doctor");
//         Dbutton.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 DbuttonActionPerformed(evt);
//             }
//         });
//         jpanelbg.add(Dbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 180, 120));

//         Abutton.setBackground(new java.awt.Color(0, 146, 255));
//         Abutton.setText("Admin");
//         Abutton.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 AbuttonActionPerformed(evt);
//             }
//         });
//         jpanelbg.add(Abutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 180, 120));

//         Pbutton.setBackground(new java.awt.Color(0, 146, 255));
//         Pbutton.setText("Patient");
//         Pbutton.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 PbuttonActionPerformed(evt);
//             }
//         });
//         jpanelbg.add(Pbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 180, 120));

//         backgroundJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/optometrists/Background.jpg"))); // NOI18N
//         backgroundJL.setText("jLabel1");
//         jpanelbg.add(backgroundJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 630, 460));

//         BannerJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/optometrists/banner.jpg"))); // NOI18N
//         BannerJ.setText("jLabel1");
//         jpanelbg.add(BannerJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 240));

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addComponent(jpanelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addComponent(jpanelbg, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(0, 22, Short.MAX_VALUE))
//         );

//         pack();
//     }// </editor-fold>                        

//     private void AbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                        
//         // TODO add your handling code here:
//     }                                       

//     private void DbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                        
//         // TODO add your handling code here:
//     }                                       

//     private void PbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                        
//         // TODO add your handling code here:
//     }                                       

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//          */
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>

//         /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new APanel().setVisible(true);
//             }
//         });
//     }
    
//     // Variables declaration - do not modify                     
//     private javax.swing.JButton Abutton;
//     private javax.swing.JLabel BannerJ;
//     private javax.swing.JButton Dbutton;
//     private javax.swing.JButton Pbutton;
//     private javax.swing.JLabel backgroundJL;
//     private javax.swing.JLabel jlabelAdminPanel;
//     private javax.swing.JPanel jpanelbg;
//     // End of variables declaration                   
// }



        
