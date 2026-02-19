
package bookstorefinal;


import java.sql.ResultSetMetaData;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class CustomerPage extends javax.swing.JFrame {

  
    public CustomerPage() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayBooks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        booktable1 = new javax.swing.JTable();
        txtbname = new javax.swing.JTextField();
        txtaname = new javax.swing.JTextField();
        txtpname = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpaid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        historybttn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        historytable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        txtquan1 = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        hname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1550, 1080));
        getContentPane().setLayout(null);

        displayBooks.setBackground(java.awt.Color.orange);
        displayBooks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        displayBooks.setForeground(new java.awt.Color(0, 0, 0));
        displayBooks.setText("Check Available Books");
        displayBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBooksActionPerformed(evt);
            }
        });
        getContentPane().add(displayBooks);
        displayBooks.setBounds(160, 30, 222, 42);

        booktable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "bookname", "author", "Quantity", "price"
            }
        ));
        booktable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booktable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booktable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 100, 390, 124);

        txtbname.setBackground(java.awt.Color.lightGray);
        txtbname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbnameActionPerformed(evt);
            }
        });
        txtbname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbnameKeyPressed(evt);
            }
        });
        getContentPane().add(txtbname);
        txtbname.setBounds(111, 360, 80, 22);

        txtaname.setBackground(java.awt.Color.lightGray);
        getContentPane().add(txtaname);
        txtaname.setBounds(210, 360, 71, 22);

        txtpname.setBackground(java.awt.Color.lightGray);
        getContentPane().add(txtpname);
        txtpname.setBounds(380, 360, 71, 22);

        txtamount.setBackground(java.awt.Color.lightGray);
        getContentPane().add(txtamount);
        txtamount.setBounds(470, 360, 71, 22);

        jLabel3.setBackground(java.awt.Color.lightGray);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BookName");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 330, 80, 20);

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" Author");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 330, 70, 20);

        jLabel5.setBackground(java.awt.Color.lightGray);
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText(" Quantity");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 330, 70, 20);

        jLabel6.setBackground(java.awt.Color.lightGray);
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("   Price");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 330, 70, 20);

        jLabel7.setBackground(java.awt.Color.lightGray);
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(" Amount");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 330, 70, 20);
        getContentPane().add(txttotal);
        txttotal.setBounds(650, 420, 90, 30);

        jLabel8.setBackground(java.awt.Color.lightGray);
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total Bill ");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(570, 420, 70, 29);

        jLabel9.setBackground(java.awt.Color.lightGray);
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("    Paid");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(570, 460, 70, 30);
        getContentPane().add(txtpaid);
        txtpaid.setBounds(650, 460, 90, 30);

        jLabel10.setBackground(java.awt.Color.lightGray);
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("  Balance");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(570, 500, 70, 30);
        getContentPane().add(txtbal);
        txtbal.setBounds(650, 500, 90, 30);

        jButton2.setBackground(java.awt.Color.orange);
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 550, 130, 32);

        jButton1.setBackground(java.awt.Color.orange);
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Add to Cart");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 370, 150, 32);

        historybttn.setBackground(java.awt.Color.orange);
        historybttn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        historybttn.setForeground(new java.awt.Color(0, 0, 0));
        historybttn.setText("Check History");
        historybttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historybttnActionPerformed(evt);
            }
        });
        getContentPane().add(historybttn);
        historybttn.setBounds(700, 20, 210, 40);

        historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "BookName", "Author", "Quantity", "Price", "Amount"
            }
        ));
        historytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historytableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(historytable);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(600, 70, 577, 130);

        jLabel11.setBackground(java.awt.Color.lightGray);
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("       Total Bill");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(890, 230, 210, 22);

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane4.setViewportView(txtbill);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(820, 280, 330, 350);

        jButton3.setBackground(java.awt.Color.red);
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LOGOUT");
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(140, 577, 280, 40);

        txtquan1.setBackground(java.awt.Color.lightGray);
        txtquan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquan1ActionPerformed(evt);
            }
        });
        txtquan1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtquan1KeyPressed(evt);
            }
        });
        getContentPane().add(txtquan1);
        txtquan1.setBounds(290, 360, 71, 22);

        username.setBackground(java.awt.Color.lightGray);
        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setText("UserName");
        username.setOpaque(true);
        getContentPane().add(username);
        username.setBounds(20, 330, 80, 20);

        txtuname.setBackground(java.awt.Color.lightGray);
        getContentPane().add(txtuname);
        txtuname.setBounds(20, 360, 80, 22);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "BookName", "Author", "Quantity", "Price", "Amount"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable2);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(20, 400, 529, 160);

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("History of :");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(970, 30, 100, 25);

        hname.setBackground(java.awt.Color.lightGray);
        getContentPane().add(hname);
        hname.setBounds(1080, 30, 90, 22);

        jLabel2.setBackground(java.awt.Color.lightGray);
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -320, 1580, 1040);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBooksActionPerformed

    txtuname.setText(Login.uname.getText());
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");
            
            PreparedStatement pst = con.prepareStatement("select * from bookshelf;" );
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
            int n= rsmd.getColumnCount() ;

            DefaultTableModel dtm = (DefaultTableModel) booktable1.getModel();
             dtm.setRowCount(0) ;

            while(rs.next()) {
                Vector v = new Vector() ;
                for (int K=1; K<=n ; K++ ){

                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    v.add(rs.getString(4));
                       }
                dtm.addRow(v) ;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_displayBooksActionPerformed

    private void txtbnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbnameKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            String bname = txtbname.getText();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");
              
                PreparedStatement pst = con.prepareStatement("select * from bookshelf where bookname=?");
                  pst.setString(1, bname);

                ResultSet rs = pst.executeQuery();

                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this, "Please Select Proper Book Name");
                }
                else {
                    String bookname = rs.getString("bookname");
                    String Author = rs.getString("Author");
                    String available = rs.getString("available");
                    String Price = rs.getString("Price");

                    txtaname.setText(Author.trim());
                    txtpname.setText(Price.trim());

                }

            }
            catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_txtbnameKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
         if(Integer.parseInt(txttotal.getText())>Integer.parseInt( txtpaid.getText())){
        
    JOptionPane.showMessageDialog(this, "Not Enough Money");
    txtbal.setText(" ");
    }
    else{
            Balance();
        bill();
         
         }
         
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       
            
            
    
        if(txtuname.getText().equals("") || txtbname.getText().equals("") )
        {

            JOptionPane.showMessageDialog(this,"Please Enter All Data !") ;

        }
     
        else{    
         String uname=txtuname.getText();
            String bname=txtbname.getText();
             String author=txtaname.getText();
            String quantity=txtquan1.getText();
            String price=txtpname.getText();
            String amount=txtamount.getText();
            
            try{
       Class. forName ("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");; 

             

            PreparedStatement prep = con.prepareStatement( "insert into history (username , bookname, author,quantity, price, amount) values (?, ?,?,?,?,?);");
                 prep.setString (1, uname);
                prep.setString (2, bname);
                prep. setString (3, author) ;
                prep. setString (4, quantity);
                prep. setString (5, price);
                prep. setString (6, amount);
                prep.executeUpdate () ;
              
     PreparedStatement prep1 = con.prepareStatement  ("update bookshelf set available = available - ? where bookname= ?");
                  prep1.setString (1, quantity);
                  prep1.setString (2, bname);
                 prep1.executeUpdate () ;
           }

            catch (ClassNotFoundException ex) {
                Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
            } 
         }
               
           
          DefaultTableModel model = new DefaultTableModel ();
             model = (DefaultTableModel) jTable2.getModel() ;

                     model.addRow (new Object []
            {
             txtuname.getText () ,
                txtbname.getText () ,
                txtaname. getText () ,
                txtquan1.getText(),
                txtpname.getText () ,
                txtamount.getText () ,

            } );

            int sum = 0;
            for (int j = 0; j<jTable2.getRowCount () ; j++)
            {
                sum = sum + Integer.parseInt (jTable2.getValueAt (j, 5) . toString () );
            }

            txttotal.setText (Integer. toString (sum)) ;
            
            txtuname.setText (" ");
            txtbname.setText("");
            txtaname.setText("");
            txtquan1.setText("");
            txtamount.setText("");
            txtpname.setText("");
            txtbname.requestFocus(); 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void historybttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historybttnActionPerformed
       
