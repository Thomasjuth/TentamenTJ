package Uppgift5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {



        Car car = new Car("Blue", "Tesla,");
        System.out.println("Number of created cars so far:" + Car.getNumberOfCars());
        Car car2 = new Car("Green", "Volvo,");
        System.out.println("Number of created cars so far:" + Car.getNumberOfCars());
        Car car3 = new Car("White", "BMW,");
        System.out.println("Number of created cars so far:" + Car.getNumberOfCars());
        Car car4 = new Car("Black", "Ferrari,");
        System.out.println("Number of created cars so far:" + Car.getNumberOfCars());



        List<Car> carList = new ArrayList<>();

        carList.add(car);

        carList.add(car2);

        carList.add(car3);

        carList.add(car4);


        writeToJason(carList);





    }


    public static void writeToJason(List<Car> carList){

        ObjectMapper mapper = new ObjectMapper();


        try {

//
            mapper.writeValue(Paths.get("src/main/resources/Cars.json").toFile(), carList);


        } catch (Exception e) {

            e.printStackTrace();
        }



}
    }
