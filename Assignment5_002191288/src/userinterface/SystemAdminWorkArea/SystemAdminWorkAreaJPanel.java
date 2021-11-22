/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Organization;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author saikumarganga
 * 
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
//    CustomerDirectory customerDirectory;
//    RestaurantDirectory restaurantDirectory;
//    DeliveryManDirectory deliveryManDirectory;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
//        this.customerDirectory = ecosystem.getCustomerDirectory();
//        this.deliveryManDirectory = ecosystem.getDeliveryManDirectory();
//        this.restaurantDirectory = ecosystem.getRestaurantDirectory();
        populateTree();
        //lblSelectedNode.setText();
        //System.out.println("EcoSYSTEM MAIN" + ecosystem.toString() + ecosystem.getCustomerDirectory().getCustomerDirectory().size());
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        
       // Add the code for draw your system structure shown by JTree
       
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("SystemAdmin");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        ArrayList<Customer> customerList=ecosystem.getCustomerDirectory().getCustomerDirectory();
        ArrayList<DeliveryMan> deliveryList = ecosystem.getDeliveryManDirectory().getDeliveryManDirectory();
        ArrayList<Restaurant> restaurantList = ecosystem.getRestaurantDirectory().getRestaurantDirectory();
        
        
        Customer customer;
        DeliveryMan deliveryMan;
        Restaurant restaurant;
        
        DefaultMutableTreeNode customerListNode = new DefaultMutableTreeNode("Customer");
        DefaultMutableTreeNode deliveryManListNode  = new DefaultMutableTreeNode("Delivery");
        DefaultMutableTreeNode restaurantListNode = new DefaultMutableTreeNode("Restaurant");
        networks.insert(customerListNode, 0);
        networks.insert(deliveryManListNode, 1);
        networks.insert(restaurantListNode, 2);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<customerList.size();i++){
            customer=customerList.get(i);
            networkNode=new DefaultMutableTreeNode(customer.getName());
            customerListNode.insert(networkNode, i);
            
        }    
        for(int j=0; j<deliveryList.size();j++){
            deliveryMan= deliveryList.get(j);
            enterpriseNode=new DefaultMutableTreeNode(deliveryMan.getName());
            deliveryManListNode.insert(enterpriseNode, j);
        }        
                
        for(int k=0;k<restaurantList.size();k++){
            restaurant=restaurantList.get(k);
            organizationNode=new DefaultMutableTreeNode(restaurant.getRestaurantName());
            restaurantListNode.insert(organizationNode, k);
        }
           
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JButton();
        btnRestaurant = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnCustomer.setBackground(new java.awt.Color(0, 153, 153));
        btnCustomer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCustomer.setText("Manage All Customers");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnRestaurant.setBackground(new java.awt.Color(0, 153, 153));
        btnRestaurant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRestaurant.setText("Manage Restaurants");
        btnRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantActionPerformed(evt);
            }
        });

        btnDelivery.setBackground(new java.awt.Color(0, 153, 153));
        btnDelivery.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelivery.setText("Manage Deliveryman");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelivery)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRestaurant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(54, 54, 54)
                .addComponent(btnCustomer)
                .addGap(18, 18, 18)
                .addComponent(btnRestaurant)
                .addGap(18, 18, 18)
                .addComponent(btnDelivery)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed

        ManageCustomerJPanel mcjp = new ManageCustomerJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageCustomersJPanel",mcjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantActionPerformed
        ManageRestaurantJPanel mrjp = new ManageRestaurantJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageRestaurantJPanel",mrjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRestaurantActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
       ManageDeliveryManJPanel mdmjp = new ManageDeliveryManJPanel(userProcessContainer, ecosystem, ecosystem.getDeliveryManDirectory());
       userProcessContainer.add("ManageDeliveryManJPanel", mdmjp);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnRestaurant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}