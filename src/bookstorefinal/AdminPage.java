
package bookstorefinal;

import java.sql.ResultSetMetaData;
import com.sun.jdi.connect.spi.Connection;
import java.awt.HeadlessException;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class AdminPage extends javax.swing.JFrame {

    public AdminPage() {
        initComponents();
          Connection con = null;
            Statement st = null;
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bookname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        authorname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bookquantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bookprice = new javax.swing.JTextField();
        AddBookBtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        displayinfobtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        booktable = new javax.swing.JTable();
        historybtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        historytable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome Admin !!!!!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 20, 420, 52);

        bookname.setBackground(java.awt.Color.lightGray);
        bookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknameActionPerformed(evt);
            }
        });
        getContentPane().add(bookname);
        bookname.setBounds(350, 360, 160, 30);

        jLabel2.setBackground(java.awt.Color.lightGray);
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BookName :");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 360, 150, 30);

        jLabel3.setBackground(java.awt.Color.lightGray);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("      Author :");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 400, 150, 30);

        authorname.setBackground(java.awt.Color.lightGray);
        getContentPane().add(authorname);
        authorname.setBounds(350, 400, 160, 30);

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("   Quantity :");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 440, 150, 30);

        bookquantity.setBackground(java.awt.Color.lightGray);
        getContentPane().add(bookquantity);
        bookquantity.setBounds(350, 440, 160, 30);

        jLabel5.setBackground(java.awt.Color.lightGray);
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("         Price :");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 480, 150, 30);

        bookprice.setBackground(java.awt.Color.lightGray);
        getContentPane().add(bookprice);
        bookprice.setBounds(350, 480, 160, 30);

        AddBookBtn.setBackground(java.awt.Color.orange);
        AddBookBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBookBtn.setForeground(new java.awt.Color(0, 0, 0));
        AddBookBtn.setText("Add Book");
        AddBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddBookBtn);
        AddBookBtn.setBounds(700, 330, 220, 50);

        updatebtn.setBackground(java.awt.Color.orange);
        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(0, 0, 0));
        updatebtn.setText("Update Book");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn);
        updatebtn.setBounds(700, 410, 220, 50);

        deletebtn.setBackground(java.awt.Color.orange);
        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(0, 0, 0));
        deletebtn.setText("Delete Book");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn);
        deletebtn.setBounds(700, 490, 220, 50);

        displayinfobtn.setBackground(java.awt.Color.orange);
        displayinfobtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        displayinfobtn.setForeground(new java.awt.Color(0, 0, 0));
        displayinfobtn.setText("Display Info");
        displayinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayinfobtnActionPerformed(evt);
            }
        });
        getContentPane().add(displayinfobtn);
        displayinfobtn.setBounds(280, 70, 137, 43);

        logoutbtn.setBackground(java.awt.Color.red);
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn);
        logoutbtn.setBounds(490, 600, 230, 32);

        booktable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        booktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookName", "Author", "Quantity", "Price"
            }
        ));
        booktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booktableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(booktable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(120, 120, 519, 190);

        historybtn.setBackground(java.awt.Color.orange);
        historybtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        historybtn.setForeground(new java.awt.Color(0, 0, 0));
        historybtn.setText("History of Customers!");
        historybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historybtnActionPerformed(evt);
            }
        });
        getContentPane().add(historybtn);
        historybtn.setBounds(890, 70, 230, 40);

        historytable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "BookName", "Author", "Quantity", "Price", "Amount"
            }
        ));
        historytable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historytable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(historytable1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(710, 120, 510, 190);

        jLabel6.setBackground(java.awt.Color.lightGray);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-170, 10, 1550, 1080);
        jLabel6.getAccessibleContext().setAccessibleDescription("");

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 300, 37, 16);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(337, 376, 80, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookBtnActionPerformed
        if(bookname.getText().equals("") || authorname.getText().equals("")
            || bookquantity.getText().equals("") || bookprice.getText().equals("") )
        {

            JOptionPane.showMessageDialog(this,"Please Enter All Data !") ;

        }
       
        else{
             String bName=bookname.getText();
            String author=authorname.getText();
            String quantity=bookquantity.getText();
            String price=bookprice.getText();
            try{
             Class. forName ("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8"); 

            PreparedStatement prepstmt = con.prepareStatement( "insert into bookshelf (Bookname, Author,available, Price) values (?, ?,?,?);");
                prepstmt.setString (1, bName);
                prepstmt. setString (2, author) ;
                prepstmt. setString (3, quantity);
                prepstmt. setString (4, price);
                prepstmt.execute () ;
            }

            catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
            } 
            JOptionPane. showMessageDialog (this, "Book has been added successfully!");

        }
        display();
    }//GEN-LAST:event_AddBookBtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
  
        String bName= bookname.getText();
        String author=authorname.getText();
        String available=bookquantity.getText();
        String price=bookprice.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");
        PreparedStatement pst = con.prepareStatement("update bookshelf set author=?,available=?,price=? where bookname=? ");
