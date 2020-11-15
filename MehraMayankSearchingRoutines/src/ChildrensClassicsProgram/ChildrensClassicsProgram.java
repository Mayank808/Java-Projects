
package ChildrensClassicsProgram;

import java.io.*; 
import java.util.ArrayList;

/**
----------------------------------------------------------
Author: Mayank Mehra
Date: Saturday August 19, 2020
Purpose: Children Classics Program
----------------------------------------------------------
Description of code : Saves numbers and book titles in a text file into two arrays 
* then based on the number the user inputs the book title associated with that number will be ourputed
--------------------------------------------------------
 */

public class ChildrensClassicsProgram extends javax.swing.JFrame {
    
    public ChildrensClassicsProgram() {
        initComponents();
    }
    
    /**
     * Runs the array through a binary search and returns a boolean value based on whether the inputed value is in the array
     * @param strTempArrList takes in a string array 
     * @param intLeft takes in the left most value of the array which at the start will be 0 
     * @param intRight takes in the right most value of the array which at the start will be the length of the array 
     * @param strInput takes in the user input that is being checked in the array number 
     * @return returns a boolean based on whether the inputed value is in the array or not
     */
    public boolean binarySearch(String [] strTempArrList, int intLeft, int intRight, String strInput) {
        //declares variables 
        int intMiddleIndex, intCompareStrings; 
        
        //returns false once the whole array has been checked and the value doesnt exist within the array 
        if (intLeft > intRight) return false; 
        
        //finds the middle index within the array 
        intMiddleIndex = (intLeft + intRight) / 2;
        
        //compares the string input with the middle index element within the array to see if they are equal 
        intCompareStrings = strInput.compareTo(strTempArrList[intMiddleIndex]); 
        
        //the value stored in intCompareStrings will be set to 0 by the compareTo command when the two values are the same
        if (intCompareStrings == 0) return true;
        
        //the value stored in intCompareStrings will be less than 0 by the compareTo command when the input value is less then the middle index element in the 
        if (intCompareStrings < 0) {
            return binarySearch(strTempArrList, intLeft, intMiddleIndex - 1 , strInput); 
        } else { //the value stored in intCompareStrings will be greater than 0 by the compareTo command when the inputed value is greateer then the middle index element in the array
            return binarySearch(strTempArrList, intLeft, intMiddleIndex + 1 , strInput); 
        }
    
    }
    
