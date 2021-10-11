/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.FleetDirectory;
import Business.Car;
import java.awt.CardLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saikumarganga
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountJPanel
     */
    private JPanel userProcessContainer;
    private FleetDirectory fleetDirectory;

    ManageAccountJPanel(JPanel userProcessContainer, FleetDirectory fleetDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.fleetDirectory = fleetDirectory;
        populate();
        listOfManufactures();
    }

    public void updatedTime() {
        List<Date> datesList = new ArrayList<>();
        for (Car car : fleetDirectory.getCarList()) {
            datesList.add(car.getLastUpdatedDate());
        }
        Collections.sort(datesList, Comparator.reverseOrder());
        fleetDirectory.setFleetUpdatedDate(datesList.get(0).toString());
       
    }

    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
        dtm.setRowCount(0);

        for (Car car : fleetDirectory.getCarList()) {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = car;
            row[1] = car.getModelNumber();
            row[2] = car.getSerialNumber();
            row[3] = car.getManufacturedYear();
            row[4] = car.getAvailableSeats();
            row[5] = car.getCity();
            row[6] = car.isavailabilityStatus();
            row[7] = car.ismaintenceCertificateExpiryStatus();
            dtm.addRow(row);
        }
        availableStatus();
        updatedTime();
    }

    public void availableStatus() {
        int availableNumber = 0;
        int unavailableNumber = 0;
        for (Car car : fleetDirectory.getCarList()) {
            if (car.isavailabilityStatus() == true) {
                availableNumber = availableNumber + 1;
            } else if (car.isavailabilityStatus() == false) {
                unavailableNumber = unavailableNumber + 1;
            }
        }
        txtAvailableCars.setText(Integer.toString(availableNumber));
        txtUnavailableCars.setText(Integer.toString(unavailableNumber));
    }

    public void listOfManufactures() {
        Set<String> list = new HashSet<>();
        for (Car car : fleetDirectory.getCarList()) {
            list.add(car.getmanufactureType());
        }
        for (String item : list) {
            comboManufacturerUber.addItem(item);
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
        jScrollPanel = new javax.swing.JScrollPane();
        tblfleetDirectory = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        comboFilters = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAvailableCars = new javax.swing.JTextField();
        txtUnavailableCars = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMinSeats = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSearchSeats = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        comboManufacturerUber = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMaxSeats = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        tblfleetDirectory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblfleetDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacturer", "Model", "Serial Number", "ManufacturerYear", "Max Seats", "City", "AvailablityStatus", "Expired Manufactured Certificate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanel.setViewportView(tblfleetDirectory);
        if (tblfleetDirectory.getColumnModel().getColumnCount() > 0) {
            tblfleetDirectory.getColumnModel().getColumn(0).setResizable(false);
            tblfleetDirectory.getColumnModel().getColumn(1).setResizable(false);
            tblfleetDirectory.getColumnModel().getColumn(2).setResizable(false);
            tblfleetDirectory.getColumnModel().getColumn(3).setResizable(false);
            tblfleetDirectory.getColumnModel().getColumn(4).setResizable(false);
            tblfleetDirectory.getColumnModel().getColumn(5).setResizable(false);
            tblfleetDirectory.getColumnModel().getColumn(6).setResizable(false);
            tblfleetDirectory.getColumnModel().getColumn(7).setResizable(false);
        }

        btnDelete.setBackground(new java.awt.Color(153, 153, 153));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboFilters.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboFilters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Available Car", "Cars that have Expired Maintanence Certificate", "Provide the Car Manufacturer", "Provide the Manufactured Year", "Provide the Serial Number", "Provide the Model Number", "Provide the City", " ", " ", " ", " " }));
        comboFilters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltersActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(153, 153, 153));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText(" Available Cars:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText(" Unavailable Cars:");

        txtAvailableCars.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtUnavailableCars.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText(" Number of Seats required:");

        txtMinSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Minimum Seats:");

        btnSearchSeats.setBackground(new java.awt.Color(153, 153, 153));
        btnSearchSeats.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnSearchSeats.setText("Search");
        btnSearchSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSeatsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("TYPE OF CAR MANUFACTURES USED BY THE UBER:");

        btnView.setBackground(new java.awt.Color(153, 153, 153));
        btnView.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        comboManufacturerUber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboManufacturerUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboManufacturerUberActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Maximum Seats:");

        txtMaxSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("APPLY FILTER & SEARCH");

        btnRefresh.setBackground(new java.awt.Color(153, 153, 153));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboManufacturerUber, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUnavailableCars, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(txtAvailableCars, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(690, 690, 690)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMinSeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(comboFilters, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSearch)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(208, 208, 208)
                                    .addComponent(btnRefresh)
                                    .addGap(37, 37, 37)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2123, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1179, 1179, 1179)
                .addComponent(btnSearchSeats)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboManufacturerUber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAvailableCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnavailableCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresh)
                            .addComponent(btnView)
                            .addComponent(btnDelete))
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(223, 223, 223)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnSearchSeats)
                .addGap(26, 26, 26))
        );

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UBER ACCOUNT MANAGEMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2705, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblfleetDirectory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        } else {
            Car car = (Car) tblfleetDirectory.getValueAt(selectedRow, 0);
            ViewJPanel panel = new ViewJPanel(userProcessContainer, fleetDirectory, car);
            userProcessContainer.add("ViewJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblfleetDirectory.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are You Sure, Would you like to delete the details", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Car car = (Car) tblfleetDirectory.getValueAt(selectedRow, 0);
                fleetDirectory.deleteAccount(car);
                comboManufacturerUber.removeAllItems();
                populate();
                listOfManufactures();
                
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

        DefaultComboBoxModel dcm = (DefaultComboBoxModel) comboFilters.getModel();

        if (dcm.getSelectedItem().equals("Provide the Manufactured Year")) {
            DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
            dtm.setRowCount(0);

            for (Car car : fleetDirectory.getCarList()) {
                if (Integer.toString(car.getManufacturedYear()).equals(txtSearch.getText())) {

                    Object row[] = new Object[dtm.getColumnCount()];
                    row[0] = car;
                    row[1] = car.getModelNumber();
                    row[2] = car.getSerialNumber();
                    row[3] = car.getManufacturedYear();
                    row[4] = car.getAvailableSeats();
                    row[5] = car.getCity();
                    row[6] = car.isavailabilityStatus();
                    row[7] = car.ismaintenceCertificateExpiryStatus();
                    dtm.addRow(row);
                }

            }
            if (dtm.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populate();
            }

        } else if (dcm.getSelectedItem().equals("Provide the Serial Number")) {
            DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
            dtm.setRowCount(0);
            for (Car car : fleetDirectory.getCarList()) {
                if (car.getSerialNumber().equals(txtSearch.getText())) {

                    Object row[] = new Object[dtm.getColumnCount()];
                    row[0] = car;
                    row[1] = car.getModelNumber();
                    row[2] = car.getSerialNumber();
                    row[3] = car.getManufacturedYear();
                    row[4] = car.getAvailableSeats();
                    row[5] = car.getCity();
                    row[6] = car.isavailabilityStatus();
                    row[7] = car.ismaintenceCertificateExpiryStatus();
                    dtm.addRow(row);
                }
            }
            if (dtm.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populate();
            }
        } else if (dcm.getSelectedItem().equals("Provide the Model Number")) {
            DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
            dtm.setRowCount(0);
            for (Car car : fleetDirectory.getCarList()) {
                if (car.getModelNumber().equals(txtSearch.getText())) {

                    Object row[] = new Object[dtm.getColumnCount()];
                    row[0] = car;
                    row[1] = car.getModelNumber();
                    row[2] = car.getSerialNumber();
                    row[3] = car.getManufacturedYear();
                    row[4] = car.getAvailableSeats();
                    row[5] = car.getCity();
                    row[6] = car.isavailabilityStatus();
                    row[7] = car.ismaintenceCertificateExpiryStatus();
                    dtm.addRow(row);
                }
            }
            if (dtm.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populate();
            }
        } else if (dcm.getSelectedItem().equals("Provide the Car Manufacturer")) {
            DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
            dtm.setRowCount(0);
            for (Car car : fleetDirectory.getCarList()) {
                if (car.getmanufactureType().equals(txtSearch.getText())) {

                    Object row[] = new Object[dtm.getColumnCount()];
                    row[0] = car;
                    row[1] = car.getModelNumber();
                    row[2] = car.getSerialNumber();
                    row[3] = car.getManufacturedYear();
                    row[4] = car.getAvailableSeats();
                    row[5] = car.getCity();
                    row[6] = car.isavailabilityStatus();
                    row[7] = car.ismaintenceCertificateExpiryStatus();
                    dtm.addRow(row);
                }
            }
            if (dtm.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populate();
            }
        } else if (dcm.getSelectedItem().equals("Provide the City")) {
            DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
            dtm.setRowCount(0);
            for (Car car : fleetDirectory.getCarList()) {
                if (car.getCity().equals(txtSearch.getText())) {

                    Object row[] = new Object[dtm.getColumnCount()];
                    row[0] = car;
                    row[1] = car.getModelNumber();
                    row[2] = car.getSerialNumber();
                    row[3] = car.getManufacturedYear();
                    row[4] = car.getAvailableSeats();
                    row[5] = car.getCity();
                    row[6] = car.isavailabilityStatus();
                    row[7] = car.ismaintenceCertificateExpiryStatus();
                    dtm.addRow(row);
                }
            }
            if (dtm.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populate();
            }
        } else if (dcm.getSelectedItem().equals("First Available Car")) {

            DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
            dtm.setRowCount(0);
            for (Car car : fleetDirectory.getCarList()) {
                if (Boolean.toString(car.isavailabilityStatus()).equals("true")) {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = car.getmanufactureType();
                    row[1] = car.getModelNumber();
                    row[2] = car.getSerialNumber();
                    row[3] = car.getManufacturedYear();
                    row[4] = car.getAvailableSeats();
                    row[5] = car.getCity();
                    row[6] = car.isavailabilityStatus();
                    row[7] = car.ismaintenceCertificateExpiryStatus();
                    dtm.addRow(row);
                    break;
                }

            }

        } else if (dcm.getSelectedItem().equals("Cars that have Expired Maintanence Certificate")) {
            DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
            dtm.setRowCount(0);
            for (Car a : fleetDirectory.getCarList()) {
                if (Boolean.toString(a.ismaintenceCertificateExpiryStatus()).equals("true")) {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = a.getmanufactureType();
                    row[1] = a.getModelNumber();
                    row[2] = a.getSerialNumber();
                    row[3] = a.getManufacturedYear();
                    row[4] = a.getAvailableSeats();
                    row[5] = a.getCity();
                    row[6] = a.isavailabilityStatus();
                    row[7] = a.ismaintenceCertificateExpiryStatus();
                    dtm.addRow(row);
                }

            }
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void comboFiltersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltersActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_comboFiltersActionPerformed

    private void btnSearchSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSeatsActionPerformed
        // TODO add your handling code here:
        int minSeats = Integer.parseInt(txtMinSeats.getText());
        System.out.println(minSeats);
        int maxSeats = Integer.parseInt(txtMaxSeats.getText());
        System.out.println(maxSeats);
        DefaultTableModel dtm = (DefaultTableModel) tblfleetDirectory.getModel();
        dtm.setRowCount(0);
        for (Car car : fleetDirectory.getCarList()) {
            if (car.isavailabilityStatus() == true && car.getAvailableSeats() >= minSeats && car.getAvailableSeats() <= maxSeats) {

                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = car.getmanufactureType();
                row[1] = car.getModelNumber();
                row[2] = car.getSerialNumber();
                row[3] = car.getManufacturedYear();
                row[4] = car.getAvailableSeats();
                row[5] = car.getCity();
                row[6] = car.isavailabilityStatus();
                row[7] = car.ismaintenceCertificateExpiryStatus();

                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_btnSearchSeatsActionPerformed

    private void comboManufacturerUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboManufacturerUberActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboManufacturerUberActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchSeats;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboFilters;
    private javax.swing.JComboBox<String> comboManufacturerUber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JTable tblfleetDirectory;
    private javax.swing.JTextField txtAvailableCars;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUnavailableCars;
    // End of variables declaration//GEN-END:variables
}
