/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.vista;

import javax.swing.JButton;
import javax.swing.JMenuItem;

/**
 *
 * @author corin
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public JMenuItem getBtnNewCustom() {
        return btnNewCustom;
    }

    public void setBtnNewCustom(JMenuItem btnNewCustom) {
        this.btnNewCustom = btnNewCustom;
    }

    public JMenuItem getJListCustom() {
        return JListCustom;
    }

    public void setJListCustom(JMenuItem JListCustom) {
        this.JListCustom = JListCustom;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jminventory = new javax.swing.JMenu();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        JNewProducto1 = new javax.swing.JMenuItem();
        JProducts = new javax.swing.JMenu();
        JNewProducto = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        JEditProduct = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        JDeleteProduct = new javax.swing.JMenuItem();
        JMCustoms = new javax.swing.JMenu();
        btnNewCustom = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        JEditCustom = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        JDeleteCustom = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JListCustom = new javax.swing.JMenuItem();
        JMInvoice = new javax.swing.JMenu();
        JnewInvoice = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        JmInvoiceList = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unique Jewerly Desings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        Jminventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/inventory.png"))); // NOI18N
        Jminventory.setText("Inventory");
        Jminventory.add(jSeparator6);

        JNewProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/jewelry.png"))); // NOI18N
        JNewProducto1.setText("Products Stock");
        JNewProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNewProducto1ActionPerformed(evt);
            }
        });
        Jminventory.add(JNewProducto1);

        JProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/products.png"))); // NOI18N
        JProducts.setText("Products");

        JNewProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/plus.png"))); // NOI18N
        JNewProducto.setText("New Product");
        JNewProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNewProductoActionPerformed(evt);
            }
        });
        JProducts.add(JNewProducto);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        JProducts.add(jSeparator8);

        JEditProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/edit product.png"))); // NOI18N
        JEditProduct.setText("Edit Product");
        JProducts.add(JEditProduct);

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        JProducts.add(jSeparator9);

        JDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/delete product.png"))); // NOI18N
        JDeleteProduct.setText("Delete Product");
        JProducts.add(JDeleteProduct);

        Jminventory.add(JProducts);

        jMenuBar1.add(Jminventory);

        JMCustoms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/customs.png"))); // NOI18N
        JMCustoms.setText("Customs");

        btnNewCustom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/new customer.png"))); // NOI18N
        btnNewCustom.setText("New Custom");
        btnNewCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCustomActionPerformed(evt);
            }
        });
        JMCustoms.add(btnNewCustom);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        JMCustoms.add(jSeparator4);

        JEditCustom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/edit.png"))); // NOI18N
        JEditCustom.setText("Edit Custom");
        JMCustoms.add(JEditCustom);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        JMCustoms.add(jSeparator2);

        JDeleteCustom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/delete customer.png"))); // NOI18N
        JDeleteCustom.setText("Delete Custom");
        JDeleteCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDeleteCustomActionPerformed(evt);
            }
        });
        JMCustoms.add(JDeleteCustom);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        JMCustoms.add(jSeparator1);

        JListCustom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/list customers.png"))); // NOI18N
        JListCustom.setText("List Custom");
        JMCustoms.add(JListCustom);

        jMenuBar1.add(JMCustoms);

        JMInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/new Invoice.png"))); // NOI18N
        JMInvoice.setText("Invoice");

        JnewInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/new Invoice.png"))); // NOI18N
        JnewInvoice.setText("New Invoice");
        JnewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JnewInvoiceActionPerformed(evt);
            }
        });
        JMInvoice.add(JnewInvoice);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        JMInvoice.add(jSeparator7);

        JmInvoiceList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsMenu/list Invoice.png"))); // NOI18N
        JmInvoiceList.setText("Invoice List");
        JmInvoiceList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmInvoiceListActionPerformed(evt);
            }
        });
        JMInvoice.add(JmInvoiceList);

        jMenuBar1.add(JMInvoice);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCustomActionPerformed
        
    }//GEN-LAST:event_btnNewCustomActionPerformed

    private void JDeleteCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDeleteCustomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDeleteCustomActionPerformed

    private void JmInvoiceListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmInvoiceListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmInvoiceListActionPerformed

    private void JnewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JnewInvoiceActionPerformed
        Factura fac = new Factura();
        fac.setVisible(true);
    }//GEN-LAST:event_JnewInvoiceActionPerformed

    private void JNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNewProductoActionPerformed
        
    }//GEN-LAST:event_JNewProductoActionPerformed

    private void JNewProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNewProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNewProducto1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JDeleteCustom;
    private javax.swing.JMenuItem JDeleteProduct;
    private javax.swing.JMenuItem JEditCustom;
    private javax.swing.JMenuItem JEditProduct;
    private javax.swing.JMenuItem JListCustom;
    private javax.swing.JMenu JMCustoms;
    private javax.swing.JMenu JMInvoice;
    private javax.swing.JMenuItem JNewProducto;
    private javax.swing.JMenuItem JNewProducto1;
    private javax.swing.JMenu JProducts;
    private javax.swing.JMenuItem JmInvoiceList;
    private javax.swing.JMenu Jminventory;
    private javax.swing.JMenuItem JnewInvoice;
    private javax.swing.JMenuItem btnNewCustom;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