    /**
     * Runs the array through a linear search and returns a boolean value based on whether the inputed value is in the array
     * @param strTempArrList takes in a string array 
     * @param strInput takes in the user input that is being checked in the array number 
     * @return returns a boolean based on whether the inputed value is in the array or not
     */
    public boolean linearSearch(String [] strTempArrList, String strInput) {
        //loops through the inputed arraylist and checks if the value in the array is equal to the inputed value
        for (int i = 0; i < strTempArrList.length; i++) {
            if (strTempArrList[i].equals(strInput)) { //if the inputed value is equal to the element in index i in the array the method returns true as the value is in the array
                return true; 
            }
        }
        //returns false if the input is not in the array
        return false; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        panelBackground = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        txtLinear = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        lblRefNum = new javax.swing.JLabel();
        txtRefNum = new javax.swing.JTextField();
        txtBinary = new javax.swing.JTextField();
        lblBinary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 3, 48)); // NOI18N
        lblTitle.setText("Childrens Classic");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(97, 0, 429, 82);

        panelBackground.setBackground(new java.awt.Color(153, 255, 255));
        panelBackground.setLayout(null);

        lblSearch.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblSearch.setText("Linear Search:");
        panelBackground.add(lblSearch);
        lblSearch.setBounds(20, 250, 140, 22);

        txtLinear.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        panelBackground.add(txtLinear);
        txtLinear.setBounds(160, 240, 470, 35);

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        panelBackground.add(btnFind);
        btnFind.setBounds(250, 170, 130, 40);

        lblRefNum.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblRefNum.setText("Enter The Reference #: ");
        panelBackground.add(lblRefNum);
        lblRefNum.setBounds(98, 112, 217, 22);

        txtRefNum.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        panelBackground.add(txtRefNum);
        txtRefNum.setBounds(321, 106, 228, 35);

        txtBinary.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        panelBackground.add(txtBinary);
        txtBinary.setBounds(160, 290, 470, 35);

        lblBinary.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblBinary.setText("Binary Search: ");
        panelBackground.add(lblBinary);
        lblBinary.setBounds(20, 300, 140, 22);

        getContentPane().add(panelBackground);
        panelBackground.setBounds(0, 0, 640, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        
        //declared variables and gets user input
        int intTxtCounter = 0, intNamesCounter = 0, intRefNumCounter = 0; 
        String strInputRefNum = txtRefNum.getText(); 
        boolean isLinearSearch, isBinarySearch; 
        
        //declares arrays for the names and referenece numbers
        String [] strNamesArr = new String[22]; 
        String [] strRefNumArr = new String[22]; 
        
        //goes through the text file and saves the strings into the correct array using counters 
        try {
            FileReader fr = new FileReader("Booklist.txt"); 
            BufferedReader br = new BufferedReader(fr); 
            String strLineIn = br.readLine(); 
            
            //runs the loop as long as their is no empty line 
            while (strLineIn != null) {
                //if line is even then the reference number is saved (counter counts number of lines)
                if (intTxtCounter % 2 == 0) {
                    //counter made to help add values into the next empty position in the array 
                    strRefNumArr[intNamesCounter] = strLineIn;   
                    //saves next line in file 
                    strLineIn = br.readLine(); 
                    intNamesCounter += 1; 
                
                //if line is odd the book title is saved
                } else {
                    //counter made to help add values into the next empty position in the array 
                    strNamesArr[intRefNumCounter] = strLineIn; 
                    //saves next line in file 
                    strLineIn = br.readLine(); 
                    intRefNumCounter += 1; 

                }
                
                intTxtCounter += 1; 
            }
            
            br.close(); 
            
            
        } catch (IOException e) {
            
        }
         
        //calls the methods for linear search and binary search and saves the boolean values
        isLinearSearch = linearSearch (strRefNumArr, strInputRefNum); 
        isBinarySearch = binarySearch (strRefNumArr, 0, strRefNumArr.length, strInputRefNum); 
        
        //if the inputed reference numb is in the array the book titile is outputed
        if (isLinearSearch == true) {
            //loops through ref num array
            for (int i = 0; i < strRefNumArr.length; i++) {
                //if the element in index i is equal to the user inputed Ref number the book name in index i is outputed
                if (strRefNumArr[i].equals(strInputRefNum)) {
                    txtLinear.setText(strNamesArr[i]); 
                }
            }
        } else { //tells user that the number does not exist
            txtLinear.setText("Reference Number Does not exist!");
        }
        
        //if the inputed reference number is in the array the book title is outputed
        if (isBinarySearch == true) {
            //loops through ref num array
            for (int i = 0; i < strRefNumArr.length; i++) {
                //if the element in index i is equal to the user inputed Ref number the book name in index i is outputed
                if (strRefNumArr[i].equals(strInputRefNum)) {
                    txtBinary.setText(strNamesArr[i]);
                }
            }
        } else {//tells user that the number does not exist
            txtBinary.setText("Reference Number Does not exist!");
        }

        
        
    }//GEN-LAST:event_btnFindActionPerformed

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
            java.util.logging.Logger.getLogger(ChildrensClassicsProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChildrensClassicsProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChildrensClassicsProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChildrensClassicsProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChildrensClassicsProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel lblBinary;
    private javax.swing.JLabel lblRefNum;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JTextField txtBinary;
    private javax.swing.JTextField txtLinear;
    private javax.swing.JTextField txtRefNum;
    // End of variables declaration//GEN-END:variables
}
