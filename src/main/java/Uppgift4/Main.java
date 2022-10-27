package Uppgift4;

import Uppgift3.Person;
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
            printList(personList);

        }


        public static void printList(List<Person> personList){


            for (Person person: personList){

                System.out.println(person.getFirstName());
                System.out.println(person.getLastName());
                System.out.println(person.getFavouriteMovie());
            }



        }
}
