/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shekorshop_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;

/**
 *
 * @author HP
 */
public class Admin_Stocks extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Stocks
     */
    public Admin_Stocks() {
        initComponents();
        connectDB();
        
        String chalan_date = LocalDate.now().toString();
        //System.out.println(chalan_date);
                
        try {
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse( chalan_date );
            jDateChooserChalanDate.setDate(date);
            
        } catch (ParseException ex) {
            Logger.getLogger(Admin_Stocks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSupplierPhone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jButtonSearchProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduct = new javax.swing.JTable();
        jButtonSearchSupplier = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSupplier = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonAddChalan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPName = new javax.swing.JTextField();
        jTextFieldPID = new javax.swing.JTextField();
        jTextFieldP_Quantity = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        textFieldPDetails = new java.awt.TextField();
        jComboBoxCategory = new javax.swing.JComboBox<>();
        jTextFieldBuying_UnitPrice = new javax.swing.JTextField();
        jTextFieldSelling_UnitPrice = new javax.swing.JTextField();
        jDateChooserChalanDate = new com.toedter.calendar.JDateChooser();
        jDateChooserExpDate = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1180, 651));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel1.setText("Supplier's Phone :");

        jTextFieldSupplierPhone.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel2.setText("Product Name :");

        jTextFieldProductName.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jTextFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductNameActionPerformed(evt);
            }
        });

        jButtonSearchProduct.setBackground(new java.awt.Color(0, 44, 62));
        jButtonSearchProduct.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButtonSearchProduct.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearchProduct.setText("Search");
        jButtonSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchProductActionPerformed(evt);
            }
        });

        jTableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProduct);

        jButtonSearchSupplier.setBackground(new java.awt.Color(0, 44, 62));
        jButtonSearchSupplier.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButtonSearchSupplier.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearchSupplier.setText("Search");
        jButtonSearchSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchSupplierActionPerformed(evt);
            }
        });

        jTableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier's Name", "Supplier's Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableSupplier);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButtonSearchSupplier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButtonSearchProduct)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSearchSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSearchProduct)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel5.setText("Product Name :");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel6.setText("Product ID :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel4.setText("Product Details :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setText("Category :");

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel8.setText("Quantity :");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setText("Exp. Date :");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel10.setText("Supplier's Phone :");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel11.setText("Buying Price Per Unit :");

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel12.setText("Selling Price Per Unit :");

        jButtonAddChalan.setBackground(new java.awt.Color(0, 44, 62));
        jButtonAddChalan.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButtonAddChalan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddChalan.setText("Add Chalan to the Stock");
        jButtonAddChalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddChalanActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel7.setText("Date :");

        jTextFieldPName.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jTextFieldPID.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jTextFieldP_Quantity.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jTextFieldPhone.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        textFieldPDetails.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jComboBoxCategory.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextFieldBuying_UnitPrice.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jTextFieldSelling_UnitPrice.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 44, 62));
        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(0, 44, 62));
        jButtonClear.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear Data");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldPDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldP_Quantity)
                                    .addComponent(jTextFieldPName)
                                    .addComponent(jDateChooserExpDate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooserChalanDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextFieldBuying_UnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSelling_UnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAddChalan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserChalanDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(textFieldPDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBuying_UnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldP_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jDateChooserExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSelling_UnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonAddChalan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddChalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddChalanActionPerformed
        
        String pn = jTextFieldPName.getText();
        String pid =  jTextFieldPID.getText();
        String p_details = textFieldPDetails.getText();
        String s_phone = jTextFieldPhone.getText();
        String quantity = jTextFieldP_Quantity.getText();
        String category = (String) jComboBoxCategory.getSelectedItem();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String exp_date =  sdf.format(jDateChooserExpDate.getDate());
        String chalan_date =  sdf.format(jDateChooserChalanDate.getDate());
        
        
        String b_price = jTextFieldBuying_UnitPrice.getText();
        String s_price = jTextFieldSelling_UnitPrice.getText();
        
 
        try {
        
            String query;
            
            query = "INSERT INTO Chalan VALUES ('"+chalan_date+"','"+quantity+"','"+exp_date+"')";
            
            //System.out.println(query);
            
            PreparedStatement ps;
            ps = connection.prepareStatement(query);
            ps.executeUpdate();
            
            if(pid.equals("")){
                pid = "0";
            }
            
            query = "SELECT S_Quantity from Stock where P_ID = "+Integer.parseInt(pid);
            
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            
            int updated_quantity = rs.getInt("S_Quantity");
            updated_quantity = updated_quantity + Integer.parseInt(quantity) ;
            
            
            query = "Update Stock Set S_Quantity = "+updated_quantity+" Where P_ID = "+pid;
            ps = connection.prepareStatement(query);
            ps.executeUpdate();
            
            
            
            }
            
            else{
                
            query = "Insert into Stock values ('"+pn+"',"+quantity+",'"+p_details+"','"+category+"')";
            
            //System.out.println(query);
            
            ps = connection.prepareStatement(query);
            ps.executeUpdate();
                
            }
            
            
            query = "SELECT IDENT_CURRENT('Chalan')" ;
            
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            rs.next();
            
            int chalan_id = rs.getInt("");
            //System.out.println(chalan_id);
            
            query = "SELECT IDENT_CURRENT('Stock')" ;
            
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            rs.next();
            
            int updated_pid = rs.getInt("");
            
                        
            query = "INSERT INTO S_Chalan_P VALUES ('"+s_phone+"',"+chalan_id+","+updated_pid+","+b_price+","+s_price+","+quantity+")";
            //System.out.println(query);
            
            ps = connection.prepareStatement(query);
            ps.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Product added to Stock Successfully...", "Info", JOptionPane.INFORMATION_MESSAGE);
            

        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButtonAddChalanActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonSearchSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchSupplierActionPerformed
        
        try {
            //String query = "SELECT * FROM Users WHERE USERNAME='" + jTextFieldSearchQuery.getText() + "' order by USERNAME";
            String query = "SELECT * FROM Supplier WHERE S_Phone LIKE '%"+jTextFieldSupplierPhone.getText()+"%'";
            PreparedStatement ps;

            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTableSupplier.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
                
                String sn = rs.getString("S_Name");
                String sp = rs.getString("S_Phone");
             
                   
                Object[] row = new Object[2];
                
                row[0] = sn;
                row[1] = sp;
                
                
                model.addRow(row);
                
            }

            if (jTableSupplier.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No Match Found .... Please Try Again", "Info", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonSearchSupplierActionPerformed

    private void jButtonSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchProductActionPerformed
        
        try {
            //String query = "SELECT * FROM Users WHERE USERNAME='" + jTextFieldSearchQuery.getText() + "' order by USERNAME";
            String query = "SELECT * FROM Stock WHERE P_Name LIKE '%"+jTextFieldProductName.getText()+"%'";
            PreparedStatement ps;

            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTableProduct.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
                
                String pn = rs.getString("P_Name");
                String pid = rs.getString("P_ID");
             
                   
                Object[] row = new Object[2];
                
                row[0] = pn;
                row[1] = pid;
                
                
                model.addRow(row);
                
            }

            if (jTableProduct.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No Match Found .... Please Try Again", "Info", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonSearchProductActionPerformed

    private void jTextFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameActionPerformed

    private void jTableSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSupplierMouseClicked
        
            DefaultTableModel model = (DefaultTableModel) jTableSupplier.getModel();

            String sn = (String) model.getValueAt(jTableSupplier.getSelectedRow(), 0);
            String s_phone = (String) model.getValueAt(jTableSupplier.getSelectedRow(), 1);

            //jTextFieldSupplierName.setText(sn);
            jTextFieldPhone.setText(s_phone);
        
    }//GEN-LAST:event_jTableSupplierMouseClicked

    private void jTableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductMouseClicked
        
            DefaultTableModel model = (DefaultTableModel) jTableProduct.getModel();

            String pn = (String) model.getValueAt(jTableProduct.getSelectedRow(), 0);
            String pid = (String) model.getValueAt(jTableProduct.getSelectedRow(), 1);

            //jTextFieldSupplierName.setText(sn);
            jTextFieldPName.setText(pn);
            jTextFieldPID.setText(pid);
            
    }//GEN-LAST:event_jTableProductMouseClicked
    
    void clear(){
        
        jTextFieldPName.setText("");
        jTextFieldPID.setText("");
        textFieldPDetails.setText(" ");
        jTextFieldPhone.setText("");
        jTextFieldP_Quantity.setText("");
        jComboBoxCategory.setSelectedIndex(0);
        
        jDateChooserExpDate.setCalendar(null);
        jDateChooserChalanDate.setCalendar(null);
        
        jTextFieldBuying_UnitPrice.setText("");
        jTextFieldSelling_UnitPrice.setText("");
        
    }
    
    
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        
        clear();
        
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Stocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAddChalan;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSearchProduct;
    private javax.swing.JButton jButtonSearchSupplier;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private com.toedter.calendar.JDateChooser jDateChooserChalanDate;
    private com.toedter.calendar.JDateChooser jDateChooserExpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProduct;
    private javax.swing.JTable jTableSupplier;
    private javax.swing.JTextField jTextFieldBuying_UnitPrice;
    private javax.swing.JTextField jTextFieldPID;
    private javax.swing.JTextField jTextFieldPName;
    private javax.swing.JTextField jTextFieldP_Quantity;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldSelling_UnitPrice;
    private javax.swing.JTextField jTextFieldSupplierPhone;
    private java.awt.TextField textFieldPDetails;
    // End of variables declaration//GEN-END:variables
}
