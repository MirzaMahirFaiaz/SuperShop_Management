/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shekorshop_management;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP
 */
public class AdminCtrlUser extends javax.swing.JFrame {

    /**
     * Creates new form AdminCtrlUser
     */
    public AdminCtrlUser() {
        initComponents();
        connectDB();
        ViewData();
    }
    
     public Connection connection;
    
    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Super_Shop;selectMethod=cursor", "sa", "123456");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void ViewData(){
        
        try {
            String query = "SELECT * FROM Users";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            String utype,uname,pass;
           
            DefaultTableModel model = (DefaultTableModel)jTableUser.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                
                uname = rs.getString("UserName");
                utype = rs.getString("UserType");
                pass = rs.getString("Pass_word");
            
                
                
                
                Object[] col = new Object[5];
                
                col[0] = uname;
                col[1] = utype;
                col[2] = pass;
                
                
            
                model.addRow(col);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminCtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
        void Update(){
            String username = jTextFieldUserName.getText();
            String pass = jPasswordField.getText();
            int index = jComboBoxUserType.getSelectedIndex();

            String user_type;
            if(index == 0){
                user_type = "admin";
            }
            else {
                user_type = "seller";
            }
            
            
        try {
            
                      String sql;
           sql = "UPDATE Users Set Pass_word= (?), UserType=(?) Where UserName=(?)";
            
        PreparedStatement ps = connection.prepareStatement(sql);
            
        
        ps.setString(1, pass);
        ps.setString(2, user_type);
        ps.setString(3, username);
             
        ps.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Info Updated ... ", "Update Info", JOptionPane.INFORMATION_MESSAGE);
        
                jTextFieldUserName.setText(""); 
                jComboBoxUserType.setSelectedIndex(0);
                jPasswordField.setText("");
                jTextFieldUserName.setEditable(true);
        
       
    }
    catch (SQLException ex) {
            //Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Something went Wrong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxUserType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        LogIn = new javax.swing.JButton();
        LogIn1 = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        LogIn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setText("Stocks");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setText("Users");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel3.setText("Supplier");

        jTableUser.setFont(new java.awt.Font("Segoe UI Emoji", 0, 17)); // NOI18N
        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "User Type", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUser);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel4.setText("User Type:");

        jComboBoxUserType.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jComboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller" }));
        jComboBoxUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUserTypeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel5.setText("Username:");

        jTextFieldUserName.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel6.setText("Password:");

        jPasswordField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        LogIn.setBackground(new java.awt.Color(0, 44, 62));
        LogIn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        LogIn.setForeground(new java.awt.Color(255, 255, 255));
        LogIn.setText("LogIn");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        LogIn1.setBackground(new java.awt.Color(0, 44, 62));
        LogIn1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        LogIn1.setForeground(new java.awt.Color(255, 255, 255));
        LogIn1.setText("ADD");
        LogIn1.setPreferredSize(new java.awt.Dimension(103, 29));
        LogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn1ActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(0, 44, 62));
        Update.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        LogIn3.setBackground(new java.awt.Color(0, 44, 62));
        LogIn3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        LogIn3.setForeground(new java.awt.Color(255, 255, 255));
        LogIn3.setText("DELETE");
        LogIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Update)
                        .addGap(32, 32, 32)
                        .addComponent(LogIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187)
                .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUserTypeActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        try {
            String username = jTextFieldUserName.getText();
            String pass = jPasswordField.getText();
            int index = jComboBoxUserType.getSelectedIndex();

            String user_type;

            if(index == 0){
                user_type = "admin";
            }
            else {
                user_type = "seller";
            }

            String sql = "SELECT * FROM Users WHERE USERNAME ='"+username+"'";

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            rs.next();

            String conpass = rs.getString("PASS_WORD");
            String con_user_type = rs.getString("UserType");

            if( conpass.equals(pass) && con_user_type.equals(user_type) ){
                JOptionPane.showMessageDialog(null, "Log In Successful.", "Info", JOptionPane.INFORMATION_MESSAGE);
                if("admin".equals(user_type)){
                    dispose();
                    new AdminCtrlUser().setVisible(true);
                }
                else{
                    dispose();
                    new UserFirstPage().setVisible(true);

                }
            }
            else
            JOptionPane.showMessageDialog(null, "Invalid Username/Password/User Type ...", "Error", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Log In Failed", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInActionPerformed

    private void jTableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUserMouseClicked
      DefaultTableModel tblModel = (DefaultTableModel)jTableUser.getModel();
            String uname= tblModel.getValueAt(jTableUser.getSelectedRow(),0).toString();
            
            String utype= tblModel.getValueAt(jTableUser.getSelectedRow(),1).toString();
            String pass= tblModel.getValueAt(jTableUser.getSelectedRow(),2).toString();
            

              jTextFieldUserName.setText(uname);
              if("admin".equals("utype")){
              jComboBoxUserType.setSelectedIndex(1);
              }
              else{
                  jComboBoxUserType.setSelectedIndex(0);
              }
                jPasswordField.setText(pass);
                jTextFieldUserName.setEditable(false);
             
   
    }//GEN-LAST:event_jTableUserMouseClicked

    private void LogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn1ActionPerformed
        try {
            String username = jTextFieldUserName.getText();
            String pass = jPasswordField.getText();
            int index = jComboBoxUserType.getSelectedIndex();

            String user_type;

            if(index == 0){
                user_type = "admin";
            }
            else {
                user_type = "seller";
            }

            String sql = "SELECT * FROM Users WHERE USERNAME ='"+username+"'";

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            rs.next();

            String conpass = rs.getString("PASS_WORD");
            String con_user_type = rs.getString("UserType");

            if( conpass.equals(pass) && con_user_type.equals(user_type) ){
                JOptionPane.showMessageDialog(null, "Log In Successful.", "Info", JOptionPane.INFORMATION_MESSAGE);
                if("admin".equals(user_type)){
                    dispose();
                    new AdminCtrlUser().setVisible(true);
                }
                else{
                    dispose();
                    new UserFirstPage().setVisible(true);

                }
            }
            else
            JOptionPane.showMessageDialog(null, "Invalid Username/Password/User Type ...", "Error", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Log In Failed", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LogIn1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
      Update();
      ViewData();
// TODO add your handling code here:
    }//GEN-LAST:event_UpdateActionPerformed

    private void LogIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogIn3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminCtrlUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCtrlUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCtrlUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCtrlUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCtrlUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JButton LogIn1;
    private javax.swing.JButton LogIn3;
    private javax.swing.JButton Update;
    private javax.swing.JComboBox<String> jComboBoxUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUser;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}