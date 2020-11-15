/*
 ----------------------------------------------------------
 Author: Mayank Mehra 
 Date: Friday July 22, 2019
 Purpose: Final Project
 ----------------------------------------------------------
 Description: Created a Math scenario game for Grade 5 students 
 Frame #1 
 ----------------------------------------------------------
 */
package MathProgram_MMehra;

import java.awt.Color; //imports

public class Frame1_StartingMenuFrame extends javax.swing.JFrame {

    public Frame1_StartingMenuFrame() {
        initComponents();
        jPanel1.setBackground(new Color(0,0,0,100)); //makes panel transparent 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        btnStartGame = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(852, 660));
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("The Number Filled Algebra Adventure");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 90, 860, 43);

        lblDescription.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Description");
        getContentPane().add(lblDescription);
        lblDescription.setBounds(0, 140, 860, 22);

        btnStartGame.setText("Start Game");
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });
        getContentPane().add(btnStartGame);
        btnStartGame.setBounds(200, 490, 440, 40);

        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(7);
        jTextArea1.setText("This is the number filled adventure game. The game is made up of 5 scenarios each with a different type of basic algebra word problem. Your goal is to progress through the stories and questions in the scenarios and get all the answers correct. For the first two scenarios you will be provided with a hint that can be used if necessary and will show you how to break the questions down into steps. \nThere is a total of 6 points/marks and 5 questions to be answered. \nGood Luck! \nClick Start Game to start crunching the numbers!\n");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 30, 480, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(150, 200, 560, 230);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/mayank/Downloads/sunrise-3167626_960_720.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -10, 940, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        new Frame2_ScenarioInputFrame().setVisible(true); //makes second fram visble 
        setVisible(false); //closes this frame 
    }//GEN-LAST:event_btnStartGameActionPerformed

 
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
            java.util.logging.Logger.getLogger(Frame1_StartingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1_StartingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1_StartingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1_StartingMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1_StartingMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartGame;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