hname.setText(Login.uname.getText());
   try {

         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","ict8");
           
         PreparedStatement pst = con.prepareStatement("select * from history where username = ?;" );
            pst.setString(1, hname.getText());
           ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
            int n= rsmd.getColumnCount() ;

            DefaultTableModel dtm = (DefaultTableModel) historytable.getModel();
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

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }//GEN-LAST:event_historybttnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        int a = JOptionPane.showConfirmDialog(this, "Are you sure?");

        if (a == JOptionPane.YES_OPTION) {
            dispose();
            Login obj = new Login();
            obj.setTitle("Customer-Login");
            obj.setVisible(true);
        }
        else{
            CustomerPage obj = new CustomerPage();

            obj.setTitle("Customer-Login");
            obj.setVisible(true);}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void historytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historytableMouseClicked

    }//GEN-LAST:event_historytableMouseClicked

    private void txtquan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquan1ActionPerformed
   
    }//GEN-LAST:event_txtquan1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
  
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtbnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbnameActionPerformed

    }//GEN-LAST:event_txtbnameActionPerformed

    private void txtquan1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquan1KeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER) { 
   
        int qty = Integer.parseInt (txtquan1.getText()) ;
        int Price = Integer.parseInt(txtpname.getText()) ;

        int tot =qty * Price;

        txtamount.setText(String.valueOf(tot));
          
         
         }else{}

    }//GEN-LAST:event_txtquan1KeyPressed

    
  
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked


    }//GEN-LAST:event_jTable2MouseClicked
  int quan;
    private void booktable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booktable1MouseClicked
    DefaultTableModel model1  = (DefaultTableModel) booktable1.getModel ();
  
        String bname = model1.getValueAt(booktable1.getSelectedRow (),0).toString();
       String author = model1.getValueAt(booktable1.getSelectedRow (),1).toString();
       String price = model1.getValueAt(booktable1.getSelectedRow (),3).toString();
        //String quantityt = model1.getValueAt(booktable1.getSelectedRow (), 3).toString();
    
    
    
    
    
         quan = Integer.parseInt(  model1.getValueAt(booktable1.getSelectedRow (),2).toString()   );   
    }//GEN-LAST:event_booktable1MouseClicked

 public void Balance(){
    
   
     int total = Integer.parseInt (txttotal.getText()) ;
           int paid = Integer.parseInt(txtpaid.getText()) ;

            int bal =paid-total;
          txtbal.setText(String.valueOf(bal));
   
    }
 
 public void bill (){
  

txtbill.setText("             SSS Book Shop \n");
            txtbill.setText(txtbill.getText() + "\t    Pallabi   \n");
            txtbill.setText(txtbill.getText() + "\tDhaka, Bangladesh \n");
                  txtbill.setText(txtbill.getText() + "----------------------------------------------------------------\n");
            txtbill.setText(txtbill.getText() + " Bookname \tQuantity \tPrice \n");
            txtbill.setText(txtbill.getText() + "----------------------------------------------------------------\n");          
        
            DefaultTableModel df = (DefaultTableModel) jTable2.getModel();
            for (int i = 0; i < jTable2.getRowCount(); i++) {                
                String name = df.getValueAt(i, 1).toString();
                String qt = df.getValueAt(i, 3).toString();
                String prc = df.getValueAt(i, 4).toString();                
                txtbill.setText(txtbill.getText() + name+"\t"+qt+"\t"+prc+" \n");                
            }
            txtbill.setText(txtbill.getText() + "----------------------------------------------------------------\n");
            txtbill.setText(txtbill.getText() + "SubTotal :\t"+txttotal.getText()+"\n");
            txtbill.setText(txtbill.getText() + "Cash :\t"+txtpaid.getText()+"\n");
            txtbill.setText(txtbill.getText() + "Balance :\t"+txtbal.getText()+"\n");
           txtbill.setText(txtbill.getText() + "====================================\n");
           txtbill.setText(txtbill.getText() +"                     Thank you "+"\n");
           txtbill.setText(txtbill.getText() + "----------------------------------------------------------------\n");
                     
      
        try {
            txtbill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    

}

 
    public static void main(String args[]) {
    
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booktable1;
    private javax.swing.JButton displayBooks;
    private javax.swing.JButton historybttn;
    private javax.swing.JTable historytable;
    private javax.swing.JTextField hname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtaname;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtpaid;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtquan1;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtuname;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
