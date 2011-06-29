package org.jaytter.ui.panels.login.accounts;

import java.awt.Cursor;
import javax.swing.JFrame;
import org.jaytter.model.user.TwitterAccount;
import org.jaytter.ui.manager.JaytterUIManager;
import org.jaytter.ui.manager.account.JaytterUIAccountManager;

public class SingleAccountLoginPanel extends javax.swing.JPanel {
    
    private JFrame parentFrame;

    /** Creates new form SingleAccountLoginPanel */
    public SingleAccountLoginPanel(JFrame parentFrame, TwitterAccount account) {
        initComponents();
        this.parentFrame = parentFrame;
        this.account = account;
        this.accountName.setText(account.getName());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        accountName = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaytter/images/intents-assets/intents-assets/bird/bird_gray/bird_32_gray.png"))); // NOI18N
        add(jLabel1);

        accountName.setFont(accountName.getFont().deriveFont(accountName.getFont().getStyle() | java.awt.Font.BOLD));
        add(accountName);

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        add(buttonLogin);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        JaytterUIManager.getInstance().startUIForAccount( account );
        parentFrame.dispose();
        setCursor( Cursor.getDefaultCursor() );
    }//GEN-LAST:event_buttonLoginActionPerformed
    private TwitterAccount account;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel accountName;
    public javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
