/*
 * Copyright (C) 2011 joao-nb
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
import javax.swing.JFrame;
import org.jaytter.model.user.TweetAccount;
import org.jaytter.ui.account.AccountTimelineContainer;
import org.jaytter.ui.models.UIDirectMessages;
import org.jaytter.ui.models.UIMentioned;
import org.jaytter.ui.models.UIRetweet;
import org.jaytter.ui.models.UITimeline;
import org.jaytter.ui.panels.impl.GenericTweetTimelinePanel;

/**
 *
 * @author joao-nb
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
    
    private JaytterUIAccountManager() {
        uiAccountTimeline = new AccountTimelineContainer();
    }

    public static JaytterUIAccountManager getInstance() {
        return JaytterUIAccountManagerHolder.INSTANCE;
    }

    public void setupAccount(TweetAccount acc) {
        _startPanels();
        uiAccountTimeline.setVisible( true );
        uiAccountTimeline.setCurrentTimelinePanel( getTimelinePanel( PANEL_PUBLIC_TIMELINE ) );
        uiAccountTimeline.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     * Gets a UI Timeline object by name ( Use class const names )
     * Use this instance to update Ui timeline
     * @param panelName
     * @return 
     */
    public GenericTweetTimelinePanel getTimelinePanel( String panelName )
    {
        GenericTweetTimelinePanel panel = (GenericTweetTimelinePanel) uiTimelinesPanel.get( panelName );
        
        return panel;
    }
    
    private void _startPanels() {
        uiTimelinesPanel.put(PANEL_MENTIONED, new UIMentioned());
        uiTimelinesPanel.put(PANEL_RETWEETS, new UIRetweet());
        uiTimelinesPanel.put(PANEL_DIRECTMESSAGES, new UIDirectMessages());
        uiTimelinesPanel.put(PANEL_PUBLIC_TIMELINE, new UITimeline());
    }

    public void changeActiveTimelinePanel( String panelName ) 
    {
        System.out.println( "change to panel" + panelName );
        uiAccountTimeline.setCurrentTimelinePanel( getTimelinePanel( panelName ) );
    }

    private static class JaytterUIAccountManagerHolder {

        private static final JaytterUIAccountManager INSTANCE = new JaytterUIAccountManager();
    }
}
