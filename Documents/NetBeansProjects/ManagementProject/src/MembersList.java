import java.sql.*;
import database.DbConnection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class MembersList extends javax.swing.JFrame {

    public MembersList() {
        initComponents();
        DefaultTableModel defaultTableModel =(DefaultTableModel)tableList.getModel();
        try {
            Connection connection = DbConnection.getCon();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from member");
            while (resultSet.next()){
            defaultTableModel.addRow(new Object[]{resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),
                resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),
                resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)
            });
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Management Program");

        header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        header.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\shooting-script.png")); // NOI18N
        header.setText(" Members List");

        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Contact Number", "Address", "Membership Category", "Payment Plan", "Gender", "Age", "Height  (cm)", "Weight (kg)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableList);
        if (tableList.getColumnModel().getColumnCount() > 0) {
            tableList.getColumnModel().getColumn(0).setResizable(false);
            tableList.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableList.getColumnModel().getColumn(1).setResizable(false);
            tableList.getColumnModel().getColumn(1).setPreferredWidth(20);
            tableList.getColumnModel().getColumn(2).setResizable(false);
            tableList.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableList.getColumnModel().getColumn(3).setResizable(false);
            tableList.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableList.getColumnModel().getColumn(4).setResizable(false);
            tableList.getColumnModel().getColumn(4).setPreferredWidth(30);
            tableList.getColumnModel().getColumn(5).setResizable(false);
            tableList.getColumnModel().getColumn(5).setPreferredWidth(80);
            tableList.getColumnModel().getColumn(6).setResizable(false);
            tableList.getColumnModel().getColumn(6).setPreferredWidth(50);
            tableList.getColumnModel().getColumn(7).setResizable(false);
            tableList.getColumnModel().getColumn(7).setPreferredWidth(12);
            tableList.getColumnModel().getColumn(8).setResizable(false);
            tableList.getColumnModel().getColumn(8).setPreferredWidth(10);
            tableList.getColumnModel().getColumn(9).setResizable(false);
            tableList.getColumnModel().getColumn(9).setPreferredWidth(20);
            tableList.getColumnModel().getColumn(10).setResizable(false);
            tableList.getColumnModel().getColumn(10).setPreferredWidth(20);
        }

        closeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\AG\\Documents\\NetBeansProjects\\ManagementProject\\Icons\\x-button.png")); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeButton)))
                .addContainerGap(350, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }//GEN-LAST:event_closeButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableList;
    // End of variables declaration//GEN-END:variables
}
