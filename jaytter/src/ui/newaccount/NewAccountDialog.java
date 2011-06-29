/*
 *  Copyright (C) 2011 joao-nb
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * NewAccountDialog.java
 *
 * Created on 13/06/2011, 12:04:34
 */
package ui.newaccount;

import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jaytter.ConsumerTokens;
import models.Account;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import ui.core.InitWindow;
import util.OpenDefaultBrowser;

/**
 *
 * @author joao-nb
 */
public class NewAccountDialog extends javax.swing.JDialog {

    private Frame parentFrame;

    /** Creates new form NewAccountDialog */
    public NewAccountDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parentFrame = parent;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        authButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(403, 40));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        authButton.setText("Autenticar no Twitter");
        authButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(authButton)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(authButton)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void authButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authButtonActionPerformed
        AccessToken accessToken = null;
        Twitter twitter = new TwitterFactory().getInstance();
        twitter.setOAuthConsumer(ConsumerTokens.KEY, ConsumerTokens.SECRET);
        RequestToken requestToken;
        try {
            requestToken = twitter.getOAuthRequestToken();
            while (null == accessToken) {
                System.out.println("Open the following URL and grant access to your account:");
                OpenDefaultBrowser browser = new OpenDefaultBrowser(requestToken.getAuthorizationURL());
                System.out.println(browser.getUrl());
                browser.open();
//                JOptionPane.showConfirmDialog(this, "Clicando em OK abrirá uma página no seu navegador, por favor clique em Autorizar adiante", "Autorizar aplicativo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                String pin = JOptionPane.showInputDialog("Em breve abrirá uma página no seu navegador. Por favor, clique em Autorizar. Cole aqui o código que foi gerado:");
                try {
                    if (pin.length() > 0) {
                        accessToken = twitter.getOAuthAccessToken(requestToken, pin);
                    } else {
                        accessToken = twitter.getOAuthAccessToken();
                    }
                } catch (TwitterException te) {
                    if (401 == te.getStatusCode()) {
                        System.out.println("Código Errado! Tente de novo.");
                        JOptionPane.showMessageDialog(this, "Unable to get the access token.", "Erro API", JOptionPane.ERROR_MESSAGE);
                    } else {
                        continue;
                    }
                }
            }

            Account account = new Account(twitter.verifyCredentials(), accessToken);
            account.storeAccessToken();
            // TODO Inserir dados na tela dos logins
            parentFrame.dispose();
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }
            InitWindow initWindow = new InitWindow();
            initWindow.setVisible(true);

            this.dispose(); // fecha a janela corrente

        } catch (Exception ex) {
            Logger.getLogger(NewAccountDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_authButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                NewAccountDialog dialog = new NewAccountDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
