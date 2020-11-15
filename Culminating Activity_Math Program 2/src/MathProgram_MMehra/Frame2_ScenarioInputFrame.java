/*
 ----------------------------------------------------------
 Author: Mayank Mehra 
 Date: Friday July 22, 2019
 Purpose: Final Project
 ----------------------------------------------------------
 Description: Created a Math scenario game for Grade 5 students 
 Frame #2
 ----------------------------------------------------------
 */
package MathProgram_MMehra;

public class Frame2_ScenarioInputFrame extends javax.swing.JFrame {

    public int Mark[] = new int[7];//global array with 7 elements (0 = Wrong Answers, 1-5 = Answers for questions 1-5, 6 = Total correct Answers)

    public Frame2_ScenarioInputFrame() {
        initComponents();
        btnResults.setEnabled(false);//closes these three buttons once the frame starts
        btnEnter.setEnabled(false);
        btnHint.setEnabled(false); 
        txtArea.append("Hi and Welcome to the Number Filled Algebra Adventure"
                + "\nChoose your scenario. \nLet the story begin...\n\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblAnswer = new javax.swing.JLabel();
        txtPane = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtAnswer = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnChoose = new javax.swing.JButton();
        cbScenario = new javax.swing.JComboBox();
        btnResults = new javax.swing.JButton();
        btnHint = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(862, 680));
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 0, 860, 60);

        lblAnswer.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAnswer.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer.setText("Answer: ");
        getContentPane().add(lblAnswer);
        lblAnswer.setBounds(130, 540, 110, 30);

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setLineWrap(true);
        txtArea.setRows(5);
        txtArea.setWrapStyleWord(true);
        txtPane.setViewportView(txtArea);

        getContentPane().add(txtPane);
        txtPane.setBounds(27, 94, 799, 384);

        txtAnswer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnswer);
        txtAnswer.setBounds(220, 540, 520, 37);

        btnEnter.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter);
        btnEnter.setBounds(520, 580, 220, 40);

        btnExit.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnExit.setText("Exit Program");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(630, 10, 220, 40);

        btnChoose.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        getContentPane().add(btnChoose);
        btnChoose.setBounds(610, 490, 220, 40);

        cbScenario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Scenario 1", "Scenario 2", "Scenario 3", "Scenario 4", "Scenario 5" }));
        getContentPane().add(cbScenario);
        cbScenario.setBounds(360, 490, 250, 40);

        btnResults.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnResults.setText("See Results ");
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });
        getContentPane().add(btnResults);
        btnResults.setBounds(30, 610, 220, 40);

        btnHint.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnHint.setText("Get Hint");
        btnHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHintActionPerformed(evt);
            }
        });
        getContentPane().add(btnHint);
        btnHint.setBounds(30, 50, 220, 40);

        Background.setIcon(new javax.swing.ImageIcon("/Users/mayank/Downloads/sunrise-3167626_960_720.jpg")); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(-10, -40, 920, 740);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

