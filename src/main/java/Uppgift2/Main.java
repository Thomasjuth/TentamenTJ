package Uppgift2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String userName = takeUserInput();
        printFirstCharacter(userName);




    }



    public static String takeUserInput() {

        String userInput = null;
        Boolean waitingForUserInput = true;


        System.out.println("Vad heter du? Var god knappa in ditt namn");
        while(waitingForUserInput){

            userInput = scanner.nextLine();

            if(userInput != null);
            waitingForUserInput = false;

        }


        return userInput;

    }


    public static void printFirstCharacter(String userName){

        char firstLetter = userName.charAt(0);
        String firstLetterAsString = Character.toString(firstLetter);
        Boolean itIsBadLetter = firstLetterAsString.startsWith("Ö");


        if (itIsBadLetter) {
            System.out.println("Namnet börjar på bokstaven Ö och det är den sista bokstaven i alfabetet!");
        } else if (!(itIsBadLetter)) {
            System.out.println("Namnet börjar på bokstaven " + firstLetterAsString);
        }




    }
}
