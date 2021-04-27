package lesson1;

public class Human implements Running, Jumping {
    private boolean isActive = true;  // на дистанции ли участник
    private int jumpH = 2;
    private int maxMove = 500;
    private String name = "Василий";

    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    public boolean isActive() {
        return isActive;
    }


    @Override
    public void run(Truck truck) {

        if (maxMove>= truck.getDistance()) {
            System.out.println(name + " пробегает дистанцию " + truck.getDistance());
        } else{
            System.out.println(name + " не смог пробежать " + truck.getDistance() + " и сходит с дистанции.");
            isActive = false;
        }

    }


    @Override
    public void jump(Wall wall) {

        if (jumpH>= wall.getHigh()) {
            System.out.println(name + " Перепрыгивает стену, высотой " + wall.getHigh());

        }else{
            System.out.println(name + " не смог перепрыгнуть стену, высотой " + wall.getHigh() + ", и сходит с дистанции.");
            isActive = false;
        }
    }
}





