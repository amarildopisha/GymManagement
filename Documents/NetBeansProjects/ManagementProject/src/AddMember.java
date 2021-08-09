import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class AddMember extends javax.swing.JFrame {

    /**
     * Creates new form NewFrame
     */
    public AddMember() {
        initComponents();
        try {
            int id = 1;
            String string1  = String.valueOf(id);
            idLabel2.setText(string1);
            Connection connection = DbConnection.getCon();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select max(id) from member");
            while (resultSet.next()){
                id = resultSet.getInt(1);
                id = id + 1;
                String string = String.valueOf(id);
                idLabel2.setText(string);
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        contactnumField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        ClearFieldButton = new javax.swing.JButton();
        Add_Member = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        ErrMessage = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idLabel2 = new javax.swing.JLabel();
        membershipLabel = new javax.swing.JLabel();
        membershipBox = new javax.swing.JComboBox<>();
        paymentLabel = new javax.swing.JLabel();
        paymentComboBox = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        heightLabel = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        cmLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        kgLabel = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Managment Program");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(917, 641));

        nameLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        nameLabel.setText("Name:");

        surnameLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        surnameLabel.setText("Surname:");

        numberLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        numberLabel.setText("Contact Number:");

        contactnumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnumFieldActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        addressLabel.setText("Address:");

        ClearFieldButton.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        ClearFieldButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\reset.png")); // NOI18N
        ClearFieldButton.setText("Clear ");
        ClearFieldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearFieldButtonActionPerformed(evt);
            }
        });

        Add_Member.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        Add_Member.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\save.png")); // NOI18N
        Add_Member.setText("Add Member");
        Add_Member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_MemberActionPerformed(evt);
            }
        });

        Close.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\x-button.png")); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close(evt);
            }
        });

        ErrMessage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ErrMessage.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClearFieldButton, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(Add_Member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ErrMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(ErrMessage)
                .addGap(28, 28, 28)
                .addComponent(Add_Member)
                .addGap(18, 18, 18)
                .addComponent(ClearFieldButton)
                .addGap(18, 18, 18)
                .addComponent(Close)
                .addGap(43, 43, 43))
        );

        idLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        idLabel.setText("ID:");

        idLabel2.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        idLabel2.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numberLabel)
                            .addComponent(nameLabel)
                            .addComponent(surnameLabel)
                            .addComponent(addressLabel)
                            .addComponent(idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addressField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(surnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(contactnumField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(nameField))
                            .addComponent(idLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(contactnumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        membershipLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        membershipLabel.setText("Membership Category:");

        membershipBox.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        membershipBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Workout", "Personal Training", "Main Workout + Cardio Area" }));

        paymentLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        paymentLabel.setText("Payment Plan:");

        paymentComboBox.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        paymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1   Month", "3   Months", "6   Months", "12 Months" }));

        genderLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        genderLabel.setText("Gender:");

        genderComboBox.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        heightLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        heightLabel.setText("Height:");

        cmLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        cmLabel.setText("cm");

        weightLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        weightLabel.setText("Weight:");

        kgLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        kgLabel.setText("kg");

        header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        header.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\gym.png")); // NOI18N
        header.setText(" Add Member");

        ageLabel.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        ageLabel.setText("Age:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentLabel)
                    .addComponent(genderLabel)
                    .addComponent(heightLabel)
                    .addComponent(weightLabel)
                    .addComponent(ageLabel)
                    .addComponent(membershipLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kgLabel))
                    .addComponent(membershipBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmLabel)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(header)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(membershipBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(membershipLabel))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmLabel)
                            .addComponent(heightLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kgLabel)
                            .addComponent(weightLabel))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactnumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnumFieldActionPerformed

    private void Close(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close
        setVisible(false);
        new HomePage().setVisible(true);
        
        
    }//GEN-LAST:event_Close

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void ClearFieldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearFieldButtonActionPerformed
        setVisible(false);
        new AddMember().setVisible(true);
    }//GEN-LAST:event_ClearFieldButtonActionPerformed

    private void Add_MemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_MemberActionPerformed
        if (nameField.getText().isEmpty() && surnameField.getText().isEmpty() && contactnumField.getText().isEmpty() && addressField.getText().isEmpty() && ageField.getText().isEmpty() 
               && heightField.getText().isEmpty() && weightField.getText().isEmpty()){
           ErrMessage.setText("Please fill all the fields!");
           }
        
         else if (nameField.getText().isEmpty()) {
            ErrMessage.setText("Please fill all the fields!");
         }else if (surnameField.getText().isEmpty()) {
            ErrMessage.setText("Please fill all the fields!");
         }else if (contactnumField.getText().isEmpty()) {
           ErrMessage.setText("Please fill all the fields!");
         }else if (addressField.getText().isEmpty()) {
           ErrMessage.setText("Please fill all the fields!");
         }else if (ageField.getText().isEmpty()) {
           ErrMessage.setText("Please fill all the fields!");
         }else if (heightField.getText().isEmpty()) {
           ErrMessage.setText("Please fill all the fields!");
         }else if (weightField.getText().isEmpty()) {
           ErrMessage.setText("Please fill all the fields!");
         }else{
             
         
        
        
        String id = idLabel2.getText();
        String name = nameField.getText();
        String surname = surnameField.getText();
        String contact_number = contactnumField.getText();
        String address = addressField.getText();
        String membership_category = (String)membershipBox.getSelectedItem();
        String payment_plan = (String)paymentComboBox.getSelectedItem();
        String gender = (String)genderComboBox.getSelectedItem();
        String age = ageField.getText();
        String height = heightField.getText();
        String weight = weightField.getText();
        try {
            Connection connection = DbConnection.getCon();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into member values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surname);
            preparedStatement.setString(4, contact_number);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, membership_category);
            preparedStatement.setString(7, payment_plan);
            preparedStatement.setString(8, gender);
            preparedStatement.setString(9, age);
            preparedStatement.setString(10, height);
            preparedStatement.setString(11, weight);
            
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Member Added");
            setVisible(false);
            new AddMember().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
         }
           
             
    }//GEN-LAST:event_Add_MemberActionPerformed
    
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Member;
    private javax.swing.JButton ClearFieldButton;
    private javax.swing.JButton Close;
    private javax.swing.JLabel ErrMessage;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel cmLabel;
    private javax.swing.JTextField contactnumField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel header;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kgLabel;
    private javax.swing.JComboBox<String> membershipBox;
    private javax.swing.JLabel membershipLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JComboBox<String> paymentComboBox;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
