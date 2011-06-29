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
package models;

import models.Message;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/** 
 * TODO Esta classe deverá completar o esqueleto de Message, formando
 * um DM completo.
 * 
 * Uma DM é formada basicamente por:
 * - autor (herda de Message)
 * - destinatario
 * - texto (herda de Message)
 * - timestamp (herda de Message)
 * 
 * @author samirfor
 */
public class DirectMessage implements Message {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java twitter4j.examples.directmessage.SendDirectMessage [recipient screen name] [message]");
            System.exit(-1);
        }
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            DirectMessage message = (DirectMessage) twitter.sendDirectMessage(args[0], args[1]);
            System.out.println("Mensagem direta enviada com sucesso para " + message.getRecipientScreenName());
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Falha ao enviar mensagem direta: " + te.getMessage());
            System.exit(-1);
        }
    }

    private String getRecipientScreenName() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

