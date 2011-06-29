/*
 * Copyright (C) 2011 emanuel
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

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import jaytter.ConsumerTokens;
import twitter4j.ResponseList;
import twitter4j.User;

/**
 *
 * @author emanuel
 */
public class SearchUsers {

        public static void main (String args[]){
        
    String search = "EmanuelDomingos";

       // Teste Pesquisa por Usuario
        Twitter twitter = new TwitterFactory().getInstance();
        twitter.setOAuthConsumer(ConsumerTokens.KEY, ConsumerTokens.SECRET);
//        twitter.setOAuthAccessToken(account.getAccessToken());
        try {
            ResponseList<User> searchUsers = twitter.searchUsers(search, 1);
            for(User user : searchUsers) {
                System.out.println(user.getName()+ " - " + user.getScreenName());
            }
        } catch(TwitterException te) {
            System.out.println(te.getMessage());
        }
    
    
    
    
    
//        Twitter twitter = new TwitterFactory().getInstance();
//        try {
//            QueryResult result = (QueryResult) twitter.searchUsers(search, 1);
//            List<Tweet> tweets = result.getTweets();
//            for (Tweet tweet : tweets) {
//                System.out.println("@" + tweet.getFromUser() + " - " + tweet.getText());
//            }
//            System.exit(0);
//        } catch (TwitterException te) {
//            te.printStackTrace();
//            System.out.println("Falha na busca por tweets: " + te.getMessage());
//            System.exit(-1);
//        }
    }

//    private static class account {
//
//        private static AccessToken getAccessToken() {
//            throw new UnsupportedOperationException("Not yet implemented");
//        }
//
//        public account() {
//        }
//    }

}