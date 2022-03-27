package Arrays;

import java.util.Arrays;

public class WebsiteChecker {
    public static void main(String[] args) {

        String[] web = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com"};
        String[] track = {"com", "org", "edu"};
        String other = "";
        int count = 0;

        for (int i = 0; i < web.length; i++){

            for (int j = 0; j < track.length; j++) {
                if (web[i].contains(track[j])){
                    count++;
                    break;
                }
            }
            }
        System.out.println(count);
        System.out.println(other);
        }
    }
