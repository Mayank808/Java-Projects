package SleepCalculator;
/**
----------------------------------------------------------
Author: Mayank Mehra
Date: Wednesday August 5, 2020
Purpose: Sleep Calculator
----------------------------------------------------------
Description of code : Code will take in users birthday and todays date and will 
give them the number of days they have been alive and the total hours they have 
slept since they are born.
Assumptions: 
- Each Year is 365 days 
- Each month is 30 days 
- Each day the person sleeps 8 hours
--------------------------------------------------------
 */

public class Sleep extends javax.swing.JFrame {


    public Sleep() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblBrithdate = new javax.swing.JLabel();
        lblTodaysDate = new javax.swing.JLabel();
        lblDayBirthdate = new javax.swing.JLabel();
        lblMonthBirthdate = new javax.swing.JLabel();
        lblYearBirthdate = new javax.swing.JLabel();
        lblDayToday = new javax.swing.JLabel();
        lblMonthToday = new javax.swing.JLabel();
        lblYearToday = new javax.swing.JLabel();
        txtDayBirthdate = new javax.swing.JTextField();
        txtMonthBirthdate = new javax.swing.JTextField();
        txtYearBirthdate = new javax.swing.JTextField();
        txtDayToday = new javax.swing.JTextField();
        txtMonthToday = new javax.swing.JTextField();
        txtYearToday = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        txtDaysAlive = new javax.swing.JTextField();
        txtHoursSlept = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 183, 120));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblTitle.setText("Sleep Calculator");

        lblBrithdate.setText("Enter Your Birthdate");

        lblTodaysDate.setText("Enter Today's Date");

        lblDayBirthdate.setText("Day: ");

        lblMonthBirthdate.setText("Month:");

        lblYearBirthdate.setText("Year:");

        lblDayToday.setText("Day: ");

        lblMonthToday.setText("Month:");

        lblYearToday.setText("Year:");

        txtDayBirthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayBirthdateActionPerformed(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        txtDaysAlive.setText("Enter Dates and Calculate");

        txtHoursSlept.setText("Enter Dates and Calculate");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separator)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblBrithdate))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblYearBirthdate)
                            .addGap(18, 18, 18)
                            .addComponent(txtYearBirthdate))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDayBirthdate)
                                .addComponent(lblMonthBirthdate))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMonthBirthdate)
                                .addComponent(txtDayBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTodaysDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblYearToday)
                                    .addComponent(lblMonthToday))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMonthToday)
                                    .addComponent(txtYearToday)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDayToday)
                                .addGap(18, 18, 18)
                                .addComponent(txtDayToday, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDaysAlive)
                                    .addComponent(txtHoursSlept, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrithdate)
                    .addComponent(lblTodaysDate))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDayBirthdate)
                            .addComponent(txtDayBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMonthBirthdate)
                            .addComponent(txtMonthBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYearBirthdate)
                            .addComponent(txtYearBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDayToday)
                            .addComponent(txtDayToday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMonthToday)
                            .addComponent(txtMonthToday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYearToday)
                            .addComponent(txtYearToday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnCalculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(txtDaysAlive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHoursSlept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDayBirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayBirthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayBirthdateActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        //declare variables
        String strDisplayDays, strDisplayHours; //output strings
        int intDayToday, intMonthToday, intYearToday, intDayBirthdate, intMonthBirthdate, intYearBirthdate; //inputed integers
        int intDayDiff, intMonthDiff, intYearDiff, intTotalDays, intTotalHoursSlept; //integers that are calculated 
        
        //get inputs from specific text fields and assigns it to the specific variables
        intDayToday = Integer.parseInt(txtDayToday.getText()); 
        intMonthToday = Integer.parseInt(txtMonthToday.getText());
        intYearToday = Integer.parseInt(txtYearToday.getText()); 
        intDayBirthdate = Integer.parseInt(txtDayBirthdate.getText()); 
        intMonthBirthdate = Integer.parseInt(txtMonthBirthdate.getText()); 
        intYearBirthdate = Integer.parseInt(txtYearBirthdate.getText()); 
        
        //calculations for the difference in todays date and the birthdate
        //calculatios were split up just to make it easier to understand the code
        //however the calculation can be condensed into one line
        intDayDiff = intDayToday - intDayBirthdate; //difference of the days is assigned 
        intMonthDiff = intMonthToday - intMonthBirthdate; //difference of the months is assigned 
        intYearDiff = intYearToday - intYearBirthdate; //difference of the years is assigned 
        
        //the total duration between the birthdate and today is found in days 
        intTotalDays = intDayDiff + (intMonthDiff * 30) + (intYearDiff * 365); 
        //the total days alive is then used to find the total hours slept
        intTotalHoursSlept = intTotalDays * 8; 
        
        //the integer values are then converted to strings so they can be displayed
        strDisplayDays = Integer.toString(intTotalDays); 
        strDisplayHours = Integer.toString(intTotalHoursSlept); 
        
        //the values are then displayed in their specific text feild
        txtDaysAlive.setText("You have been alive for " + strDisplayDays + " days.");
        txtHoursSlept.setText("You have slept " + strDisplayHours + " hours."); 
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); //exits the application
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Sleep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sleep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sleep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sleep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sleep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblBrithdate;
    private javax.swing.JLabel lblDayBirthdate;
    private javax.swing.JLabel lblDayToday;
    private javax.swing.JLabel lblMonthBirthdate;
    private javax.swing.JLabel lblMonthToday;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTodaysDate;
    private javax.swing.JLabel lblYearBirthdate;
    private javax.swing.JLabel lblYearToday;
    private javax.swing.JTextField txtDayBirthdate;
    private javax.swing.JTextField txtDayToday;
    private javax.swing.JTextField txtDaysAlive;
    private javax.swing.JTextField txtHoursSlept;
    private javax.swing.JTextField txtMonthBirthdate;
    private javax.swing.JTextField txtMonthToday;
    private javax.swing.JTextField txtYearBirthdate;
    private javax.swing.JTextField txtYearToday;
    // End of variables declaration//GEN-END:variables
}
