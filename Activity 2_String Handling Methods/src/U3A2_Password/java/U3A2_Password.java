/*
----------------------------------------------------------
Author: Mayank Mehra 
Date: Friday July 15, 2019
Purpose: String Handling Methods
----------------------------------------------------------
Description: Create a password program that prompts a user for:
    A username
    A password (at least 8 characters long).
    When an acceptable password has been entered, a random number 
    between 1 and 100 should be added to the password. The username and 
    password are then to be converted to all lowercase letters and the 
    appropriate message is to be displayed.
----------------------------------------------------------
 */
package U3A2_Password.java;

public class U3A2_Password extends javax.swing.JFrame {

    public U3A2_Password() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblCharacters = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnPassword = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        Background = new javax.swing.JPanel();
        lblOutput = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblUsername.setText("Enter a Username: ");
        getContentPane().add(lblUsername);
        lblUsername.setBounds(52, 79, 134, 17);

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPassword.setText("Enter a Password: ");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(52, 135, 132, 17);

        lblCharacters.setText("(Atleast 8 Characters) ");
        getContentPane().add(lblCharacters);
        lblCharacters.setBounds(58, 164, 139, 16);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername);
        txtUsername.setBounds(234, 74, 242, 26);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(234, 130, 242, 26);

        btnPassword.setText("Generate Password");
        btnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnPassword);
        btnPassword.setBounds(234, 176, 242, 29);
        getContentPane().add(Separator);
        Separator.setBounds(-25, 263, 570, 12);

        Background.setBackground(new java.awt.Color(153, 204, 255));

        lblOutput.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblOutput.setForeground(new java.awt.Color(255, 51, 51));
        lblOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOutput.setText("Enter a Username & Password Please");

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Password Program");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(lblOutput)
                .addGap(68, 68, 68))
        );

        getContentPane().add(Background);
        Background.setBounds(0, 0, 540, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasswordActionPerformed
        //Decalare Variables
        String strPassword, strUsername, strNewPassword;
        strPassword = this.txtPassword.getText().toLowerCase(); //Stores txt from input and makes it lowercase
        strUsername = this.txtUsername.getText().toLowerCase(); //Stores txt from input and makes it lowercase

        if (strPassword.length() >= 8) { //if else Statement; if the lenght of the password is 8 or greater
            strNewPassword = strPassword + Integer.toString((int) (Math.random() * 100)); //adds random number to password
            this.lblOutput.setText("Username = " + strUsername + " Password = " + strNewPassword);// Output
        } else if (strPassword.length() < 8) { //if password length is less then 8 
            this.lblOutput.setText("Please insure your password is atleast 8 Characters long");//output
        } else { //just in case anything is inputed totally wrong 
            this.lblOutput.setText("Try Again");
        }
    }//GEN-LAST:event_btnPasswordActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(U3A2_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U3A2_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U3A2_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U3A2_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U3A2_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton btnPassword;
    private javax.swing.JLabel lblCharacters;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
