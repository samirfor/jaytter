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

import java.util.GregorianCalendar;

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

    /** local private name for the account (is the twitter username )*/
    private String name;
    /** local private key for oauth */
    private String oauthKey;
    /** informative date to store the date for signed */
    private GregorianCalendar dateAdded;
    /** amount of login made ​​by user */
    private int loginTimes;

    public Account(String name, String oauthKey, GregorianCalendar dateAdded, int loginTimes) {
        this.name = name;
        this.oauthKey = oauthKey;
        this.dateAdded = dateAdded;
        this.loginTimes = loginTimes;
    }

    public GregorianCalendar getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(GregorianCalendar dateAdded) {
        this.dateAdded = dateAdded;
    }

    public int getLogin_times() {
        return loginTimes;
    }

    public void setLogin_times(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOauthKey() {
        return oauthKey;
    }

    public void setOauthKey(String oauthKey) {
        this.oauthKey = oauthKey;
    }
}
