/*
 * Copyright (C) 2011 Jaytter Team
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
package org.jaytter.ui.manager.account;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import jaytter.ConsumerTokens;
import org.jaytter.model.user.TwitterAccount;
import org.jaytter.ui.account.AccountTimelineContainer;
import org.jaytter.ui.models.UIDirectMessages;
import org.jaytter.ui.models.UIMentioned;
import org.jaytter.ui.models.UIRetweet;
import org.jaytter.ui.models.UITimeline;
import org.jaytter.ui.panels.impl.GenericTweetTimelinePanel;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

/**
 *
 * @author Jaytter Team
 */
public class JaytterUIAccountManager {
    //names of ui panel timeline

    public static final String PANEL_PUBLIC_TIMELINE = "timeline";
    public static final String PANEL_RETWEETS = "retweets";
    public static final String PANEL_DIRECTMESSAGES = "directmessage";
    public static final String PANEL_SEARCH = "search";
    public static final String PANEL_MENTIONED = "mentioned";
    private HashMap uiTimelinesPanel = new HashMap();
    private AccountTimelineContainer uiAccountTimeline;
    private TwitterAccount twitterUser;

    private JaytterUIAccountManager() {
        uiAccountTimeline = new AccountTimelineContainer();
    }

    public static JaytterUIAccountManager getInstance() {
        return JaytterUIAccountManagerHolder.INSTANCE;
    }

    public TwitterAccount getUser() {
        return twitterUser;
    }

    public Twitter getTwitterInstance() {
        Twitter twitter = new TwitterFactory().getInstance();
        twitter.setOAuthConsumer(ConsumerTokens.KEY, ConsumerTokens.SECRET);
        twitter.setOAuthAccessToken(getUser().getAccessToken());

        return twitter;
    }

    public void setupAccount(TwitterAccount acc) {
        twitterUser = acc;
        _startPanels();
        uiAccountTimeline.setVisible(true);
        uiAccountTimeline.setCurrentTimelinePanel(getTimelinePanel(PANEL_PUBLIC_TIMELINE));
        changeActiveTimelinePanel(PANEL_PUBLIC_TIMELINE);
        uiAccountTimeline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Gets a UI Timeline object by name ( Use class const names )
     * Use this instance to update Ui timeline
     * @param panelName
     * @return 
     */
    public GenericTweetTimelinePanel getTimelinePanel(String panelName) {
        GenericTweetTimelinePanel panel = (GenericTweetTimelinePanel) uiTimelinesPanel.get(panelName);

        return panel;
    }

    private void _startPanels() {
        uiTimelinesPanel.put(PANEL_MENTIONED, new UIMentioned());
        uiTimelinesPanel.put(PANEL_RETWEETS, new UIRetweet());
        uiTimelinesPanel.put(PANEL_DIRECTMESSAGES, new UIDirectMessages());
        uiTimelinesPanel.put(PANEL_PUBLIC_TIMELINE, new UITimeline());
    }

    public void changeActiveTimelinePanel(String panelName) {
        final GenericTweetTimelinePanel timelinePanel = getTimelinePanel(panelName);

        System.out.println("change to panel" + panelName);
        uiAccountTimeline.setCurrentTimelinePanel(timelinePanel);

        Runnable runnable = new Runnable() {
            
            public void run() {
                while (true) {
                    Runnable runnable = new Runnable() {

                        public void run() {
                            timelinePanel.update();
                        }
                    };

                    Thread thread = new Thread(runnable);
                    thread.start();
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UITimeline.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Erro no sleep");
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static class JaytterUIAccountManagerHolder {

        private static final JaytterUIAccountManager INSTANCE = new JaytterUIAccountManager();
    }
}
