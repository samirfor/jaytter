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
import models.Account;
import twitter4j.auth.AccessToken;

/**
 * Project: JayTTer: A CrossPlatform Twitter Client
 * File name: Account.java
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
    public ArrayList<Account> getStoredAccounts() {
        // TODO Capturing this information from the database
        
        // This code below is only for tests
        ArrayList<Account> v = new ArrayList();
        v.add(new Account("joao_neto"));
        v.add(new Account(new AccessToken("370909999999999999999SXiYwdo", "5376Wi3D99999999999999991ShcjSrCbc"))); // samirfor
        v.add(new Account("emanuellagomes"));
        return v;
    }
}
