/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaytter.api;

import java.util.ArrayList;
import java.util.Date;
import models.Account;

/**
 *
 * @author joaoneto
 */
public class Accounts 
{
    public ArrayList<Account> getStoredAccounts()
    {
        ArrayList<Account> v = new ArrayList();
        v.add( new Account( "joao_neto", "asd3dmw309mw039dmqw30dwm3d", new Date() ) );
        v.add( new Account( "samirfor","asd3dmw309mw039dmqw30dwm3d", new Date() ) );
        v.add( new Account( "emanuellagomes","asd3dmw309mw039dmqw30dwm3d", new Date() ) );
        return v;
    }
}
