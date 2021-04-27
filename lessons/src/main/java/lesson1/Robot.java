package lesson1;

public class Robot implements Running, Jumping {
    private boolean isActive = true;  // на дистанции ли участник
    private int jumpH = 1;
    private int maxMove = 1000;

    private String name = "Киборг ";

    public Robot(String name) {
        this.name = name;
    }

    public Robot() {
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

    public boolean isActive() {
        return isActive;
    }

}

