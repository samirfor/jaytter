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

import org.jaytter.ui.manager.account.JaytterUIAccountManager;
import org.jaytter.ui.panels.impl.GenericTweetTimelinePanel;
import twitter4j.DirectMessage;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;

;

/**
 *
 * @author Jaytter Team
 */
public class UIDirectMessages extends GenericTweetTimelinePanel {

    public UIDirectMessages() {
        super("DM");
    }

    private void getData() {
        //TODO Transformar isso em thread assincrona
        try {
            Twitter twitter = JaytterUIAccountManager.getInstance().getTwitterInstance();
            ResponseList<DirectMessage> statuses = twitter.getDirectMessages();
            for (DirectMessage status : statuses) {
                insertStatusDM(status);
            }
        } catch (TwitterException ex) {
            System.out.println("erro!" + ex.getMessage());
        }
    }

    public final void update() {
        Runnable runnable = new Runnable() {

            public void run() {
                System.out.println("[debug] UIDirectMessages Thread");
                getData();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