/*-----------------------------------------------------------------------------------------------------------------*/
    
    private void txtAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerActionPerformed

    }//GEN-LAST:event_txtAnswerActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        if (cbScenario.getSelectedItem().equals("Scenario 1")) { //uses combo box to call the answer methods for Scenario 1-5 
            Scenario1Answer();//methods - find answers for the scenario
            cbScenario.removeItemAt(0); //gets ride of the scenario from the combo box
        } else if (cbScenario.getSelectedItem().equals("Scenario 2")) {
            Scenario2Answer();
            cbScenario.removeItemAt(0);
        } else if (cbScenario.getSelectedItem().equals("Scenario 3")) {
            Scenario3Answer();
            cbScenario.removeItemAt(0);
        } else if (cbScenario.getSelectedItem().equals("Scenario 4")) {
            Scenario4Answer();
            cbScenario.removeItemAt(0);
        } else if (cbScenario.getSelectedItem().equals("Scenario 5")) {
            Scenario5Answer();
            cbScenario.removeItemAt(0);
            txtAnswer.setText(null); //gets ride of text in txtbox
            btnResults.setEnabled(true); //turns on the result btn
            lblTitle.setText("Check Results"); //changes title
        } else {
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); //exit
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        if (cbScenario.getSelectedItem().equals("Scenario 1")) { //uses combo box to call scenario methods and display story
            Scenario1(); //calls method
            btnEnter.setEnabled(true); //turns on enter btn to answer the question in scenario
            btnChoose.setEnabled(false); //turns of this button
            btnHint.setEnabled(true); //turns on hint button for the first two scenarios
        } else if (cbScenario.getSelectedItem().equals("Scenario 2")) {
            Scenario2();
            btnEnter.setEnabled(true);
            btnChoose.setEnabled(false);
            btnHint.setEnabled(true); 
        } else if (cbScenario.getSelectedItem().equals("Scenario 3")) {
            Scenario3();
            btnEnter.setEnabled(true);
            btnChoose.setEnabled(false);
            btnHint.setEnabled(false); 
        } else if (cbScenario.getSelectedItem().equals("Scenario 4")) {
            Scenario4();
            btnEnter.setEnabled(true);
            btnChoose.setEnabled(false);
            btnHint.setEnabled(false); 
        } else if (cbScenario.getSelectedItem().equals("Scenario 5")) {
            Scenario5();
            btnEnter.setEnabled(true);
            btnChoose.setEnabled(false);
            btnHint.setEnabled(false); 
        } else {

        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed
        txtArea.setText(null); //gets ride of any txt in txtArea
        lblTitle.setText("Results"); //changes txt in label
        txtArea.append("Results"); //changes txt in txtArea
        for (int i = 1; i < 5; i++) { //for loop to output the marks for each scenario 
            txtArea.append("\nQuestion " + i + ":" + Mark[i] + "/1"); //marks for each qscenario up till 4
            Mark[6] = Mark[6] + Mark[i]; //added into element 6 to find total
        }
        int intTotal = Mark[6] + Mark[5]; //add the marks for the 5th scenario (seperate as this question is worth 2 and not /1
        txtArea.append("\nQuestion 5: " + Mark[5] + "/2\n");
        txtArea.append(Mark[0] + "/6 Questions Wrong!\n"); //displays # of questions wrong 
        txtArea.append("Your total mark is: " + intTotal + "/6\n"); //displays number of questions right

        if ((intTotal == 6) || (intTotal == 5)) { //outputs a phrase and image mattering on your mark
            txtArea.append("Amazing Job your ready to pass any test!\n");
            DogeFace();
        } else if ((intTotal == 4) || (intTotal == 3)) {
            txtArea.append("Good Job! Make sure you review once or twice again\n");
            KeanuReeves();
        } else if ((intTotal == 2) || (intTotal == 1)) {
            txtArea.append("Were you even trying? You definetly need to study for the Next test\n");
            PikachuShockedFace();
        } else {
            txtArea.append("Spend the next few days reviewing your Math. Your going to need it!\n");
            What();
        }
        btnResults.setEnabled(false); //closes result btn
    }//GEN-LAST:event_btnResultsActionPerformed

    private void btnHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHintActionPerformed
        if (cbScenario.getSelectedItem().equals("Scenario 1")) { //if combo box is on scenario 1 it displays this hint 
            txtArea.append("\n\nHelpful Steps\n1. How many cards did you gain in the first two years?(Don’t subtract any cards yet)\n"
                    + "2.How many cards did you lose in the first two years?\n"
                    + "3.Now, subtract the cards lost from the cards gained, to find the total cards from the first two years of collecting; \n"
                    + "4.Now find the amount of cards gained? (Hint: subtract total from the first 2 years from total of the third year)\n\n");
        } else if (cbScenario.getSelectedItem().equals("Scenario 2")) { //if combo box is on scenario 2 it displays this hint 
            txtArea.append("\n\nHelpful Steps\n1. How many people are there in all the families combined?\n"
                    + "2. How many tickets would you need if you use the buy one get one deal to purchase tickets?\n"
                    + "(Hint: divide the total number of people by 2 tickets)\n\n");
        } else {      //hints are only provided for first two scenarios
        }

    }//GEN-LAST:event_btnHintActionPerformed