pst.setString(1, author);
pst.setString(2, available);
pst.setString(3, price);
pst.setString(4, bName);
pst.executeUpdate();

            JOptionPane. showMessageDialog (this, "update successfully!");
     
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
        }
   display();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed

        DefaultTableModel tblModel = (DefaultTableModel) booktable.getModel() ;
        String bName, author, available,price;

        try{
            Class. forName ("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");

        
                bName = tblModel.getValueAt (booktable.getSelectedRow(), 0) .toString () ;
                author = tblModel.getValueAt ( booktable.getSelectedRow(),1). toString () ;
                available = tblModel.getValueAt (booktable.getSelectedRow(), 2).toString () ;
                price = tblModel.getValueAt (booktable.getSelectedRow(), 3).toString () ;

                if(booktable.getSelectedRowCount()==1)
                {

                    String query = "delete from bookshelf where Bookname=? and Author=? and available =? and price =?";

                    PreparedStatement prepstmt = con.prepareStatement (query) ;
                    prepstmt.setString (1, bName);
                    prepstmt. setString (2, author) ;
                    prepstmt. setString (3, available);
                    prepstmt. setString (4, price);

                    prepstmt.execute ();

                    if(booktable.getRowCount() ==0) {
                        JOptionPane.showMessageDialog(this,"Table is Empty" );
                    }
                }
   
 }           catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane. showMessageDialog (this, "delete successfully!");
        tblModel.setRowCount (0) ;
   display();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void displayinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayinfobtnActionPerformed

        display();
    }//GEN-LAST:event_displayinfobtnActionPerformed

    public void display(){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");
          
            PreparedStatement pst = con.prepareStatement("select * from bookshelf;" );
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
          int n= rsmd.getColumnCount() ;

        DefaultTableModel dtm = (DefaultTableModel) booktable.getModel();
        dtm.setRowCount(0) ;

                while(rs.next()) {
                Vector v = new Vector() ;
                for (int i=1; i<=n ; i++ ){
                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(4));
                }
                dtm.addRow(v) ;
            }
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Are you sure?");

        if (a == JOptionPane.YES_OPTION) {
            dispose();
            Login obj = new Login();
          obj.setVisible(true);
        }
        else{
            AdminPage obj = new AdminPage();
         obj.setVisible(true);}
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void booktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booktableMouseClicked

        DefaultTableModel tb1Model = (DefaultTableModel) booktable.getModel ();
        String bname =tb1Model.getValueAt (booktable.getSelectedRow (), 0) .toString () ;
        String author = tb1Model.getValueAt (booktable.getSelectedRow (), 1) .toString () ;
        String available = tb1Model.getValueAt (booktable.getSelectedRow (), 2) .toString () ;
        String price = tb1Model.getValueAt (booktable.getSelectedRow (), 3) .toString () ;



        bookname.setText (bname) ;
        authorname.setText (author);
        bookquantity.setText (available) ;
        bookprice.setText (price) ;
        
        
        
    }//GEN-LAST:event_booktableMouseClicked

    private void historytable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historytable1MouseClicked

    }//GEN-LAST:event_historytable1MouseClicked

    private void historybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historybtnActionPerformed

  try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");
          
            PreparedStatement pst = con.prepareStatement("select * from history;" );
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
            int n= rsmd.getColumnCount() ;

            DefaultTableModel dtm = (DefaultTableModel) historytable1.getModel();
            dtm.setRowCount(0) ;

            while(rs.next()) {
                Vector v = new Vector() ;
                for (int i=1; i<=n ; i++ ){
                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(4));
                    v.add(rs.getString(5));
                    v.add(rs.getString(6));
                      }
                dtm.addRow(v) ;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_historybtnActionPerformed

    private void booknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknameActionPerformed

    }//GEN-LAST:event_booknameActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBookBtn;
    private javax.swing.JTextField authorname;
    private javax.swing.JTextField bookname;
    private javax.swing.JTextField bookprice;
    private javax.swing.JTextField bookquantity;
    private javax.swing.JTable booktable;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton displayinfobtn;
    private javax.swing.JButton historybtn;
    private javax.swing.JTable historytable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
