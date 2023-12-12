public class Elevator {
    int currentFloor = 0;
    int minFloor;
    int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
        }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor || floor == 0) {
            System.out.println("Извините, такого этажа нет");
        } else if (floor == currentFloor) {
            System.out.println("Указан текущий этаж");
        } else if (floor < currentFloor) {
            while (true) {
                moveDown();
                if (currentFloor != 0) {
                    System.out.println(currentFloor + " этаж");
                }
                if (floor == currentFloor) {
                    break;
                }
            }
        }
        else if (floor > currentFloor) {
            while (true) {
                moveUp();
                if (currentFloor != 0) {
                    System.out.println(currentFloor + " этаж");
                }
                if (floor == currentFloor) {
                    break;
                }
            }
        }
    }
}







