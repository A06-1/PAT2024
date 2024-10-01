package UI;

import Backend.Managers.Productmanager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author aidanm
 */
public class Products extends javax.swing.JFrame {
    
    private Productmanager pm;

    /**
     * Creates new form MainMenuScreen
     */
    public Products() {
        initComponents();
        
        pm = new Productmanager();
        
        updateProductTable();
        
        JLabel label1 = (JLabel) nameErrorLabel;
        label1.setVisible(false);
        
        JLabel label2 = (JLabel) brandErrorLabel;
        label2.setVisible(false);
        
        JLabel label3 = (JLabel) costErrorLabel;
        label3.setVisible(false);
        
    }
    
    public void updateProductTable() {
        //Populate jTable
        String[] columnNames = pm.getColumnNames();
        String[][] data = pm.getTableData();
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        ListOfProductsTable.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProductBrandLabel = new javax.swing.JLabel();
        productBrandTextField = new javax.swing.JTextField();
        ProductCostLabel = new javax.swing.JLabel();
        ProductsHeadingProductScreen = new javax.swing.JLabel();
        ListOfProductsLabel = new javax.swing.JLabel();
        deleteProductButton = new javax.swing.JButton();
        ProductTotalStockLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfProductsTable = new javax.swing.JTable();
        AddProductButton1 = new javax.swing.JButton();
        productNameTextField = new javax.swing.JTextField();
        productCostTextField = new javax.swing.JTextField();
        nameErrorLabel = new javax.swing.JLabel();
        brandErrorLabel = new javax.swing.JLabel();
        costErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ProductBrandLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProductBrandLabel.setText("Name:");

        productBrandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBrandTextFieldActionPerformed(evt);
            }
        });

        ProductCostLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProductCostLabel.setText("Brand:");

        ProductsHeadingProductScreen.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        ProductsHeadingProductScreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductsHeadingProductScreen.setText("Products:");

        ListOfProductsLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ListOfProductsLabel.setText("List of Products:");

        deleteProductButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        deleteProductButton.setText("Delete");
        deleteProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProductButtonMouseClicked(evt);
            }
        });

        ProductTotalStockLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProductTotalStockLabel.setText("Cost:");

        ListOfProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Brand", "Cost"
            }
        ));
        jScrollPane1.setViewportView(ListOfProductsTable);

        AddProductButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AddProductButton1.setText("Add");
        AddProductButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddProductButton1MouseClicked(evt);
            }
        });
        AddProductButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductButton1ActionPerformed(evt);
            }
        });

        nameErrorLabel.setText("Enter a name");

        brandErrorLabel.setText("Enter a brand");

        costErrorLabel.setText("Enter a cost");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(ListOfProductsLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(ProductsHeadingProductScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(ProductBrandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductCostLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductTotalStockLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(productNameTextField)
                        .addComponent(productBrandTextField)
                        .addComponent(productCostTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                    .addComponent(AddProductButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameErrorLabel)
                    .addComponent(brandErrorLabel)
                    .addComponent(costErrorLabel))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ProductsHeadingProductScreen)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListOfProductsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductBrandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameErrorLabel)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productBrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brandErrorLabel)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductTotalStockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costErrorLabel)
                        .addGap(45, 45, 45)
                        .addComponent(AddProductButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productBrandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBrandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productBrandTextFieldActionPerformed

    private void AddProductButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButton1ActionPerformed

    }//GEN-LAST:event_AddProductButton1ActionPerformed

    private void AddProductButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddProductButton1MouseClicked
        boolean error = false;
        if (productNameTextField.getText().length() == 0) {
            JLabel label3 = (JLabel) nameErrorLabel;
            label3.setVisible(true);
            error = true;
        }
        if (productBrandTextField.getText().length() == 0) {
            JLabel label3 = (JLabel) brandErrorLabel;
            label3.setVisible(true);
            error = true;
        }
        if (productCostTextField.getText().length() == 0) {
            JLabel label3 = (JLabel) costErrorLabel;
            label3.setVisible(true);
            error = true;
        }
        if (error) {
            return;
        }
        try {            
            String productName = productNameTextField.getText();
            String productBrand = productBrandTextField.getText();
            int productCost = Integer.parseInt(productCostTextField.getText());
            pm.addProduct(productName, productBrand, productCost);
            updateProductTable();
        } catch (NumberFormatException e) {            
            JLabel label3 = (JLabel) costErrorLabel;
            costErrorLabel.setText("Gotta be a number");
            label3.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddProductButton1MouseClicked

    private void deleteProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductButtonMouseClicked
        String productName = productNameTextField.getText();
        String productBrand = productBrandTextField.getText();
        int productCost = Integer.parseInt(productCostTextField.getText()); 
        pm.deleteProduct(productName, productBrand, productCost);
        updateProductTable();
       
    }//GEN-LAST:event_deleteProductButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductButton1;
    private javax.swing.JLabel ListOfProductsLabel;
    private javax.swing.JTable ListOfProductsTable;
    private javax.swing.JLabel ProductBrandLabel;
    private javax.swing.JLabel ProductCostLabel;
    private javax.swing.JLabel ProductTotalStockLabel;
    private javax.swing.JLabel ProductsHeadingProductScreen;
    private javax.swing.JLabel brandErrorLabel;
    private javax.swing.JLabel costErrorLabel;
    private javax.swing.JButton deleteProductButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JTextField productBrandTextField;
    private javax.swing.JTextField productCostTextField;
    private javax.swing.JTextField productNameTextField;
    // End of variables declaration//GEN-END:variables
}
