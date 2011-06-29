/*
 * Copyright (C) 2011 joao-nb
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
package org.jaytter.ui.manager;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jaytter.model.user.TwitterAccount;
import org.jaytter.ui.main.InitWindow;
import org.jaytter.ui.manager.account.JaytterUIAccountManager;

/**
 *
 * @author joao-nb
 */
public class JaytterUIManager {

    private InitWindow initWindow;
    /**
     * This class manage UI account methods ( Like addTweets to timeline, refresh timeline
     *  and manage threads )
     */
    private JaytterUIAccountManager accountManager;

    private JaytterUIManager() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(initWindow, "ERROR STARTING LOOK AND FEEL", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);

        }
        initWindow = new InitWindow();
        accountManager = JaytterUIAccountManager.getInstance();
    }

    public static JaytterUIManager getInstance() {
        return JaytterUIManagerHolder.INSTANCE;
    }

    private static class JaytterUIManagerHolder {

        private static final JaytterUIManager INSTANCE = new JaytterUIManager();
    }

    public InitWindow getInitWindow() {
        return initWindow;
    }

    /**
     * Starts main window
     */
    public void startUIApplication() {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
                initWindow.updateAccountsList(); //refresh accounts list
                initWindow.setVisible(true);
            }
        });
    }

    public void startUIForAccount(TwitterAccount acc) {
        accountManager.setupAccount(acc);
        initWindow.hide();
    }
}
