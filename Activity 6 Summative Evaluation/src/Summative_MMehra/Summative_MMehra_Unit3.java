/*
----------------------------------------------------------
Author: Mayank Mehra 
Date: Friday July 17, 2019
Purpose: Summative Program 
----------------------------------------------------------
Description: Create an application that analyzes a set of student marks.
----------------------------------------------------------
 */
package Summative_MMehra;
//Imported certain classes 
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

public class Summative_MMehra_Unit3 extends javax.swing.JFrame {
    //Declare global arrays and rounding format
    public ArrayList<Integer> ArrMarks = new ArrayList(); //creates an arraylist
    public int Levels[] = new int[5]; // creates an array with 5 elemnts 
    public DecimalFormat dfRound = new DecimalFormat("##.00"); //rounding format

    public Summative_MMehra_Unit3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblMarks = new javax.swing.JLabel();
        txtMarkInput = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtAreaforMarks = new javax.swing.JScrollPane();
        txtMarksOutput = new javax.swing.JTextArea();
        txtAreaforAnalyze = new javax.swing.JScrollPane();
        txtOutputAnalyze = new javax.swing.JTextArea();
        btnSort = new javax.swing.JButton();
        btnAnalyze = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        lblRestriction = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Marks Program");

        lblMarks.setText("Student Mark: ");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtMarksOutput.setEditable(false);
        txtMarksOutput.setColumns(20);
        txtMarksOutput.setLineWrap(true);
        txtMarksOutput.setRows(5);
        txtMarksOutput.setWrapStyleWord(true);
        txtAreaforMarks.setViewportView(txtMarksOutput);

