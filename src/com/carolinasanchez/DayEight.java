package com.carolinasanchez;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayEight {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        phoneBook.put("sam", 99912222);
        phoneBook.put("tom", 11122222);
        phoneBook.put("harry", 12299933);


        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String name = scanner.nextLine();

            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else if (name.matches("[a-z]+")) {
                System.out.println("Not found");
            }
        } */ // ONLY PASSED TEST 0.

        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            String name = scanner.next();
            int phone = scanner.nextInt();
            phoneBook.put(name,phone);
        }

        while (scanner.hasNext()) {
            String nameCheck = scanner.next();

            if (phoneBook.containsKey(nameCheck)) {
                System.out.println(nameCheck + "=" + phoneBook.get(nameCheck));
            } else {
                System.out.println("Not found");
            }
        } // COMBINATION OF MY CODE AND THE WORKING CODE FOUND ONLINE.

       /* CODE THAT WORKED: Scanner in = new Scanner(System.in);
        Map<String,Integer> Contact =new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            Contact.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(Contact.containsKey(s)){
                System.out.println(s+"="+Contact.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close(); */
    }
}