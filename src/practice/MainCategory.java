package practice;

import java.util.Scanner;

public class MainCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter url:");
        String url = input.next();

        if (url.lastIndexOf('/') == url.indexOf("/c/")+2) {
            System.out.println("Main Category name is " + url.replace('-', ' ').substring
                    (url.lastIndexOf('/')+1, url.indexOf('?')));
        } else {
            url = url.substring(url.indexOf("/c/")+3);
            System.out.println("Main Category name is " + url.replace('-', ' ').substring
                    (0, url.indexOf('/')));
        }
    }
}