        txtOutputAnalyze.setEditable(false);
        txtOutputAnalyze.setColumns(20);
        txtOutputAnalyze.setLineWrap(true);
        txtOutputAnalyze.setRows(5);
        txtOutputAnalyze.setWrapStyleWord(true);
        txtAreaforAnalyze.setViewportView(txtOutputAnalyze);

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnAnalyze.setText("Analyze");
        btnAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeActionPerformed(evt);
            }
        });

        lblRestriction.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblRestriction.setForeground(new java.awt.Color(255, 51, 51));
        lblRestriction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMarks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarkInput)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSort, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txtAreaforMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtAreaforAnalyze, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))))
                .addGap(64, 64, 64))
            .addComponent(Separator)
            .addComponent(lblRestriction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarks)
                    .addComponent(txtMarkInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRestriction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAreaforMarks)
                    .addComponent(txtAreaforAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSort)
                    .addComponent(btnAnalyze))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int intRestriction = Integer.parseInt(this.txtMarkInput.getText()); //stores mark inputed 
        if ((intRestriction >= 0) && (intRestriction <= 100)) { //makes sure that all numbers inputed are between 0-100
            ArrMarks.add(intRestriction); //adds number to array 
            txtMarkInput.setText(null); //gets ride of number entered in txtbox
            lblRestriction.setText(null); //gets ride of anything in the error label
            String strMarksList = ""; //stores a string in strMarkslist
            for (int i = 0; i < ArrMarks.size(); i++) { //loops and goes through each element in arraylist
                if ("".equals(strMarksList)) { //stores the first number/element entered into the array 
                    strMarksList = Integer.toString(ArrMarks.get(i)); 
                } else { //all the other numbers/elements are stored through this 
                    strMarksList = strMarksList + "\n" + ArrMarks.get(i);
                }
                txtMarksOutput.setText(strMarksList);// after all the numbers have been stored it is then outputed to the txt area
            }
        } else {
            lblRestriction.setText("Please enter a Grade Value"); //if any number <0 or >100 is entered 
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        Collections.sort(ArrMarks); //orders the array 
        String strMarksList = ""; //stores a string 
        for (int x = 0; x < ArrMarks.size(); x++) { //loops and goes through each element in arraylist
            if ("".equals(strMarksList)) { //stores first number in the array 
                strMarksList = Integer.toString(ArrMarks.get(x)); 
            } else { //stores the rest of the numbers in the array 
                strMarksList = strMarksList + "\n" + ArrMarks.get(x);
            }
            txtMarksOutput.setText(strMarksList); //outputs all the numbers
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeActionPerformed
        txtOutputAnalyze.setText(null); //gets ride of any past txt in the txtarea 
        txtOutputAnalyze.append("Class Average: " + dfRound.format(Average()) + "%\n"); //calls average method
        txtOutputAnalyze.append("Maximum Mark: " + MaxMark() + "%\n"); //calls maxmark method
        txtOutputAnalyze.append("Minimum Mark: " + MinMark() + "%\n"); //calls minmark method
        txtOutputAnalyze.append("Range of Marks: " + Range() + "%\n"); //cals range method
        
        Levels2(Levels);//saves all the levels into the array
        txtOutputAnalyze.append("\n Class Distrabution\n");
        txtOutputAnalyze.append("Numer at Level 4: " + Levels[4] + "\n"); //displays each level
        txtOutputAnalyze.append("Numer at Level 3: " + Levels[3] + "\n");
        txtOutputAnalyze.append("Numer at Level 2: " + Levels[2] + "\n");
        txtOutputAnalyze.append("Numer at Level 1: " + Levels[1] + "\n");
        txtOutputAnalyze.append("Numer at Level R: " + Levels[0] + "\n");
        

    }//GEN-LAST:event_btnAnalyzeActionPerformed
    private double Average() {
        double Average = 0;     
        for (int i = 0; i < ArrMarks.size(); i++) { //loops and goes through each element in arraylist
            Average = Average + (ArrMarks.get(i)); //adds up all the numbers in array 
        }        
        Average = Average / ArrMarks.size(); //divides the sum by the number of elements 
        return Average; //returns the average
    }

    private int MaxMark() {
        int MaxMark = 0;
        for (int i = 0; i < ArrMarks.size(); i++) { //loops and goes through each element in arraylist
            if (MaxMark < ArrMarks.get(i)) { //compares 2 numbers in the array and chooses the higher one
                MaxMark = ArrMarks.get(i); //stores the highest number
            } //loop makes it so that all the elements are checked and the highest number is found
        }
        return MaxMark;//returns the highest number
    }

    private int MinMark() {
        int MinMark = 100;
        for (int i = 0; i < ArrMarks.size(); i++) { //loops and goes through each element in arraylist
            if (MinMark > ArrMarks.get(i)) { //compares 2 numbers in the array and chooses the lower one
                MinMark = ArrMarks.get(i); //stores the lowest number
            }  //loop makes it so that all the elements are checked and the lowest number is found
        }
        return MinMark;//returns the lowest number
    }

    private int Range() {
        int Range = MaxMark() - MinMark();  //finds and subtracts the max and min number
        return Range;
    }

    private int[] Levels2(int ArrayInputed[]) {
        int Temp[] = {0, 0, 0, 0, 0}; //creates a temp array with 5 elements
        for (int i = 0; i < ArrMarks.size(); i++) {  //loops and goes through each element in arraylist
            if (ArrMarks.get(i) < 50) { // if the element being checked fits the restrcition 1 is added to the an elemenmt in the array 
                Temp[0]++; //1st element counts the level R grades
            } else if ((ArrMarks.get(i) >= 50) && (ArrMarks.get(i) < 60)) {
                Temp[1]++; //2nd element counts the level 1 grades
            } else if ((ArrMarks.get(i) >= 60) && (ArrMarks.get(i) < 70)) {
                Temp[2]++; //3rd element counts the level 2 grades
            } else if ((ArrMarks.get(i) >= 70) && (ArrMarks.get(i) < 80)) {
                Temp[3]++; //4th element counts the level 3 grades
            } else if (ArrMarks.get(i) >= 80) {
                Temp[4]++; //5nd element counts the level 4 grades
            } else {
                lblRestriction.setText("Error");//just incase something goes wrong 
            } 
        }
        ArrayInputed[0] = Temp[0]; //stores the level counted into the inputed array (due to the parameters)
        ArrayInputed[1] = Temp[1]; 
        ArrayInputed[2] = Temp[2]; 
        ArrayInputed[3] = Temp[3]; 
        ArrayInputed[4] = Temp[4]; 
        return ArrayInputed; //outputs the array that was inputed into the method with new values
    }

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
            java.util.logging.Logger.getLogger(Summative_MMehra_Unit3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Summative_MMehra_Unit3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Summative_MMehra_Unit3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Summative_MMehra_Unit3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Summative_MMehra_Unit3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAnalyze;
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JLabel lblRestriction;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane txtAreaforAnalyze;
    private javax.swing.JScrollPane txtAreaforMarks;
    private javax.swing.JTextField txtMarkInput;
    private javax.swing.JTextArea txtMarksOutput;
    private javax.swing.JTextArea txtOutputAnalyze;
    // End of variables declaration//GEN-END:variables

}