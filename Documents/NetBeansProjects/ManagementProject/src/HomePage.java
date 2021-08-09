
import javax.swing.JOptionPane;


public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        addMemberButton = new javax.swing.JButton();
        updateMemberButton = new javax.swing.JButton();
        showList = new javax.swing.JButton();
        deleteMemberButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Management Program");
        setBackground(new java.awt.Color(255, 255, 255));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Header.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\fitness.png")); // NOI18N
        Header.setText(" Planet Fitness");

        LogOutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\logout.png")); // NOI18N
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        addMemberButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\user.png")); // NOI18N
        addMemberButton.setText("Add Member");
        addMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonActionPerformed(evt);
            }
        });

        updateMemberButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\update1.png")); // NOI18N
        updateMemberButton.setText("Update Member");
        updateMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMemberButtonActionPerformed(evt);
            }
        });

        showList.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\shooting-script.png")); // NOI18N
        showList.setText("Show Member's List");
        showList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showListActionPerformed(evt);
            }
        });

        deleteMemberButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\delete.png")); // NOI18N
        deleteMemberButton.setText("Delete Member");
        deleteMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMemberButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showList, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(deleteMemberButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showList)
                    .addComponent(addMemberButton))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteMemberButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(LogOutButton)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonActionPerformed
        setVisible(false);
        AddMember newFrame1 = new AddMember();
         newFrame1.setVisible(true);
         
    
    }//GEN-LAST:event_addMemberButtonActionPerformed

    private void updateMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMemberButtonActionPerformed
        setVisible(false);
        UpdateMember newFrame2 = new UpdateMember();
         newFrame2.setVisible(true);
                                           
    }//GEN-LAST:event_updateMemberButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to Log Out? ", "Select",JOptionPane.YES_NO_OPTION);
        if (x==0) {
            setVisible(false);
            
            new LogIn().setVisible(true);
            
        }
    }//GEN-LAST:event_LogOutButtonActionPerformed

  
    private void showListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListActionPerformed
        setVisible(false);
        MembersList membersList = new MembersList();
        membersList.setVisible(true);
    }//GEN-LAST:event_showListActionPerformed

    private void deleteMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMemberButtonActionPerformed
        setVisible(false);
        DeleteMember deleteMember = new DeleteMember();
        deleteMember.setVisible(true);
    }//GEN-LAST:event_deleteMemberButtonActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton addMemberButton;
    private javax.swing.JButton deleteMemberButton;
    private javax.swing.JButton showList;
    private javax.swing.JButton updateMemberButton;
    // End of variables declaration//GEN-END:variables
}
