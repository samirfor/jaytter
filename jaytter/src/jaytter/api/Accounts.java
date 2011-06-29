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
package jaytter.api;

import java.util.ArrayList;
import java.util.Properties;
import org.jaytter.model.user.TwitterAccount;
import storage.Configuration;
import twitter4j.auth.AccessToken;

/**
 * Project: JayTTer: A CrossPlatform Twitter Client
 * File name: TwitterAccount.java
 * Description: Class for test
 *
 * @author João Neto
 *
 * @see The GNU Public License (GPL) v3
 */
public class Accounts {

    /**
     * Return all accounts credentials stored on database
     * @return ArrayList<Account>
     */
    public ArrayList<TwitterAccount> getStoredAccounts() {
        ArrayList<TwitterAccount> v = new ArrayList();
        Configuration cnf = new Configuration();

        ArrayList<Properties> accounts = cnf.getStoredAccounts();

        if (accounts.isEmpty()) {
            System.out.println("No accounts");
            return v;
        }

        for (int i = 0; i < accounts.size(); i++) {
            v.add(new TwitterAccount(new AccessToken(accounts.get(i).getProperty("token"), accounts.get(i).getProperty("token-secret"))));
        }
        return v;
    }
}
