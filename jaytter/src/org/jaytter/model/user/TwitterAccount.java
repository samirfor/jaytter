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
package org.jaytter.model.user;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import storage.Configuration;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;

/**
 * Project: JayTTer: A CrossPlatform Twitter Client
 * File name: TwitterAccount.java
 * Description:  This is a model for store and view twitter local accounts
 *   
 * @author João Neto
 * @version 5
 *   
 * @see The GNU Public License (GPL) v3
 */
public class TwitterAccount {

    /** User details supplied by Twitter*/
    private User user;
    /** local private name for the account (is the twitter username )*/
    private String screenName;
    /** local private keys (token and secretToken) for OAuth */
    private AccessToken accessToken;
    /** informative date to store the date for signed */
    private Date dateAdded = null;
    /** amount of login made ​​by user */
    private int loginTimes;

    public TwitterAccount(User user, String screenName, AccessToken accessToken, Date dateAdded, int loginTimes) {
        this.user = user;
        this.screenName = screenName;
        this.accessToken = accessToken;
        this.dateAdded = dateAdded;
        this.loginTimes = loginTimes;
    }

    public TwitterAccount(User user, AccessToken accessToken) {
        this.user = user;
        this.screenName = user.getName();
        this.accessToken = accessToken;
    }

    public TwitterAccount(String screenName, AccessToken accessToken) {
        this.screenName = screenName;
        this.accessToken = accessToken;
    }

    public TwitterAccount(AccessToken accessToken) {
        this.accessToken = accessToken;
        fetchAttributesFromTwitter();
    }

    public TwitterAccount(String name) {
        Configuration configuration = new Configuration();
        Properties properties = configuration.getAccount(name);
        this.screenName = properties.getProperty("screen-name");
        this.accessToken = new AccessToken(properties.getProperty("token"), properties.getProperty("token-secret"));
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return screenName;
    }

    public AccessToken getAccessToken() {
        return accessToken;
    }

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    public User getUser() {
        return user;
    }

    /**
     * Connect with Twitter and search the required information.
     */
    public final void fetchAttributesFromTwitter() {
        Twitter twitter = new TwitterFactory().getInstance();
        twitter.setOAuthConsumer("wHaPcyNhf4a7JBOf8I1ig", "YUtDUWZcEBsTUCzS5ZZygERcGwyflJ5iTvsSjU7Iv6g");
        twitter.setOAuthAccessToken(accessToken);
        try {
            this.user = twitter.verifyCredentials();
        } catch (TwitterException ex) {
            Logger.getLogger(TwitterAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.screenName = user.getName();
    }

    public void storeAccessToken() {
        Configuration cnf = new Configuration();
        Properties values = new Properties();

        values.setProperty("token", getAccessToken().getToken());
        values.setProperty("token-secret", getAccessToken().getTokenSecret());
        if (getDateAdded() != null) {
            values.setProperty("date-added", getDateAdded().toString());
        }
        values.setProperty("screen-name", getUser().getScreenName());
        cnf.storeAccount(getUser().getScreenName(), values);
    }
}
