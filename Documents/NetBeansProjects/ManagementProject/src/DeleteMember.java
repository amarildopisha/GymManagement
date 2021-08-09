import java.sql.*;
import database.DbConnection;
import javax.swing.JOptionPane;
public class DeleteMember extends javax.swing.JFrame {

    
    public DeleteMember() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        contactnumberField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        membershipLabel = new javax.swing.JLabel();
        membershipField = new javax.swing.JTextField();
        paymentLabel = new javax.swing.JLabel();
        paymentField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        weightLabel = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        weightField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Management Program");

        header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        header.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\Trash-can-icon (1).png")); // NOI18N
        header.setText("Delete Member");

        idLabel.setText("ID:");

        nameLabel.setText("Name:");

        searchButton.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\icons8-search-20.png")); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        nameField.setEditable(false);

        surnameLabel.setText("Surname:");

        surnameField.setEditable(false);

        contactLabel.setText("Contact Number:");

        addressLabel.setText("Address:");

        contactnumberField.setEditable(false);

        addressField.setEditable(false);

        membershipLabel.setText("Membership Category:");

        membershipField.setEditable(false);

        paymentLabel.setText("Payment Plan:");

        paymentField.setEditable(false);

        genderLabel.setText("Gender:");

        genderField.setEditable(false);

        ageLabel.setText("Age:");

        heightLabel.setText("Height:");

        ageField.setEditable(false);

        weightLabel.setText("Weight:");

        heightField.setEditable(false);

        weightField.setEditable(false);

        deleteButton.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\icons8-delete-bin-24.png")); // NOI18N
        deleteButton.setText("Delete Member");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
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

        clearButton.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\reset.png")); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idLabel)
                                    .addComponent(nameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(surnameLabel)
                                    .addComponent(contactLabel)
                                    .addComponent(addressLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(surnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(contactnumberField)
                                    .addComponent(addressField))))
                        .addGap(278, 278, 278)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(genderLabel)
                            .addComponent(membershipLabel)
                            .addComponent(paymentLabel)
                            .addComponent(ageLabel)
                            .addComponent(heightLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weightLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paymentField)
                    .addComponent(membershipField)
                    .addComponent(genderField)
                    .addComponent(ageField)
                    .addComponent(heightField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(weightField))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(membershipField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idLabel)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(membershipLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paymentLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(contactnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        int getID = 0;
        String id = idField.getText();
        try {
            Connection connection = DbConnection.getCon();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from member where id = '" +id+"'");
            while(resultSet.next()){
                getID = 1;
                
                nameField.setText(resultSet.getString(2));
                surnameField.setText(resultSet.getString(3));
                contactnumberField.setText(resultSet.getString(4));
                addressField.setText(resultSet.getString(5));
                membershipField.setText(resultSet.getString(6));
                paymentField.setText(resultSet.getString(7));
                genderField.setText(resultSet.getString(8));
                ageField.setText(resultSet.getString(9));
                heightField.setText(resultSet.getString(10));
                weightField.setText(resultSet.getString(11));

            }

            if (getID == 0) {
                JOptionPane.showMessageDialog(null, "Member ID does not Exist!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
              
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        setVisible(false);
        DeleteMember deleteMember = new DeleteMember();
        deleteMember.setVisible(true);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Delete Member?","Select",JOptionPane.YES_NO_OPTION);
        if (x==0) {
            String id = idField.getText();
            try {
                Connection connection = DbConnection.getCon();
                Statement statement = connection.createStatement();
                statement.executeUpdate("delete from member where id='"+id+"'");
                JOptionPane.showMessageDialog(null, "Member Deleted Successfully");
                setVisible(false);
                new DeleteMember().setVisible(true);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactnumberField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel header;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField membershipField;
    private javax.swing.JLabel membershipLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField paymentField;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