/*-----------------------------------------------------------------------------------------------------------------*/
    
    private void Scenario1() { //Scenario # methods display that scenario
        txtArea.setText(null); //gets ride of anything in txtArea
        txtAnswer.setText(null); //gets ride of anything in txtArea
        lblTitle.setText("Scenario 1"); //changes title and displays txt in txt area
        txtArea.append("    You woke up at 2 pm,  to the sound of your mom yelling at you to wake up. "
                + "It was summer and you loved sleeping in but your parents thought otherwise. You "
                + "got out of your bed began to walk to the washroom when you almost stumbled over a "
                + "folder filled with Baseball cards.\n\n");
        txtArea.append("    You had been collecting baseball cards for the past 3 years. The first year he had "
                + "approximately 45 cards but lost 4 of them. By the second year, he gained 60 more cards but "
                + "lost 10 of them to water damage. In the last year, he got his job and started buying way "
                + "more baseball cards. He now has a total of 300 cards. How many cards did he get this year?\n\n"
                + "Helpful Tip - Break the question down\n\nAnswer: ");

    }

    private void Scenario1Answer() { //Scenario # Answer are methods to see if the input is the correct answer for the specific scenario
        String Answer = txtAnswer.getText(); //stores answer inputed
        if (Answer.equals("209")) { //if correct answer is inputed
            txtArea.append("\n" + Answer + "\nYou got the Correct Answer!!\nChoose the next scenario"); 
            Mark[1]++; //adds 1 to the 2nd elemnt in array (1 = Question 1 mark)
            btnEnter.setEnabled(false); // turns of enter button
        } else if (Answer.equals("")) { //if nothing is entered
            txtArea.append("\nPlease enter in a a proper value\n");
        } else { //if any answer ofther then a blank or right answer is inputed
            txtArea.append("\n" + Answer + "\nWrong answer please Move on to the next scenario");
            btnEnter.setEnabled(false);
            Mark[0]++; //adds 1 to the 1st elements (0 = wrong answers)
        }
        btnChoose.setEnabled(true);//turns on the choose scenario btn for the user to move on

    }

    private void Scenario2() {
        txtArea.setText(null);
        txtAnswer.setText(null);
        lblTitle.setText("Scenario 2");
        txtArea.append("     After counting all the baseball cards in your collection your parents call you down "
                + "to discuss the upcoming trip to Hawaii that your family and 4 other families would be going "
                + "on. Each family has 4 people in them. Your family is responsible for buying all the plane "
                + "tickets because your dad's company is getting them a buy one and get one free ticket deal "
                + "for every single ticket they buy. How many tickets to Hawaii does your dad have to buy?"
                + "\n\nAnswer: ");

    }

    private void Scenario2Answer() {
        String Answer = txtAnswer.getText();
        if (Answer.equals("10")) {
            txtArea.append("\n" + Answer + "\nYou got the Correct Answer!!\nChoose the next scenario");
            Mark[2]++;
            btnEnter.setEnabled(false);
        } else if (Answer.equals("")) {
            txtArea.append("\nPlease enter in a a proper value\n");
        } else {
            txtArea.append("\n" + Answer + "\nWrong answer please move on to the next scenario");
            btnEnter.setEnabled(false);
            Mark[0]++;
        }
        btnChoose.setEnabled(true);
    }

    private void Scenario3() {
        txtArea.setText(null);
        txtAnswer.setText(null);
        lblTitle.setText("Scenario 3");
        txtArea.append("     Your father withdrew 5000 dollars from his bank account today. He uses 3450 to buy "
                + "all the plane tickets. The remaining money he splits in half; he decides to donate 1 half of it to "
                + "charity and keep the rest of it for later. How much money will your dad have left after the donation? "
                + "\n\nAnswer: ");

    }

    private void Scenario3Answer() {
        String Answer = txtAnswer.getText();
        if (Answer.equals("775")) {
            txtArea.append("\n" + Answer + "\nYou got the Correct Answer!!\nChoose the next scenario");
            Mark[3]++;
            btnEnter.setEnabled(false);
        } else if (Answer.equals("")) {
            txtArea.append("\nPlease enter in a a proper value\n");
        } else {
            txtArea.append("\n" + Answer + "\nWrong answer please move on to the next scenario");
            btnEnter.setEnabled(false);
            Mark[0]++;
        }
        btnChoose.setEnabled(true);
    }

    private void Scenario4() {
        txtArea.setText(null);
        txtAnswer.setText(null);
        lblTitle.setText("Scenario 4");
        txtArea.append("     It was almost 2 o’clock now and you still didn't have breakfast yet, so you go to the "
                + "pantry and grab your favourite cereal box. All to find out that you only had enough for today. "
                + "You usually always start your day off with your favourite cereal, so you tell your mom to go grab "
                + "some more cereal. Each box for you lasts about 2 days. How many boxes would your mom need to buy "
                + "for you, so that you have enough stockpiled for 4 weeks? "
                + "\n\nAnswer: ");

    }

    private void Scenario4Answer() {
        String Answer = txtAnswer.getText();
        if (Answer.equals("14")) {
            txtArea.append("\n" + Answer + "\nYou got the Correct Answer!!\nChoose the next scenario");
            Mark[4]++;
            btnEnter.setEnabled(false);
        } else if (Answer.equals("")) {
            txtArea.append("\nPlease enter in a a proper value\n");
        } else {
            txtArea.append("\n" + Answer + "\nWrong answer! Please move on to the next scenario");
            btnEnter.setEnabled(false);
            Mark[0]++;
        }
        btnChoose.setEnabled(true);
    }

    private void Scenario5() {
        txtArea.setText(null);
        txtAnswer.setText(null);
        lblTitle.setText("Scenario 5");
        txtArea.append("     The day goes by and its finally dinner time. Since its friday your family is going out for"
                + " food, your family decides to go get some pizza. You guys get 1 extra large pizza with 12 slices "
                + "for about $18. Your dad sees two new pizzas on the menu and he wants to try both, so he bought 2 "
                + "more small pizzas with 6 slices each for about $8 each. Before you were about to pay your Mom "
                + "remembered that you guys had a coupon for 5 dollars of any extra large pizza. How many slices of "
                + "pizza will you guys have and how much did it cost for the 3 pizzas."
                + "\n\nAnswer: ");
        txtAnswer.setText("Please input answer like this; $Dollar & # Slices");

    }

    private void Scenario5Answer() {
        String Answer = txtAnswer.getText();
        if (Answer.toLowerCase().equals("$29 & 24 slices")) { //changes input to all lowercase to avoid more issues with human error
            txtArea.append("\n" + Answer.toLowerCase() + "\nYou got the Correct Answer!!\nCheck your Results!");
            Mark[5]++; //5th question is worth 2 points thus 2 is added to element 5 if correct
            Mark[5]++;
            btnEnter.setEnabled(false);
        } else if (Answer.equals("")) {
            txtArea.append("\nPlease enter in a a proper value\n");
        } else if (Answer.equals("Please input answer like this; $Dollar & # Slices")) {
            txtArea.append("\nPlease enter in a a proper value\n");
        }
        else {
            txtArea.append("\n" + Answer + "\nWrong answer! Please Check your Results now");
            btnEnter.setEnabled(false);
            Mark[0]++; //5th question is worth 2 points thus 2 is added to element 0 if wrong
            Mark[0]++;
        }
        btnChoose.setEnabled(false); //turns off btnChoose (there are no more scenarios left
        txtAnswer.setText(null); //gets ride of anything in txtAnswer
    }
    
