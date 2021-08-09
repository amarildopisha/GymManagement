import java.sql.*;
import database.DbConnection;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class UpdateMember extends javax.swing.JFrame {

    
    public UpdateMember() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Surname = new javax.swing.JLabel();
        ContactNumber = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        SurnameField = new javax.swing.JTextField();
        ContactNumberField = new javax.swing.JTextField();
        AddressField = new javax.swing.JTextField();
        ButtonsPanel = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        cleratTextFieldButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        membershipCategoryUpdate = new javax.swing.JLabel();
        membershipUpdate = new javax.swing.JComboBox<>();
        paymentUpdate = new javax.swing.JLabel();
        paymentBoxUpdate = new javax.swing.JComboBox<>();
        GenderUpdate = new javax.swing.JLabel();
        heightUpdate = new javax.swing.JLabel();
        weightUpdate = new javax.swing.JLabel();
        genderUpdateBox = new javax.swing.JComboBox<>();
        heightUpdateField = new javax.swing.JTextField();
        weightUpdateField = new javax.swing.JTextField();
        metersUpdate = new javax.swing.JLabel();
        kilogramsUpdate = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Management Program");
        setPreferredSize(new java.awt.Dimension(917, 641));
        setSize(new java.awt.Dimension(917, 641));

        Header.setBackground(new java.awt.Color(204, 204, 204));
        Header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Header.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\Update.png")); // NOI18N
        Header.setText("Update Member Details");

        Name.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        Name.setText("Name:");

        Surname.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        Surname.setText("Surname:");

        ContactNumber.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        ContactNumber.setText("Contact Number:");

        Address.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        Address.setText("Address:");

        ContactNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNumberFieldActionPerformed(evt);
            }
        });

        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\save.png")); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cleratTextFieldButton.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        cleratTextFieldButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\reset.png")); // NOI18N
        cleratTextFieldButton.setText("Clear");
        cleratTextFieldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleratTextFieldButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\x-button.png")); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleratTextFieldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(cleratTextFieldButton)
                .addGap(18, 18, 18)
                .addComponent(closeButton)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        membershipCategoryUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        membershipCategoryUpdate.setText("Membership Category:");

        membershipUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        membershipUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Workout", "Personal Training", "Main Workout + Cardio Area" }));

        paymentUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        paymentUpdate.setText("Payment Plan:");

        paymentBoxUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        paymentBoxUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1   Month", "3   Months", "6   Months", "12 Months" }));

        GenderUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        GenderUpdate.setText("Gender:");

        heightUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        heightUpdate.setText("Height:");

        weightUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        weightUpdate.setText("Weight:");

        genderUpdateBox.setEditable(true);
        genderUpdateBox.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        genderUpdateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        metersUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        metersUpdate.setText("cm");

        kilogramsUpdate.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        kilogramsUpdate.setText("kg");

        ageLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        ageLabel.setText("Age:");

        idLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        idLabel.setText("Member ID:");

        searchButton.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 102, 255));
        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\icons8-search-20.png")); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GenderUpdate)
                            .addComponent(ageLabel)
                            .addComponent(heightUpdate)
                            .addComponent(weightUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderUpdateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(weightUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kilogramsUpdate))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(heightUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(metersUpdate)))
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(paymentUpdate)
                            .addComponent(membershipCategoryUpdate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentBoxUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(membershipUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Address)
                    .addComponent(Surname)
                    .addComponent(ContactNumber)
                    .addComponent(Name)
                    .addComponent(idLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membershipUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membershipCategoryUpdate))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentUpdate)
                    .addComponent(paymentBoxUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderUpdateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightUpdate)
                    .addComponent(metersUpdate))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightUpdate)
                    .addComponent(kilogramsUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idLabel)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Surname))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address))
                .addGap(18, 18, 18)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Header)
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        int getID = 0;
        String id = IDField.getText();
        try {
            Connection connection = DbConnection.getCon();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from member where id = '" +id+"'");
            while(resultSet.next()){
                getID = 1;
                IDField.setEditable(false);
                NameField.setText(resultSet.getString(2));
                SurnameField.setText(resultSet.getString(3));
                ContactNumberField.setText(resultSet.getString(4));
                AddressField.setText(resultSet.getString(5));
                membershipUpdate.setSelectedItem(resultSet.getString(6));
                paymentBoxUpdate.setSelectedItem(resultSet.getString(7));
                genderUpdateBox.setSelectedItem(resultSet.getString(8));
                genderUpdateBox.setEditable(false);
                ageField.setText(resultSet.getString(9));
                heightUpdateField.setText(resultSet.getString(10));
                weightUpdateField.setText(resultSet.getString(11));

            }

            if (getID == 0) {
                JOptionPane.showMessageDialog(null, "Member ID does not Exist!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void cleratTextFieldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleratTextFieldButtonActionPerformed
        setVisible(false);
        new UpdateMember().setVisible(true);
    }//GEN-LAST:event_cleratTextFieldButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String id = IDField.getText();
        String name = NameField.getText();
        String surname = SurnameField.getText();
        String contact_number = ContactNumberField.getText();
        String address = AddressField.getText();
        String membership_category = (String)membershipUpdate.getSelectedItem();
        String payment_plan = (String)paymentBoxUpdate.getSelectedItem();
        String gender = (String)genderUpdateBox.getSelectedItem();
        String age = ageField.getText();
        String height = heightUpdateField.getText();
        String weight = weightUpdateField.getText();

        try {
            Connection connection = DbConnection.getCon();
            PreparedStatement preparedStatement = connection.prepareStatement("update member set name=?, surname=?, contact_number=?, address=?, membership_category=?, payment_plan=?,age=?, height=? ,weight=? where id=?");

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, contact_number);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, membership_category);
            preparedStatement.setString(6, payment_plan);
            preparedStatement.setString(7, age);
            preparedStatement.setString(8, height);
            preparedStatement.setString(9, weight);
            preparedStatement.setString(10, id);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Member Updateed Successfully");
            setVisible(false);
            new UpdateMember().setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void ContactNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNumberFieldActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextField AddressField;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel ContactNumber;
    private javax.swing.JTextField ContactNumberField;
    private javax.swing.JLabel GenderUpdate;
    private javax.swing.JLabel Header;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel Surname;
    private javax.swing.JTextField SurnameField;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton cleratTextFieldButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> genderUpdateBox;
    private javax.swing.JLabel heightUpdate;
    private javax.swing.JTextField heightUpdateField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kilogramsUpdate;
    private javax.swing.JLabel membershipCategoryUpdate;
    private javax.swing.JComboBox<String> membershipUpdate;
    private javax.swing.JLabel metersUpdate;
    private javax.swing.JComboBox<String> paymentBoxUpdate;
    private javax.swing.JLabel paymentUpdate;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel weightUpdate;
    private javax.swing.JTextField weightUpdateField;
    // End of variables declaration//GEN-END:variables
}
