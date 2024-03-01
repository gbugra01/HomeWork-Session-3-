package HW;


import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

            HashMap<Car, String> ownedCars = new HashMap<>();
            //TODO: print color of all cars owned by John and Alice
            ownedCars.put(new Car(CarColours.BLACK), "John");
            ownedCars.put(new Car(CarColours.WHITE), "John");
            ownedCars.put(new Car(CarColours.GREEN), "Jane");
            ownedCars.put(new Car(CarColours.RED), "Pete");
            ownedCars.put(new Car(CarColours.BLACK), "Bob");
            ownedCars.put(new Car(CarColours.WHITE), "Kate");
            ownedCars.put(new Car(CarColours.GREEN), "Bill");
            ownedCars.put(new Car(CarColours.RED), "Alice");
            ownedCars.put(new Car(CarColours.GREEN), "Alice");

            List<Car> carWithCertainColor = new ArrayList<>();
            Set<Car> cars = ownedCars.keySet();
        for (Car c : cars) {
            if (c.carColour.equals(CarColours.BLACK)) {
                carWithCertainColor.add(c);
            }
        }

        for (Car c : carWithCertainColor) {
            System.out.println(ownedCars.get(c));
        }
        System.out.println("===================");
        List<Car> ownersOfCarsWithSpecificColor = new ArrayList<>();



        System.out.println("===========================");
        for (Car c : carWithCertainColor) {
            System.out.println(ownedCars.get(c));
            for (Car car : ownersOfCarsWithSpecificColor) {
                System.out.println(car.carColour);
            }
        }
        for (var owner : ownedCars.entrySet()) {
            if (owner.getValue().equals("John") || owner.getValue().equals("Alice")){
                ownersOfCarsWithSpecificColor.add(owner.getKey());
            }
            if(ownedCars.values().contains("John")){
                System.out.println(ownedCars.containsValue("John"));
            }
            if(ownedCars.values().contains("Alice")){
                System.out.println(ownedCars.containsValue("Alice"));


            }
        }
        System.out.println("=============");
        for (Car car : ownersOfCarsWithSpecificColor) {
            System.out.println(car.carColour);
        }


    }
    }