/*-----------------------------------------------------------------------------------------------------------------*/

    private void DogeFace() { //fun imagies added as its is a program for grade 5 students)
        txtArea.append("░░░░░░░░░▄░░░░░░░░░░░░░░▄\n"
                + "░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌\n"
                + "░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐\n"
                + "░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐\n"
                + "░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐\n"
                + "░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌\n"
                + "░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌\n"
                + "░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐\n"
                + "░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌\n"
                + "░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌\n"
                + "▌▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐\n"
                + "▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌\n"
                + "▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐\n"
                + "░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌\n"
                + "░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐\n"
                + "░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌\n"
                + "░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀\n"
                + "░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀\n"
                + "░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀\n"
                + "Doge is proud of you");
    }

    private void KeanuReeves() {
        txtArea.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                + "⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀\n"
                + "⠀⠀⠀⠀⣰⣿⣿⣿⣿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣧⢀⠀⠀⠀⠀\n"
                + "⠀⠀⠀⣿⣿⣿⠋⠀⠀⠀⠀⠀⠙⠀⠙⣿⣿⣿⣷⢳⢀⠀⠀⠀\n"
                + "⠀⠀⣠⣿⣿⣿⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⢀\n"
                + "⠀⠀⣸⣿⣿⣿⠸⠀⠀⠀⠒⠒⠒⠐⠀⠀⢿⣿⣿⣿⣿⣿⠀⠀\n"
                + "⠀⣴⣿⣿⣿⡿⠀⠒⣋⣙⡒⢰⠀⠤⣖⠒⢾⣿⣿⣿⣿⣧⠀⠀\n"
                + "⢺⣿⣿⣿⣿⢀⠀⠀⠉⠉⠉⠸⠀⡇⠉⠉⠀⢿⣿⣿⣿⣄⠀⠀\n"
                + "⠀⠙⣿⣿⣧⢻⠀⠀⠀⠀⠀⠠⠀⠰⠀⠀⠀⣸⠸⣿⣿⠿⠰⠀\n"
                + "⠀⠀⠀⠹⣿⣿⣿⣷⠀⡠⠙⣲⣔⣅⢡⣰⣷⣿⣿⣿⣧⠀⠀⠀\n"
                + "⠀⠀⠀⣼⣿⣿⣿⣿⠀⡿⠭⠭⠭⠭⢿⠀⣿⢻⣿⣿⠃⠀⠀⠀\n"
                + "⠀⠀⠀⠙⠛⣿⢻⠹⣿⠐⠙⠛⠟⠉⢀⣴⡟⢿⣿⡏⠀⠀⠀⠀\n"
                + "⠀⠀⠀⠀⠀⠀⡟⠀⠀⠻⣦⣤⣶⠾⠋⠀⠀⠁⡦⢄⢀⠀⠀⠀\n"
                + "⠀⠀⠀⠀⡠⠁⡇⠑⢄⠀⠀⠀⠀⠀⠀⠔⠀⠀⠁⠀⠀⠀⠉⠁\n"
                + "⠀⠔⠊⠁⠀⠀⣇⠀⠀⠀⠑⡤⠤⢎⠁⠀⠀⡘⠀⠀⠀⠀⠀⠀\n"
                + "⠀⠀⠀⠀⠀⠀⢢⠠⠀⡠⢆⠀⠀⡠⠙⢄⠀⡸⠀⠀⠀⠀⠀⠀ \n"
                + "Keanu thinks you did a satisfactory job. Try just a little bit harder next time!");

    }

    private void PikachuShockedFace() {
        txtArea.append("⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⣠⣤⣶⣶\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢰⣿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣀⣀⣾⣿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⡏⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠁⠀⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠙⠿⠿⠿⠻⠿⠿⠟⠿⠛⠉⠀⠀⠀⠀⠀⣸⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣴⣿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⢰⣹⡆⠀⠀⠀⠀⠀⠀⣭⣷⠀⠀⠀⠸⣿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠈⠉⠀⠀⠤⠄⠀⠀⠀⠉⠁⠀⠀⠀⠀⢿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⢾⣿⣷⠀⠀⠀⠀⡠⠤⢄⠀⠀⠀⠠⣿⣿⣷⠀⢸⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⡀⠉⠀⠀⠀⠀⠀⢄⠀⢀⠀⠀⠀⠀⠉⠉⠁⠀⠀⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿\n"
                + "Pikachu is Shocked (Pun intended) at your mark");
    }

    private void What() {
        txtArea.append("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠛⠉⠉⠉⠉⠉⠉⠛⠻⢿⣿⣿⣿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿\n"
                + "⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿\n"
                + "⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿\n"
                + "⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n"
                + "⣿⣿⣿⣿⠀⠀⠀⠀⠀⢠⡴⠶⠶⠶⠶⠄⠀⠀⠀⠀⠀⠴⠶⠶⠤⠀⢠⡿\n"
                + "⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿\n"
                + "⣿⣿⢋⣽⣿⠷⠀⠀⠀⡞⠁⠀⢀⠈⠉⠦⠀⠀⢠⣠⡞⠉⡉⠉⠳⠄⣼⣿\n"
                + "⣿⣿⢸⣿⣿⡇⠀⠀⠀⠳⣄⡀⠀⢀⡠⠃⠀⠀⣼⠉⢧⣀⣀⣠⠴⠀⣿⣿\n"
                + "⠇⢻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⠀⣿⡆⠀⠈⠁⠀⠀⢀⣿⣿\n"
                + "⠀⢸⣿⣷⣦⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⢸⣿⣿\n"
                + "⠀⢸⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⢀⣿⣿⣿\n"
                + "⣶⣾⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⢠⣤⣤⣄⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠙⠛⠋⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿\n"
                + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣀⣀⣀⣠⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿\n"
                + "IS THAT EVEN POSSIBLE?!?!?!?");

    }
    
/*-----------------------------------------------------------------------------------------------------------------*/
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
            java.util.logging.Logger.getLogger(Frame2_ScenarioInputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2_ScenarioInputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2_ScenarioInputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2_ScenarioInputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHint;
    private javax.swing.JButton btnResults;
    private javax.swing.JComboBox cbScenario;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JScrollPane txtPane;
    // End of variables declaration//GEN-END:variables
}
