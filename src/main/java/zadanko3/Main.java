package zadanko3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> showRoom = new ArrayList<>();
        initializeShowRoom(showRoom);

        for (Car car : showRoom) {
            if(car.getMake().equals("Ford")) {
                if(car.getDoors() == 3) {
                    if(car.getPower() <= 100) {
                        if(new BigDecimal(30000).compareTo(car.getPrice()) > 0) {
                            System.out.println(car.toString().toUpperCase());
                        }
                    }
                }
            }
        }
        // Przepisz powyzszy kod z wykorzystaniem strumieni.
        showRoom.stream()
                .filter(car -> car.getMake().equals("Ford"))
                .filter(car -> car.getDoors() == 3)
                .filter(car -> car.getPower() <= 100)
                .filter(car -> new BigDecimal(30000)
                .compareTo(car.getPrice()) > 0)
                .map(car -> car.toString().toUpperCase())
                .forEach(System.out::println);
    }


    private static void initializeShowRoom(List<Car> showRoom) {
        Car car1 = new Car("RS6", "Audi", 5, new BigDecimal(125000), 225);
        Car car2 = new Car("Albea", "Fiat", 5, new BigDecimal(10000), 77);
        Car car3 = new Car("Kappa", "Lancia", 5, new BigDecimal(30000), 124);
        Car car4 = new Car("Boxter", "Porshe", 3, new BigDecimal(150000), 315);
        Car car5 = new Car("Kuga", "Ford", 5, new BigDecimal(75000), 180);
        Car car6 = new Car("Focus", "Ford", 5, new BigDecimal(35000), 150);
        Car car7 = new Car("KA", "Ford", 3, new BigDecimal(10000), 75);
        Car car8 = new Car("CLK", "Mercedes-Benz", 3, new BigDecimal(80000), 224);
        Car car9 = new Car("Solaris", "Hyundai", 5, new BigDecimal(45000), 123);
        Car car10 = new Car("XF", "Jaguar", 5, new BigDecimal(140000), 300);
        Car car11 = new Car("Scenic", "Renault", 5, new BigDecimal(65000), 150);

        showRoom.addAll(Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11));

    }
}
