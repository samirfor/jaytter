/*
 * Copyright (C) 2011 samirfor
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package threads;

import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import ui.core.MainWindow;
import ui.core.containers.Tweet;

/**
 *
 * @author samirfor
 */
public class Timeline extends Thread {

    private final Twitter twitter;
    private final JPanel panel;
    
    public Timeline(Twitter twitter, JPanel panel) {
        super();
        this.twitter = twitter;
        this.panel = panel;
    }
    
    @Override
    public void run() {
        addTweets();
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

                panelTweetLayout.setHorizontalGroup(panelTweetLayout.createSequentialGroup()
                        .addComponent(panelSingleTweet.getAvatar())
                        .addGroup(panelTweetLayout.createParallelGroup(Alignment.LEADING)
                            .addComponent(panelSingleTweet.getMessage())
                        ));
                panelTweetLayout.setVerticalGroup(panelTweetLayout.createSequentialGroup()
                        .addGroup(panelTweetLayout.createParallelGroup())
                            .addComponent(panelSingleTweet.getAvatar())
                            .addComponent(panelSingleTweet.getMessage())
                        );


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
                panel.add(panelSingleTweet);
                panel.repaint();
                i++;
            }
        } catch (TwitterException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
}