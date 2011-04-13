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
import java.util.GregorianCalendar;
import models.Account;

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

    public ArrayList<Account> getStoredAccounts() {
        ArrayList<Account> v = new ArrayList();
        v.add(new Account("joao_neto", "asd3dmw309mw039dmqw30dwm3d", new GregorianCalendar(), 0));
        v.add(new Account("samirfor", "asd3dmw309mw039dmqw30dwm3d", new GregorianCalendar(), 0));
        v.add(new Account("emanuellagomes", "asd3dmw309mw039dmqw30dwm3d", new GregorianCalendar(), 0));
        return v;
    }
}
