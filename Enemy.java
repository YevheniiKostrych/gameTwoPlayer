package game2people;

import java.util.Random;

public class Enemy extends Person {
    private Random rand = new Random();
    int max = 3;
    int min = 1;
    int rand_num;

    Enemy(String name) {
        super(name);
        this.rand_num = this.rand.nextInt(this.max - this.min + 1) + this.min;
    }

    void tryToKill(int num, Player1 pl) {
        if (pl.rand_num == num) {
            --pl.health;
            if (pl.health != 0) {
                System.out.println(this.name + ", Ви вгадали тепер у гравця з ім'ям " + pl.name + " залишилось " + pl.health + " життів!");
                pl.rand_num = this.rand.nextInt(pl.max - pl.min + 1) + pl.min;
            } else {
                System.out.println("Вітаю! " + this.name + ", Ви завалили - " + pl.name);
                System.out.println(pl.name + "- ЛОХ");
            }
        } else if (num > pl.rand_num) {
            System.out.println(this.name + ", Ви не вгадали! Число що ви намагаєтесь вгадати МЕНЬШЕ<" + num);
        } else {
            System.out.println(this.name + ", Ви не вгадали! Число що ви намагаєтесь вгадати БІЛЬШЕ>" + num);
        }

    }
}
