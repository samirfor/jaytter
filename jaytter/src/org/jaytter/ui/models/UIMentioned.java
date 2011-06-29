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
import org.jaytter.model.tweet.Tweet;
import org.jaytter.ui.panels.impl.GenericTweetTimelinePanel;

/**
 *
 * @author Jaytter Team
 */
public class UIMentioned extends GenericTweetTimelinePanel {
    public UIMentioned()
    {
        super( "Mentioned" );
    }
    
    public void appendTweet(Tweet tweet) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void appendTweets(ArrayList<Tweet> tweets) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
