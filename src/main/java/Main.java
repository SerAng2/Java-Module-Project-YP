import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Car[] carArray = new Car[3];
        for (int i = 0; carArray.length > i; i++) {
            System.out.println("Введите название машины №" + (i + 1) + ":");
            String name = scanner.nextLine();
            int speed;
            do {
                System.out.println("Введите скорость машины №" + (i + 1) + ":");
                speed = scanner.nextInt();
                scanner.nextLine();
                if (speed <= 0 || speed > 250) {
                    System.out.println("Неправильная скорость");
                }
            } while (speed <= 0 || speed > 250);
            carArray[i] = new Car(name, speed);
        }
        int maxDistance = 0;
        String leaderName = "";

        for (Car car : carArray) {
            int distance = car.calculateDistance(24);
            if (distance > maxDistance) {
                maxDistance = distance;
                leaderName = car.name;
            }
        }
        System.out.println("Самая быстрая машины: " + leaderName);
    }
}

class Car {
    String name;
    int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int calculateDistance(int hours) {
        return speed * hours;
    }
}

