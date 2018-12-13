package com.example.android.javalearn;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();
        Contact myIub = new Contact( "Jenna", "jennainima@gmail.ro","0785524499");
        myContactsManager.addContact(myIub);
        Contact myDusman = new Contact("Dani","danimocanu@casamanelelor.ro","0766677722");
        myContactsManager.addContact(myDusman);

        Contact friendJessica = new Contact("Jessica", "kayle","076inima" );
        Contact friendMarty = new Contact();
        friendMarty.name = "Marty";
        friendMarty.phoneNumber = "077777777";

        myContactsManager.addContact(friendJessica);
        myContactsManager.addContact(friendMarty);

        Contact result = myContactsManager.searchContact("Marty");
        System.out.println(result.phoneNumber);

        Scanner scanner = new Scanner(System.in);
        String text  = scanner.nextLine(); 

    }
}
