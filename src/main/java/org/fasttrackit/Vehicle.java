package org.fasttrackit;

public class Vehicle {


    private static int totalCount;

    private String name;
    private double mileage;
    private double maxSpeed;
    private String fuelType;
    private double fuelLevel;
    private double traveledDistance;
    private boolean running;

    public Vehicle() {
        totalCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public double accelerate(double speed, double durationInHours){

        System.out.println(name + "is accelerating with" + speed + "km/h for" + durationInHours + "h");

        double distance = speed * durationInHours;

        System.out.println("Distance: " + distance);

        traveledDistance = traveledDistance + distance;

        double usedFuel = distance * mileage / 100;

        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return  distance;
    }

    public double accelerate(double speed){

        return accelerate(speed,1);
    }
}
