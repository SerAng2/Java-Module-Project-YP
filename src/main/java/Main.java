import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.print("Введите название автомобиля " + (i + 1) + ": ");
            String carName = scanner.nextLine();
            int speed;


            while (true) {
                System.out.print("Введите скорость автомобиля (0-250): ");
                speed = scanner.nextInt();

                if (speed >= 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Ошибка: скорость должна быть от 0 до 250. Попробуйте снова.");
                }
            }
            scanner.nextLine();


            cars[i] = new Car(carName, speed);

            race.determineLeader(cars[i]);
        }


        System.out.println("Победитель гонки: " + race.getCurrentLeader());
        scanner.close();
    }

}






