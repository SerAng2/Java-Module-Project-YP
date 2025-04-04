public class Race {
    private String currentLeader = "";
    private int leaderDistance = 0;

    public void determineLeader(Car car) {

        int distance = 24 * car.getSpeed();

        if (distance > leaderDistance) {
            currentLeader = car.getName();
            leaderDistance = distance;
            System.out.println("Новый лидер: " + currentLeader + " с дистанцией " + leaderDistance + " км.");
        } else {
            System.out.println(car.getName() + " не стал лидером.");
        }
    }

    public String getCurrentLeader() {
        return currentLeader;
    }
}
