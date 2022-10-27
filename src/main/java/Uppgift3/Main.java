package Uppgift3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);

   static ObjectMapper objectMapper = new ObjectMapper();


    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        //Reads back both the User List and the DiaryEntry List

        List<Person> personList = new ArrayList<>();
        List<Person> tempUser = List.of(mapper.readValue(Paths.get("src/main/resources/Persons.json").toFile(), Person[].class));
        personList.addAll(tempUser);



        Boolean run = true;
        while (run) {
            printMenuOptions();

            String userChoice = userMenuChoice();


            switch (userChoice) {

                case "0":
                    createPersonObject(personList);

                    break;


                case "1":

                    printList();
                    run = false;
                    break;


            }


        }
    }








    public static void printMenuOptions (){

        System.out.println("Print 0 to Create New Object");
        System.out.println("Print 1 to Print Your Objects");

    }

    public static String userMenuChoice (){

        String userChoice = scanner.nextLine();


        return userChoice;

    }



    public static void createPersonObject(List<Person> personList){

        System.out.println("Please give your person a First Name");
        String FirstName = scanner.nextLine();

        System.out.println("Please give your person a Last Name");
        String LastName = scanner.nextLine();

        System.out.println("What is the person's favorite movie?");
        String FavoriteMovie = scanner.nextLine();


        Person person = new Person(FirstName, LastName, FavoriteMovie);

        personList.add(person);
        writeToJason(personList);


    }


    public static void printList() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        List<Person> personList = new ArrayList<>();
        List<Person> tempUser = List.of(mapper.readValue(Paths.get("src/main/resources/Persons.json").toFile(), Person[].class));
        personList.addAll(tempUser);


        for(Person person: personList){

            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            System.out.println(person.getFavouriteMovie());


        }




    }


    public static void writeToJason(List<Person> personList){

        ObjectMapper mapper = new ObjectMapper();


        try {

//
            mapper.writeValue(Paths.get("src/main/resources/Persons.json").toFile(), personList);


        } catch (Exception e) {

            e.printStackTrace();
        }



    }







}


