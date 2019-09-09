package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;


        Car car = new Car(engine);
        car.setName("Dacia");
        car.doorCount = 5;
        car.setFuelLevel(60);
        car.setFuelType("Diesel");
        car.setMileage(8.5);
        car.setMaxSpeed(200);
       // car.running = false;
        //car.traveledDistance = 0;

        Engine engine2 = new Engine();
        engine.manufacturer = "Volkswagen";
        engine.capacity = 1600;

       /* System.out.println(car.getName());
        System.out.println(car.setTraveledDistance());
        System.out.println(car.setRunning());*/

        car.accelerate(60, 1);

        Car car2 = new Car(engine2);
        car2.setName("Golf");
        car2.doorCount = 2;
        car2.setFuelLevel(50);
        car2.setFuelType("Gasoline");
        car2.setMileage(7.3);
        car2.setMaxSpeed(250);
        car2.setRunning(true);
        car2.setTraveledDistance(200000);

       /* System.out.println("Car2 name: " + car2.getName());
        System.out.println("Car1 name: " + car.getName());*/

        //car = car2;
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Input from user: " + text);


        System.out.println("Static variables example:");


        //we should only call static variables from the class itself
        //not from a variable containing an object of that class
        /*car.totalCount = 1;

        System.out.println("Total count in car: " + car.totalCount);

        car.totalCount = 2;


        System.out.println("Total count in car after setting car2: " + car.totalCount);

        System.out.println("Totalcount in car 2: " + car2.totalCount);

        System.out.println("Total count in Car class: " + Car.totalCount);*/


    }
}
