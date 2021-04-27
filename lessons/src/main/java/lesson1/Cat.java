package lesson1;

public class Cat implements Running, Jumping {
    private boolean isActive = true;  // на дистанции ли участник

    private int jumpH = 4;
    private int maxMove = 50;
    private String name = "Дворовый кот ";

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
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
