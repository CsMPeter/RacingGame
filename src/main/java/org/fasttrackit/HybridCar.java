package org.fasttrackit;

public class HybridCar extends AutoVehicle{

    @Override
    public double accelerate(double speed,double durationInHours) {
        System.out.println(getName() + "is accelerating with" + speed + "km/h for" + durationInHours + "h");

        double actualSpeed = 2*speed;

        double distance = actualSpeed*durationInHours;

        System.out.println("Distance: " + distance);

        setTraveledDistance(getTraveledDistance() + distance);

        double usedFuel = distance * getMileage() / 100;

        System.out.println("Used fuel: " + usedFuel);


        System.out.println("Remaining fuel: " + getFuelLevel());

        return  distance;
    }

//  co-variant return type
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new HybridCar();
    }

    public void fly()
    {

        System.out.println("Yeeey flying!");
    }
}
