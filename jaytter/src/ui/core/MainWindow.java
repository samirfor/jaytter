/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package ui.core;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import jaytter.ConsumerTokens;
import models.Account;
import threads.SendTweet;
import threads.Timeline;
import twitter4j.Status;
import twitter4j.TwitterException;
import ui.core.containers.Tweet;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

/**
 * Project: JayTTer: A CrossPlatform Twitter Client
 * File name: MainWindow.java
 * Description:  This is a window for general use.
 *
 * @see The GNU Public License (GPL) v3
 */
public class MainWindow extends javax.swing.JFrame {

    private Twitter twitter;
    private Account account;
    private JFrame parentFrame;
    private String tweet;
    private Timeline timeline;

    /** Creates new form MainWindow */
    public MainWindow(JFrame parentFrame, Account account) {
        initComponents();
        this.parentFrame = parentFrame;
        this.account = account;
        twitter = new TwitterFactory().getInstance();
        twitter.setOAuthConsumer(ConsumerTokens.KEY, ConsumerTokens.SECRET);
        twitter.setOAuthAccessToken(account.getAccessToken());
        this.setTitle("@" + account.getUser().getScreenName() + " - " + account.getUser().getName());
        addTimeline();
    }

    public JLabel getStatusLabel() {
        return statusLabel;
    }

    public JTextArea getTweetTextArea() {
        return tweetTextArea;
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tweetTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        tweetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logoffMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        tweetTextArea.setColumns(20);
        tweetTextArea.setRows(5);
        tweetTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tweetTextAreaFocusGained(evt);
            }
        });
        tweetTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tweetTextAreaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tweetTextArea);

        jLabel3.setText("O que está acontecendo?");

        tweetButton.setText("Tweet");
        tweetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tweetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tweetButton)
                .addContainerGap(177, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tweetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(50, 572));

        jButton1.setText("@");
        jPanel3.add(jButton1);

        jButton2.setText("RT");
        jPanel3.add(jButton2);

        jButton3.setText("DM");
        jPanel3.add(jButton3);

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setMinimumSize(new java.awt.Dimension(60, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(60, 24));
        jPanel4.setRequestFocusEnabled(false);

        statusLabel.setText("Status Bar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(statusLabel)
                .addGap(55, 55, 55))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(statusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(153, 153, 0));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel7.setBackground(new java.awt.Color(0, 255, 255));
        jPanel7.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(jPanel7);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Twitter");

        logoffMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        logoffMenuItem.setText("Logoff");
        logoffMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(logoffMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setText("Copiar");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setText("Colar");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(pasteMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        InitWindow initWindow = new InitWindow();
        initWindow.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void tweetTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tweetTextAreaKeyTyped
        int textSize = tweetTextArea.getText().length() + 1;
        if (textSize >= 140) {
            statusLabel.setText("<html><b>" + textSize + "/140</b></html>");
        } else {
            statusLabel.setText(textSize + "/140");
        }
    }//GEN-LAST:event_tweetTextAreaKeyTyped

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection strSel = new StringSelection(tweetTextArea.getText());
        clipboard.setContents(strSel, null);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        try {
            tweetTextArea.setText((String) clipboard.getData(DataFlavor.stringFlavor));
        } catch (UnsupportedFlavorException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void tweetTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tweetTextAreaFocusGained
        statusLabel.setText(tweetTextArea.getText().length() + "/140");
    }//GEN-LAST:event_tweetTextAreaFocusGained

    private void logoffMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffMenuItemActionPerformed
        this.dispose();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        InitWindow initWindow = new InitWindow();
        initWindow.setVisible(true);
    }//GEN-LAST:event_logoffMenuItemActionPerformed

    private void tweetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tweetButtonActionPerformed
        int textSize = tweetTextArea.getText().length();
        if (textSize > 140) {
            JOptionPane.showMessageDialog(this, "Seu tweet está muito grande. São permitidos no máximo 140 caracteres.", "Enviando tweet", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (textSize == 0) {
            JOptionPane.showMessageDialog(this, "Não há nada a twittar.", "Enviando tweet", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        SendTweet sendTweet = new SendTweet(twitter, this, tweetTextArea.getText());
        sendTweet.start();
        statusLabel.setText("Enviando...");
    }//GEN-LAST:event_tweetButtonActionPerformed

    private void addTimeline() {
        timeline = new Timeline(twitter, jPanel7);
        timeline.start();
    }

    public void refreshTimeline() {
        addTimeline();
    }

    private void addTweets() {
        Tweet panelSingleTweet;
        List<Status> statuses;

        try {
            statuses = twitter.getFriendsTimeline();

            System.out.println("Showing friends timeline.");
            for (Status status : statuses) {
                int i = 0;
                System.out.println(status.getUser().getName() + ":"
                        + status.getText());

                panelSingleTweet = new Tweet(status);
                javax.swing.GroupLayout panelTweetLayout = new javax.swing.GroupLayout(panelSingleTweet);
                panelSingleTweet.setLayout(panelTweetLayout);
                panelTweetLayout.setAutoCreateGaps(true);
                panelTweetLayout.setAutoCreateContainerGaps(true);

                panelTweetLayout.setHorizontalGroup(panelTweetLayout.createSequentialGroup().addComponent(panelSingleTweet.getAvatar()).addGroup(panelTweetLayout.createParallelGroup(Alignment.LEADING).addComponent(panelSingleTweet.getMessage())));
                panelTweetLayout.setVerticalGroup(panelTweetLayout.createSequentialGroup().addGroup(panelTweetLayout.createParallelGroup()).addComponent(panelSingleTweet.getAvatar()).addComponent(panelSingleTweet.getMessage()));


//                panelTweetLayout.setHorizontalGroup(
//                        panelTweetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 369, Short.MAX_VALUE));
//                panelTweetLayout.setVerticalGroup(
//                        panelTweetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));
//
//                java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
//                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
//                gridBagConstraints.gridx = 0;
//                gridBagConstraints.gridy = i;
//                gridBagConstraints.weightx = 20.0;

                if (i % 2 == 0) {
                    panelSingleTweet.setBackground(Color.getHSBColor(100, 200, 100));
                } else {
                    panelSingleTweet.setBackground(Color.getHSBColor(200, 100, 200));
                }
                jPanel7.add(panelSingleTweet);
                jPanel7.repaint();
                i++;
            }
        } catch (TwitterException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
//        for (int i = 0; i < 40; i++) {
//            panelTweetLocal = new Tweet();
//            javax.swing.GroupLayout panelTweetLayout = new javax.swing.GroupLayout(panelTweetLocal);
//            panelTweetLocal.setLayout(panelTweetLayout);
//            panelTweetLayout.setHorizontalGroup(
//                    panelTweetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 369, Short.MAX_VALUE));
//            panelTweetLayout.setVerticalGroup(
//                    panelTweetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));
//
//            java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
//            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
//            gridBagConstraints.gridx = 0;
//            gridBagConstraints.gridy = i;
//            gridBagConstraints.weightx = 20.0;
//
//            if (i % 2 == 0) {
//                panelTweetLocal.setBackground(Color.getHSBColor(100, 200, 100));
//            } else {
//                panelTweetLocal.setBackground(Color.getHSBColor(200, 100, 200));
//            }
//            jPanel7.add(panelTweetLocal, gridBagConstraints);
//            jPanel7.repaint();
//        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem logoffMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton tweetButton;
    private javax.swing.JTextArea tweetTextArea;
    // End of variables declaration//GEN-END:variables
}
