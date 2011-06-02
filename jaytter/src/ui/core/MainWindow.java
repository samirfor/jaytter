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

/*
 * MainWindow.java
 *
 * Created on 07/04/2011, 09:56:11
 */
package ui.core;

/**
 * Project: JayTTer: A CrossPlatform Twitter Client
 * File name: MainWindow.java
 * Description:  This is a window for general use.
 *
 * @author samir
 *
 * @see The GNU Public License (GPL) v3
 */
public class MainWindow extends javax.swing.JFrame {

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshButton = new javax.swing.JButton();
        jTabbedMain = new javax.swing.JTabbedPane();
        jTabbedPaneHome = new javax.swing.JTabbedPane();
        jPanelHomeAll = new javax.swing.JPanel();
        jPanelTweet1 = new javax.swing.JPanel();
        jPanelTweetAvatar1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelHomePublic = new javax.swing.JPanel();
        jPanelHomeConversation = new javax.swing.JPanel();
        jTabbedPaneMentions = new javax.swing.JTabbedPane();
        jPanelMentionsAll = new javax.swing.JPanel();
        jPanelMentionsReply = new javax.swing.JPanel();
        jTabbedPaneDMs = new javax.swing.JTabbedPane();
        jPanelDMInbox = new javax.swing.JPanel();
        jPanelDMOutbox = new javax.swing.JPanel();
        jTabbedPaneRTs = new javax.swing.JTabbedPane();
        jPanelRTRetweeted = new javax.swing.JPanel();
        jPanelRTbyMe = new javax.swing.JPanel();
        jPanelRTbyOthers = new javax.swing.JPanel();
        jTabbedPaneSearch = new javax.swing.JTabbedPane();
        jPanelProfile = new javax.swing.JPanel();
        jPanelKeyword = new javax.swing.JPanel();
        jPanelMenuTopo = new javax.swing.JPanel();
        jPanelAvatar = new javax.swing.JPanel();
        jPanelNewTweet = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNewTweet = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));

        refreshButton.setText("Refresh");

        jTabbedMain.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanelTweetAvatar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTweetAvatar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelTweetAvatar1.setFocusable(false);
        jPanelTweetAvatar1.setMaximumSize(new java.awt.Dimension(48, 48));
        jPanelTweetAvatar1.setMinimumSize(new java.awt.Dimension(48, 48));
        jPanelTweetAvatar1.setPreferredSize(new java.awt.Dimension(48, 48));

        javax.swing.GroupLayout jPanelTweetAvatar1Layout = new javax.swing.GroupLayout(jPanelTweetAvatar1);
        jPanelTweetAvatar1.setLayout(jPanelTweetAvatar1Layout);
        jPanelTweetAvatar1Layout.setHorizontalGroup(
            jPanelTweetAvatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanelTweetAvatar1Layout.setVerticalGroup(
            jPanelTweetAvatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Sed lacus. Donec lectus. Nullam pretium nibh ut turpis. Nam bibendum. In nulla tortor, elementum vel, tempor at, varius non, purus. Mauris vitae nisl nec metus placerat consectetuer. Donec ipsum. Proin imperdiet est. Phasellus dapibus semper urna. Pellentesque ornare, consectetuer nisl felis ac diam.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setFocusTraversalKeysEnabled(false);
        jTextArea1.setFocusable(false);
        jTextArea1.setHighlighter(null);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelTweet1Layout = new javax.swing.GroupLayout(jPanelTweet1);
        jPanelTweet1.setLayout(jPanelTweet1Layout);
        jPanelTweet1Layout.setHorizontalGroup(
            jPanelTweet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTweet1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTweetAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTweet1Layout.setVerticalGroup(
            jPanelTweet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTweet1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTweet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jPanelTweetAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelHomeAllLayout = new javax.swing.GroupLayout(jPanelHomeAll);
        jPanelHomeAll.setLayout(jPanelHomeAllLayout);
        jPanelHomeAllLayout.setHorizontalGroup(
            jPanelHomeAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTweet1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelHomeAllLayout.setVerticalGroup(
            jPanelHomeAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeAllLayout.createSequentialGroup()
                .addComponent(jPanelTweet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPaneHome.addTab("All", jPanelHomeAll);

        javax.swing.GroupLayout jPanelHomePublicLayout = new javax.swing.GroupLayout(jPanelHomePublic);
        jPanelHomePublic.setLayout(jPanelHomePublicLayout);
        jPanelHomePublicLayout.setHorizontalGroup(
            jPanelHomePublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelHomePublicLayout.setVerticalGroup(
            jPanelHomePublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneHome.addTab("Public", jPanelHomePublic);

        javax.swing.GroupLayout jPanelHomeConversationLayout = new javax.swing.GroupLayout(jPanelHomeConversation);
        jPanelHomeConversation.setLayout(jPanelHomeConversationLayout);
        jPanelHomeConversationLayout.setHorizontalGroup(
            jPanelHomeConversationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelHomeConversationLayout.setVerticalGroup(
            jPanelHomeConversationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneHome.addTab("Conversation", jPanelHomeConversation);

        jTabbedMain.addTab("Home", jTabbedPaneHome);

        javax.swing.GroupLayout jPanelMentionsAllLayout = new javax.swing.GroupLayout(jPanelMentionsAll);
        jPanelMentionsAll.setLayout(jPanelMentionsAllLayout);
        jPanelMentionsAllLayout.setHorizontalGroup(
            jPanelMentionsAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelMentionsAllLayout.setVerticalGroup(
            jPanelMentionsAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneMentions.addTab("All", jPanelMentionsAll);

        javax.swing.GroupLayout jPanelMentionsReplyLayout = new javax.swing.GroupLayout(jPanelMentionsReply);
        jPanelMentionsReply.setLayout(jPanelMentionsReplyLayout);
        jPanelMentionsReplyLayout.setHorizontalGroup(
            jPanelMentionsReplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelMentionsReplyLayout.setVerticalGroup(
            jPanelMentionsReplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneMentions.addTab("Reply", jPanelMentionsReply);

        jTabbedMain.addTab("Mentions", jTabbedPaneMentions);

        javax.swing.GroupLayout jPanelDMInboxLayout = new javax.swing.GroupLayout(jPanelDMInbox);
        jPanelDMInbox.setLayout(jPanelDMInboxLayout);
        jPanelDMInboxLayout.setHorizontalGroup(
            jPanelDMInboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelDMInboxLayout.setVerticalGroup(
            jPanelDMInboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneDMs.addTab("Inbox", jPanelDMInbox);

        javax.swing.GroupLayout jPanelDMOutboxLayout = new javax.swing.GroupLayout(jPanelDMOutbox);
        jPanelDMOutbox.setLayout(jPanelDMOutboxLayout);
        jPanelDMOutboxLayout.setHorizontalGroup(
            jPanelDMOutboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelDMOutboxLayout.setVerticalGroup(
            jPanelDMOutboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneDMs.addTab("Outbox", jPanelDMOutbox);

        jTabbedMain.addTab("Direct Messages", jTabbedPaneDMs);

        javax.swing.GroupLayout jPanelRTRetweetedLayout = new javax.swing.GroupLayout(jPanelRTRetweeted);
        jPanelRTRetweeted.setLayout(jPanelRTRetweetedLayout);
        jPanelRTRetweetedLayout.setHorizontalGroup(
            jPanelRTRetweetedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelRTRetweetedLayout.setVerticalGroup(
            jPanelRTRetweetedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneRTs.addTab("Retweeted", jPanelRTRetweeted);

        javax.swing.GroupLayout jPanelRTbyMeLayout = new javax.swing.GroupLayout(jPanelRTbyMe);
        jPanelRTbyMe.setLayout(jPanelRTbyMeLayout);
        jPanelRTbyMeLayout.setHorizontalGroup(
            jPanelRTbyMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelRTbyMeLayout.setVerticalGroup(
            jPanelRTbyMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneRTs.addTab("RT by Me", jPanelRTbyMe);

        javax.swing.GroupLayout jPanelRTbyOthersLayout = new javax.swing.GroupLayout(jPanelRTbyOthers);
        jPanelRTbyOthers.setLayout(jPanelRTbyOthersLayout);
        jPanelRTbyOthersLayout.setHorizontalGroup(
            jPanelRTbyOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelRTbyOthersLayout.setVerticalGroup(
            jPanelRTbyOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneRTs.addTab("RT by Others", jPanelRTbyOthers);

        jTabbedMain.addTab("RTs", jTabbedPaneRTs);

        javax.swing.GroupLayout jPanelProfileLayout = new javax.swing.GroupLayout(jPanelProfile);
        jPanelProfile.setLayout(jPanelProfileLayout);
        jPanelProfileLayout.setHorizontalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelProfileLayout.setVerticalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneSearch.addTab("Profile", jPanelProfile);

        javax.swing.GroupLayout jPanelKeywordLayout = new javax.swing.GroupLayout(jPanelKeyword);
        jPanelKeyword.setLayout(jPanelKeywordLayout);
        jPanelKeywordLayout.setHorizontalGroup(
            jPanelKeywordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanelKeywordLayout.setVerticalGroup(
            jPanelKeywordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jTabbedPaneSearch.addTab("Keyword", jPanelKeyword);

        jTabbedMain.addTab("Search", jTabbedPaneSearch);

        jPanelAvatar.setMaximumSize(new java.awt.Dimension(73, 73));
        jPanelAvatar.setPreferredSize(new java.awt.Dimension(73, 73));
        jPanelAvatar.setSize(new java.awt.Dimension(73, 73));

        javax.swing.GroupLayout jPanelAvatarLayout = new javax.swing.GroupLayout(jPanelAvatar);
        jPanelAvatar.setLayout(jPanelAvatarLayout);
        jPanelAvatarLayout.setHorizontalGroup(
            jPanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanelAvatarLayout.setVerticalGroup(
            jPanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jTextAreaNewTweet.setColumns(20);
        jTextAreaNewTweet.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNewTweet);

        javax.swing.GroupLayout jPanelNewTweetLayout = new javax.swing.GroupLayout(jPanelNewTweet);
        jPanelNewTweet.setLayout(jPanelNewTweetLayout);
        jPanelNewTweetLayout.setHorizontalGroup(
            jPanelNewTweetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );
        jPanelNewTweetLayout.setVerticalGroup(
            jPanelNewTweetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMenuTopoLayout = new javax.swing.GroupLayout(jPanelMenuTopo);
        jPanelMenuTopo.setLayout(jPanelMenuTopoLayout);
        jPanelMenuTopoLayout.setHorizontalGroup(
            jPanelMenuTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelNewTweet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuTopoLayout.setVerticalGroup(
            jPanelMenuTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNewTweet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedMain, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addComponent(jPanelMenuTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenuTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedMain, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(refreshButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelAvatar;
    private javax.swing.JPanel jPanelDMInbox;
    private javax.swing.JPanel jPanelDMOutbox;
    private javax.swing.JPanel jPanelHomeAll;
    private javax.swing.JPanel jPanelHomeConversation;
    private javax.swing.JPanel jPanelHomePublic;
    private javax.swing.JPanel jPanelKeyword;
    private javax.swing.JPanel jPanelMentionsAll;
    private javax.swing.JPanel jPanelMentionsReply;
    private javax.swing.JPanel jPanelMenuTopo;
    private javax.swing.JPanel jPanelNewTweet;
    private javax.swing.JPanel jPanelProfile;
    private javax.swing.JPanel jPanelRTRetweeted;
    private javax.swing.JPanel jPanelRTbyMe;
    private javax.swing.JPanel jPanelRTbyOthers;
    private javax.swing.JPanel jPanelTweet1;
    private javax.swing.JPanel jPanelTweetAvatar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedMain;
    private javax.swing.JTabbedPane jTabbedPaneDMs;
    private javax.swing.JTabbedPane jTabbedPaneHome;
    private javax.swing.JTabbedPane jTabbedPaneMentions;
    private javax.swing.JTabbedPane jTabbedPaneRTs;
    private javax.swing.JTabbedPane jTabbedPaneSearch;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaNewTweet;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables

}
