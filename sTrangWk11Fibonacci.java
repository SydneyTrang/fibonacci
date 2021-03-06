/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Filename: sTrangWk11Fibonacci
 *
 * Programmer: Sydney Trang
 *
 * Course: ICS4UE
 *
 * Date Started: Fri. Apr. 27/18
 *
 * Description: Using recursive functions to calculate Fibonacci numbers to the
 * nth term.
 *
 * Due Date: Sun. Apr. 29/18
 *
 * Modifications: Application can only calculate Fibonacci terms up to the 46th
 * term. Error handling for user that enters a term less than 0.
 *
 * Finished: Sun. May 6/18
 *
 */
public class sTrangWk11Fibonacci extends javax.swing.JFrame {

    /**
     * Creates new form sTrangWk11Fibonacci
     */
    public sTrangWk11Fibonacci() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        exampleTerms = new javax.swing.JLabel();
        nthTermInstructions = new javax.swing.JLabel();
        nthTermIn = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        nthTermOut = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        errorHandlingOut = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fibonacci Numbers");

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 255));
        title.setText("Fibonacci Numbers");

        exampleTerms.setText("The first nine fibonacci numbers are listed as follows: 1, 1, 2, 3, 5, 8, 13, 21, 34");

        nthTermInstructions.setText("Enter the fibonacci term that you would like to see:");

        calculate.setText("Find the Fibonacci Number");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(154, 154, 154))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculate))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nthTermOut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exampleTerms)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nthTermInstructions)
                                        .addGap(18, 18, 18)
                                        .addComponent(nthTermIn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(61, 61, 61))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(errorHandlingOut, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(title)
                .addGap(34, 34, 34)
                .addComponent(exampleTerms)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nthTermInstructions)
                    .addComponent(nthTermIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(calculate)
                .addGap(56, 56, 56)
                .addComponent(nthTermOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorHandlingOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* A method called when the exit button is pressed. */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /* A method called when the calculate button is pressed. */
    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        int iNthTerm = Integer.parseInt(nthTermIn.getText());
        if (iNthTerm < 0) {
            nthTermOut.setText(null);
            errorHandlingOut.setText("A value for a negative term cannot be calculated.");
        } else if (iNthTerm == 0) {
            //If user enters 0 for nth term to find
            nthTermOut.setText("Fibonacci term 0 is 0.");
            errorHandlingOut.setText(null);
        } else if (iNthTerm == 1 || iNthTerm == 2) {
            //If user enters 1 or 2 for nth term to find
            nthTermOut.setText("Fibonacci term " + iNthTerm + " is 1.");
            errorHandlingOut.setText(null);
        } else if (iNthTerm > 46) {
            //If user enters a term greater than 46
            nthTermOut.setText(null);
            errorHandlingOut.setText("The largest fibonacci term that can be calculated is 46.");
        } else {
            //Uses recursive function for determining fibonacci number of a term > 2 and <= 46
            int iFirstFibNum = 0; //Beginning of Fibonacci sequence
            int iSecondFibNum = 1; //Second number of Fibonacci sequenece
            int iNextFibNum = iFirstFibNum + iSecondFibNum; //Caculates the third number of Fibonacci sequence
            int iTermCounter = 0; //Count the number of recursions in the calculateNthTerm method
            calculateNthTerm(iNthTerm, iTermCounter, iFirstFibNum, iSecondFibNum, iNextFibNum);
            errorHandlingOut.setText(null);
        }
    }//GEN-LAST:event_calculateActionPerformed

    /* A method called when the calculate button is pressed and when the nthTerm entered is > 2 and <= 46. */
    public void calculateNthTerm(int iFindNthTerm, int iTermCounter, int iFirstFibNum, int iSecondFibNum, int iNextFibNum) {
        if (iFindNthTerm == 2) { //Stops recursion at the 2nd term
            nthTermOut.setText("Fibonacci term " + (iTermCounter + 2) + " is " + iNextFibNum);
                //Add 2 to iTermCounter to properly show the term that the user was looking for
                //(put a 2 instead of iFindNthTerm because will always be 2)
            errorHandlingOut.setText(null);
        } else {
            iFindNthTerm--;
            iTermCounter++;
            iFirstFibNum = iSecondFibNum;
            iSecondFibNum = iNextFibNum;
            iNextFibNum = iFirstFibNum + iSecondFibNum;
            calculateNthTerm(iFindNthTerm, iTermCounter, iFirstFibNum, iSecondFibNum, iNextFibNum);
        }
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
            java.util.logging.Logger.getLogger(sTrangWk11Fibonacci.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sTrangWk11Fibonacci.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sTrangWk11Fibonacci.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sTrangWk11Fibonacci.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sTrangWk11Fibonacci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JTextField errorHandlingOut;
    private javax.swing.JLabel exampleTerms;
    private javax.swing.JButton exit;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nthTermIn;
    private javax.swing.JLabel nthTermInstructions;
    private javax.swing.JTextField nthTermOut;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
