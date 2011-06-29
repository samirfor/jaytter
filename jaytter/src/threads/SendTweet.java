/*
 * Copyright (C) 2011 samirfor
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
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import ui.core.MainWindow;

/**
 * Envia um tweet em uma thread
 */
public class SendTweet extends Thread {

    private final Twitter twitter;
    private final MainWindow mainWindow;
    private final String text;

    public SendTweet(Twitter twitter, MainWindow mainWindow, String text) {
        super();
        this.twitter = twitter;
        this.mainWindow = mainWindow;
        this.text = text;
    }

    @Override
    public void run() {
        send();
    }

    private void send() {
        try {
            twitter.updateStatus(text);
        } catch (TwitterException ex) {
            Logger.getLogger(SendTweet.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(mainWindow, "Erro ao enviar tweet. Tente novamente.\n" + ex.getMessage(), "Enviando tweet", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Successfully updated the status.");
        mainWindow.getStatusLabel().setText("<html><b>Tweet enviado com sucesso!</b></html>");
        mainWindow.getTweetTextArea().setText("");
        mainWindow.refreshTimeline();
    }
}
