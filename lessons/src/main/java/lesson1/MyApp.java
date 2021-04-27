package lesson1;

public class MyApp {


    public static void main(String[] args) {



        // объявляем бегунов
        Cat cat = new Cat();
        Robot robot = new Robot();
        Human human = new Human();



        Jumping[] jumpers = {cat, robot, human};

        // инициализируем препятствия
        Wall wall = new Wall(1);
        Wall wall1 = new Wall(2);
        Truck truck = new Truck(400);
        Truck truck1 = new Truck(700);

        Barrier[] barriers = {wall, truck, wall1, truck1};


        // циклы
        for (Jumping jumper: jumpers) {

            if(jumper instanceof Cat){ // это все, потому что в вашем задании нельзя отнаследоваться =(

                Cat challenger = (Cat)jumper;



                    for (Barrier barrier : barriers) {
                        if (barrier instanceof Wall && challenger.isActive()) {
                            challenger.jump((Wall) barrier);
                        }
                        if (barrier instanceof Truck && challenger.isActive()) {
                            challenger.run((Truck) barrier);
                        }
                    }
            }


            if(jumper instanceof Human){  // КОСТЫЛИ

                Human challenger = (Human )jumper;



                for (Barrier barrier : barriers) {
                    if (barrier instanceof Wall && challenger.isActive()) {
                        challenger.jump((Wall) barrier);
                    }
                    if (barrier instanceof Truck && challenger.isActive()) {
                        challenger.run((Truck) barrier);
                    }
                }
            }



            if(jumper instanceof Robot){ // ЕЩЕ КОСТЫЛИ, ААА

                Robot challenger = (Robot)jumper;



                for (Barrier barrier : barriers) {
                    if (barrier instanceof Wall && challenger.isActive()) {
                        challenger.jump((Wall) barrier);
                    }
                    if (barrier instanceof Truck && challenger.isActive()) {
                        challenger.run((Truck) barrier);
                    }
                }
            }



        }





    }





}


