/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeRecordsProgram;

/**
----------------------------------------------------------
Author: Mayank Mehra
Date: Saturday August 16, 2020
Purpose: Employee Records Program
----------------------------------------------------------
Description of code : Program will save employee data 
--------------------------------------------------------
 */


import java.util.ArrayList; 


public class EmployeeRecordsProgram extends javax.swing.JFrame {
    
    //declares a global class arraylist for employee class
    ArrayList <Employee> employeeInfo = new ArrayList <Employee> (); 
    
    /**
     * Declares a employee class
     */
    class Employee {
        int intIDNum, intStartDate, intSalary;
        String strFirstName, strLastName;  
        
        /**
         * Defines the attributes of the employee class 
         * @param intTempID takes in employee id
         * @param intTempDate takes in employee start date
         * @param intTempSalary takes in employee salary 
         * @param strTempFirst takes in employee first name
         * @param strTempLast takes in employee last name
         */
        Employee (int intTempID, int intTempDate, int intTempSalary, String strTempFirst, String strTempLast) {
            intIDNum = intTempID;
            intStartDate = intTempDate; 
            intSalary = intTempSalary;
            strFirstName = strTempFirst;
            strLastName = strTempLast; 
        }
        
    }
    /**
     * Clears all text fields and text areas
     */
    public void clearTextFields() {
        
        txtAOutput.setText(null); 
        txtFirstName.setText(null);
        txtLastName.setText(null);
        txtIDNum.setText(null);
        txtSalary.setText(null);
        txtStart.setText(null);
        
        
    }
    
    public EmployeeRecordsProgram() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblIDNum = new javax.swing.JLabel();
        txtIDNum = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lblStart = new javax.swing.JLabel();
        txtStart = new javax.swing.JTextField();
        btnList = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        scrollOutput = new javax.swing.JScrollPane();
        txtAOutput = new javax.swing.JTextArea();
        btnList1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelBackground.setBackground(new java.awt.Color(255, 153, 153));
        panelBackground.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Employee Records");
        panelBackground.add(lblTitle);
        lblTitle.setBounds(0, 6, 564, 43);

        lblIDNum.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblIDNum.setForeground(new java.awt.Color(255, 255, 255));
        lblIDNum.setText("ID #: ");
        panelBackground.add(lblIDNum);
        lblIDNum.setBounds(40, 70, 48, 22);

        txtIDNum.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        panelBackground.add(txtIDNum);
        txtIDNum.setBounds(180, 60, 150, 40);

        txtFirstName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        panelBackground.add(txtFirstName);
        txtFirstName.setBounds(180, 110, 150, 40);

        lblFirstName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName.setText("First Name:");
        panelBackground.add(lblFirstName);
        lblFirstName.setBounds(40, 120, 104, 22);

        lblLastName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Last Name:");
        panelBackground.add(lblLastName);
        lblLastName.setBounds(40, 170, 101, 22);

        txtLastName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        panelBackground.add(txtLastName);
        txtLastName.setBounds(180, 160, 150, 40);

        lblSalary.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblSalary.setText("Annual Salary:");
        panelBackground.add(lblSalary);
        lblSalary.setBounds(40, 220, 132, 22);

        txtSalary.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        panelBackground.add(txtSalary);
        txtSalary.setBounds(180, 210, 150, 40);

        lblStart.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblStart.setForeground(new java.awt.Color(255, 255, 255));
        lblStart.setText("Start Date:");
        panelBackground.add(lblStart);
        lblStart.setBounds(40, 270, 96, 22);

        txtStart.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        panelBackground.add(txtStart);
        txtStart.setBounds(180, 260, 150, 40);

        btnList.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });
        panelBackground.add(btnList);
        btnList.setBounds(410, 210, 120, 40);

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelBackground.add(btnAdd);
        btnAdd.setBounds(410, 110, 120, 40);

        btnRemove.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        panelBackground.add(btnRemove);
        btnRemove.setBounds(410, 160, 120, 40);

        txtAOutput.setColumns(20);
        txtAOutput.setRows(5);
        scrollOutput.setViewportView(txtAOutput);

        panelBackground.add(scrollOutput);
        scrollOutput.setBounds(40, 320, 490, 260);

        btnList1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnList1.setText("List");
        btnList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnList1ActionPerformed(evt);
            }
        });
        panelBackground.add(btnList1);
        btnList1.setBounds(440, 590, 120, 40);

        getContentPane().add(panelBackground);
        panelBackground.setBounds(0, 0, 570, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        
        //gets user input 
        int intEmpID = Integer.parseInt(txtIDNum.getText()); 
        int intAnnSalary = Integer.parseInt(txtSalary.getText()); 
        int intStartDate = Integer.parseInt(txtStart.getText()); 
        String strFirstName = txtFirstName.getText(); 
        String strLastName = txtLastName.getText(); 
        
        //clears text fields
        clearTextFields(); 
        
        //saves instance of class and adds it to the class arraylist
        Employee TempEmployeeInfo = new Employee(intEmpID, intStartDate, intAnnSalary, strFirstName, strLastName);
        employeeInfo.add(TempEmployeeInfo); 
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        
        //clears text fields 
        clearTextFields(); 
        
        //loops through the class arraylist and outputs all instances of the class and attributes into the text area
        for (int i = 0; i < employeeInfo.size(); i++) {
            txtAOutput.append(employeeInfo.get(i).strFirstName + " " 
                    + employeeInfo.get(i).strLastName
                    + "\tID #:" + employeeInfo.get(i).intIDNum
                    + "\tAnnual Salary: " + employeeInfo.get(i).intSalary
                    + "\tStart Date: " + employeeInfo.get(i).intStartDate
                    + "\n"); 
        }
   
    }//GEN-LAST:event_btnListActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        //gets user input for ID
        int intID = Integer.parseInt(txtIDNum.getText()); 
        
        //loops through and checks when the id number appears in the class arraylist and removes that instance of the class form the arraylist
        for (int i = 0; i < employeeInfo.size(); i++) {
            if (intID == employeeInfo.get(i).intIDNum) {
                employeeInfo.remove(i);    
            }
        }
        
        //clears text fields
        clearTextFields(); 
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnList1ActionPerformed
        System.exit(0); //closes gui window and program
    }//GEN-LAST:event_btnList1ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeRecordsProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeRecordsProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeRecordsProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeRecordsProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeRecordsProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnList1;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblIDNum;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JScrollPane scrollOutput;
    private javax.swing.JTextArea txtAOutput;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtIDNum;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtStart;
    // End of variables declaration//GEN-END:variables
}
