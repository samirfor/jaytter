/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AccountsList.java
 *
 * Created on 07/04/2011, 22:06:31
 */
package ui.core.containers;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import jaytter.api.Accounts;
import models.Account;
import ui.core.containers.accounts.AccountList;

/**
 *
 * @author joaoneto
 */
public final class AccountsList extends javax.swing.JPanel {
    private ArrayList<Account> storedAccounts;

    /** Creates new form AccountsList */
    public AccountsList() {
        initComponents();
        addAccountsToList(  );

    }

    public void addAccountsToList(  )
    {
        Accounts accounts = new Accounts();
        storedAccounts = accounts.getStoredAccounts();
        
        for(int i = 0; i < storedAccounts.size(); i++ ){
            this.addAccountToPanel( storedAccounts.get(i) );
        }
    }
    
    private void addAccountToPanel( Account a )
    {
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/jaytter/images/intents-assets/intents-assets/bird/bird_gray/bird_16_gray.png"));
        this.accountsTag.addTab( "", icon, new AccountList( a.getName(), a.getOauthKey() ) );
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountsTag = new javax.swing.JTabbedPane();

        setBackground(java.awt.Color.cyan);
        setPreferredSize(new java.awt.Dimension(200, 150));
        setLayout(new java.awt.BorderLayout());

        accountsTag.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        add(accountsTag, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane accountsTag;
    // End of variables declaration//GEN-END:variables
}
