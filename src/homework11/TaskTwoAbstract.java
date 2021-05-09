package homework11;

//Write a program which contains enum and realization of abstract method in it.
// Please choose any example, enum should contain 4 values, each different realization of abstract method.

public class TaskTwoAbstract {

    enum Vehicle {

        Car {
            @Override
            public void model() {
                System.out.println("Toyota");
            }
        },
        Bike {
            @Override
            public void model() {
                System.out.println("Kawasaki");
            }
        },
        Bicycle{
            @Override
            public void model() {
                System.out.println("Trinx");
            }
        },
        Truck{
            @Override
            public void model() {
                System.out.println("Scania");
            }
        };

        abstract void model();
        }

    public static class Main {
        public static void main(String[] args) {

            Vehicle.Car.model();
            Vehicle.Bike.model();
            Vehicle.Bicycle.model();
            Vehicle.Truck.model();
        }
    }
}
