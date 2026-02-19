
package bookstorefinal;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        upass = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        uphone = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        signbttn = new javax.swing.JButton();
        uemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1550, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CUSTOMER SIGNUP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 370, 40));

        uname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        uname.setForeground(new java.awt.Color(0, 0, 0));
        uname.setText("Username:");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 250, 40));

        upass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        upass.setForeground(new java.awt.Color(0, 0, 0));
        upass.setText("Password:");
        getContentPane().add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 250, 40));

        uphone.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        uphone.setForeground(new java.awt.Color(0, 0, 0));
        uphone.setText("Phone No:");
        getContentPane().add(uphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 332, 250, 40));

        signbttn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        signbttn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signbttn.setForeground(new java.awt.Color(0, 0, 0));
        signbttn.setText("Sign Up");
        signbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signbttnActionPerformed(evt);
            }
        });
        getContentPane().add(signbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 180, 60));

        uemail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        uemail.setForeground(new java.awt.Color(0, 0, 0));
        uemail.setText("Email :");
        getContentPane().add(uemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 90, -1));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 270, 250, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signbttnActionPerformed
     
                
           if(txtuname.getText().equals("") || txtpass.getText().equals("")
            || txtemail.getText().equals("") || txtphone.getText().equals("") )
        {

            JOptionPane.showMessageDialog(this,"Please Enter All Data !") ;

        }
        else{

            String name=txtuname.getText();
            String password=txtpass.getText();
            String email=txtemail.getText();
            String phone=txtphone.getText();
            try{
       Class. forName ("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");; 

             

PreparedStatement prepstmt = con.prepareStatement( "insert into customer (username, password,email, phonenumber) values (?, ?,?,?);");

                prepstmt.setString (1, name);
                prepstmt. setString (2, password) ;
                prepstmt. setString (3, email);
                prepstmt. setString (4, phone);
                prepstmt.execute () ;
                            JOptionPane.showMessageDialog(this,"Registration Done !") ;
                            
                                 new Login().setVisible(true);
                     dispose();     
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        
        
        
        
           }
        
    }//GEN-LAST:event_signbttnActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton signbttn;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtuname;
    private javax.swing.JLabel uemail;
    private javax.swing.JLabel uname;
    private javax.swing.JLabel upass;
    private javax.swing.JLabel uphone;
    // End of variables declaration//GEN-END:variables
}
