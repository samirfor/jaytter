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
package models;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;

/**
 * Project: JayTTer: A CrossPlatform Twitter Client
 * File name: Account.java
 * Description:  This is a model for store and view twitter local accounts
 *   
 * @author João Neto
 * @version 5
 *   
 * @see The GNU Public License (GPL) v3
 */
public class Account {

    /** User details supplied by Twitter*/
    private User user;
    /** local private name for the account (is the twitter username )*/
    private String name;
    /** local private keys (token and secretToken) for OAuth */
    private AccessToken accessToken;
    /** informative date to store the date for signed */
    private Date dateAdded;
    /** amount of login made ​​by user */
    private int loginTimes;

    public Account(User user, String name, AccessToken accessToken, Date dateAdded, int loginTimes) {
        this.user = user;
        this.name = name;
        this.accessToken = accessToken;
        this.dateAdded = dateAdded;
        this.loginTimes = loginTimes;
    }

    public Account(User user, AccessToken accessToken) {
        this.user = user;
        this.name = user.getName();
        this.accessToken = accessToken;
    }

    public Account(AccessToken accessToken) {
        this.accessToken = accessToken;
        fetchAttributesFromTwitter();
    }

    public Account(String name) {
        this.name = name;
        // TODO Search in database by name and fetch access token
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return name;
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
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.name = user.getName();
    }

    /**
     * TODO DB must to save token and token secret.
     */
    private void storeAccessToken() {
        //store accessToken.getToken()
        //store accessToken.getTokenSecret()
    }
}
