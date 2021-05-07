package homework9;

public class Main {
    public static void main(String[] args) {
        //task 2
        System.out.println("Task2\n");

        MountainBicycle MountainBicycle1 = new MountainBicycle();
        RoadBicycle RoadBicycle1 = new RoadBicycle();
        System.out.println(MountainBicycle1);
        System.out.println(RoadBicycle1);

        MountainBicycle1.gear = 3;
        RoadBicycle1.changeGear(5);
        System.out.println("MountainBicycle1 gear: " + MountainBicycle1.gear);
        System.out.println("RoadBicycle1 gear: " + RoadBicycle1.gear);

        MountainBicycle1.speed = 22;
        RoadBicycle1.speed = 18;
        System.out.println("MountainBicycle1 speed: " + MountainBicycle1.speed);
        System.out.println("RoadBicycle1 speed: " + RoadBicycle1.speed);

        MountainBicycle1.speedUp (10);
        RoadBicycle1.speedUp (12);
        System.out.println("MountainBicycle1 speed: " + MountainBicycle1.speed);
        System.out.println("RoadBicycle1 speed: " + RoadBicycle1.speed);

        MountainBicycle1.applyBrake (20);
        RoadBicycle1.applyBrake (15);
        System.out.println("MountainBicycle1 speed: " + MountainBicycle1.speed);
        System.out.println("RoadBicycle1 speed: " + RoadBicycle1.speed);

        MountainBicycle1.setModel("Qwerty");
        System.out.println("MountainBicycle1 model: " + MountainBicycle1.getModel());

        MountainBicycle1.stop();
        RoadBicycle1.setRudderDepth(10);
        System.out.println("RoadBicycle1 Redder Depth: " + RoadBicycle1.getRudderDepth());

        MountainBicycle1.move();

        //task 3

        System.out.println("\nTask3\n");

        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1);
        vehicle1.move();
        Bicycle bicycle3 = new Bicycle();
        System.out.println(bicycle3);
        Bicycle bicycle4 = new Bicycle(10, 15);
        System.out.println(bicycle4);
        bicycle3.move();

        //task 4

        System.out.println("\nTask4\n");

        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = new Helicopter();
        System.out.println("Comparing helicopter1 and helicopter2 via '==': " + (helicopter1 == helicopter2));
        System.out.println("Comparing helicopter1 and helicopter2 via '.equals': " + (helicopter1.equals(helicopter2)));

        //task 5

        System.out.println("\nTask5\n");

        Car.carType = "Sedan";
        Car.transmission = "5 gear";
        System.out.println("carType = " + Car.carType + " and" + " transmission = " + Car.transmission);
    }
}
