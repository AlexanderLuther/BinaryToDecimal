package com.hluther.gui;
import com.hluther.lexer.Lexer;
import com.hluther.parser.Parser;
import java.awt.Color;
import java.io.StringReader;
/**
 *
 * @author helmuth
 */
public class PrincipalFrame extends javax.swing.JFrame {
    
    private final String WHITESPACE = " ";
    private boolean error;
    
    public PrincipalFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void printValue(double value){
        if(!error){
            decimalTextLabel.setText(String.valueOf(value));
        }
    }
    
    public void printProcess(String process){
        if(!error){
            messageArea.setForeground(new Color(0,102,51));
            messageArea.setText(messageArea.getText() + process);
        }
    }
    
    public void printError(String msg){
        error = true;
        messageArea.setForeground(Color.red);
        messageArea.setText(messageArea.getText() + msg);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        octalTextArea = new javax.swing.JTextField();
        convertButton = new rojeru_san.RSButtonRiple();
        decimalTextLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        textAreaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Binario a Decimal");
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel2.setBackground(new java.awt.Color(54, 63, 69));
        jPanel2.setPreferredSize(new java.awt.Dimension(691, 100));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(54, 63, 69));
        jPanel7.setPreferredSize(new java.awt.Dimension(641, 15));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(54, 63, 69));
        jPanel9.setPreferredSize(new java.awt.Dimension(651, 120));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans Math", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Numero Decimal");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 149, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans Math", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Numero Binario");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, -1));

        octalTextArea.setBackground(new java.awt.Color(255, 255, 255));
        octalTextArea.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 0, 14)); // NOI18N
        octalTextArea.setForeground(new java.awt.Color(161, 66, 179));
        octalTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(161, 66, 179)));
        octalTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                octalTextAreaKeyTyped(evt);
            }
        });
        jPanel9.add(octalTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 150, -1));

        convertButton.setBackground(new java.awt.Color(161, 66, 179));
        convertButton.setText("Convertir");
        convertButton.setColorHover(new java.awt.Color(44, 44, 44));
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });
        jPanel9.add(convertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 30));

        decimalTextLabel.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 0, 14)); // NOI18N
        decimalTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        decimalTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decimalTextLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(161, 66, 179)));
        jPanel9.add(decimalTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 20));

        jPanel2.add(jPanel9, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(54, 63, 69));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(691, 200));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(20, 264));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(20, 264));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(691, 20));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(691, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        textAreaPanel.setBackground(new java.awt.Color(43, 43, 43));
        textAreaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(161, 66, 179), 1, true));
        textAreaPanel.setForeground(new java.awt.Color(161, 66, 179));
        textAreaPanel.setLayout(new java.awt.BorderLayout());

        messageArea.setEditable(false);
        messageArea.setBackground(new java.awt.Color(43, 43, 43));
        messageArea.setForeground(new java.awt.Color(0, 102, 51));
        jScrollPane1.setViewportView(messageArea);

        textAreaPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.add(textAreaPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(161, 66, 179));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fileMenu.setForeground(new java.awt.Color(255, 255, 255));
        fileMenu.setText("Archivo");
        fileMenu.setFont(new java.awt.Font("Noto Sans Math", 1, 14)); // NOI18N

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenu.setBackground(new java.awt.Color(161, 66, 179));
        exitMenu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        exitMenu.setForeground(new java.awt.Color(255, 255, 255));
        exitMenu.setText("Salir");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenu);

        jMenuBar1.add(fileMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        messageArea.setText("");
        error = false;
        try {  
            new Parser(new Lexer(new StringReader(octalTextArea.getText() + WHITESPACE), this), this).parse();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_convertButtonActionPerformed

    private void octalTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_octalTextAreaKeyTyped
        char c = evt.getKeyChar();
        if((c < '0' || c > '1') & (c < '.' || c > '.')) evt.consume();
        
    }//GEN-LAST:event_octalTextAreaKeyTyped

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple convertButton;
    private javax.swing.JLabel decimalTextLabel;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane messageArea;
    private javax.swing.JTextField octalTextArea;
    private javax.swing.JPanel textAreaPanel;
    // End of variables declaration//GEN-END:variables
}
