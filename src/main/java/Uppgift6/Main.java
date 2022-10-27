package Uppgift6;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        //Reads back both the User List and the DiaryEntry List

        List<Answers> answersList = new ArrayList<>();
        List<Answers> tempUser = List.of(mapper.readValue(Paths.get("src/main/resources/Answers.json").toFile(), Answers[].class));
        answersList.addAll(tempUser);




    }


    public static void askQuestions(List<Answers> answersList) {

        System.out.println("Nämn en av rollerna som finns inom Scrum?");

        String answer1 = scanner.nextLine();
        System.out.println("Nämn en av cermonierna som finns inom Scrum?");
        String answer2 = scanner.nextLine();

        System.out.println("Vad är rekommenderat max antal personer i ett team?");

        String answer3 = scanner.nextLine();
        System.out.println("Scum har ett dokument där ALL information om Scrum finns, vad heter dokumentet?");

        String answer4 = scanner.nextLine();
        System.out.println("Vem är den enda personen som får avbryta en Sprint?");

        String answer5 = scanner.nextLine();

        Answers answers = new Answers(answer1, answer2, answer3, answer4, answer5);

        answersList.add(answers);
        writeToJason(answersList);


    }

    public static void writeToJason(List<Answers> answersList) {

        ObjectMapper mapper = new ObjectMapper();


        try {

//
            mapper.writeValue(Paths.get("src/main/resources/Answers.json").toFile(), answersList);


        } catch (Exception e) {

            e.printStackTrace();
        }


    }




}

