package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.doorCount = 5;
        car.fuelLevel = 60;
        car.fuelType = "Diesel";
        car.mileage = 8.5;
        car.maxSpeed = 200;
       // car.running = false;
        //car.traveledDistance = 0;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        car.engine = engine;

        System.out.println(car.name);
        System.out.println(car.traveledDistance);
        System.out.println(car.running);
        car.name = "Skoda";
        Car car2 = new Car();
        car2.name = "Golf";
        car2.doorCount = 2;
        car2.fuelLevel = 80;
        car2.fuelType = "Gasoline";
        car2.mileage = 7.3;
        car2.maxSpeed = 250;
        car2.running = true;
        car2.traveledDistance = 200000;

       /* System.out.println("Car2 name: " + car2.name);
        System.out.println("Car1 name: " + car.name);*/

        car = car2;
    }
}
