/*
 * Copyright (C) 2011 joao-neto
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
package org.jaytter.model.tweet;

import java.util.Date;
import org.jaytter.model.user.TweetAccount;

/**
 * This is a abstract class for Tweet instance on Jaytter
 * @author joao-neto
 */
abstract public class Tweet {
    
    protected Date              date;
    
    protected TweetAccount         from;
    
    protected String            message;
    
    protected String            fromApp;
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TweetAccount getFrom() {
        return from;
    }

    public void setFrom(TweetAccount from) {
        this.from = from;
    }

    public String getFromApp() {
        return fromApp;
    }

    public void setFromApp(String fromApp) {
        this.fromApp = fromApp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return "Tweet{" + "date=" + date + ", from=" + from + ", message=" + message + ", fromApp=" + fromApp + '}';
    }

}
