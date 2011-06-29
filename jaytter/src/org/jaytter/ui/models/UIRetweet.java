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
package org.jaytter.ui.models;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaytter.model.tweet.Tweet;
import org.jaytter.ui.manager.account.JaytterUIAccountManager;
import org.jaytter.ui.panels.impl.GenericTweetTimelinePanel;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

;

/**
 *
 * @author Jaytter Team
 */
public class UIRetweet extends GenericTweetTimelinePanel {

    public UIRetweet() {
        super("RT");
    }

    private void setupThread() {
        //TODO Transformar isso em thread assincrona
        try {
            Twitter twitter = JaytterUIAccountManager.getInstance().getTwitterInstance();

            for (Status status : twitter.getRetweetedByMe()) {
                insertStatus(status);
            }
        } catch (TwitterException ex) {
            System.out.println("erro!" + ex.getMessage());
        }
    }

    public void update() {
        Runnable runnable = new Runnable() {

            public void run() {
                System.out.println("[debug] Timeline Thread");
                setupThread();
                try {
                    Thread.sleep( 1000 );
                } catch (InterruptedException ex) {
                    Logger.getLogger(UITimeline.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
