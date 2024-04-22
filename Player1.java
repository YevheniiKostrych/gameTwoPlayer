package game2people;


import java.util.Random;

public class Player1 extends Person {
    private Random rand = new Random();
    int max = 3;
    int min = 1;
    int rand_num;

    Player1(String name) {
        super(name);
        this.rand_num = this.rand.nextInt(this.max - this.min + 1) + this.min;
    }

    void tryToKill(int num, Enemy enemy) {
        if (enemy.rand_num == num) {
            --enemy.health;
            if (enemy.health != 0) {
                System.out.println(this.name + ", Ви вгадали тепер у гравця з ім'ям " + enemy.name + " залишилось " + enemy.health + " життів!");
                enemy.rand_num = this.rand.nextInt(enemy.max - enemy.min + 1) + enemy.min;
            } else {
                System.out.println("Вітаю! " + this.name + ", Ви завалили - " + enemy.name);
                String var10001 = enemy.name;
                System.out.println(var10001 + "- ЛОХ має " + enemy.health);
            }
        } else if (num > enemy.rand_num) {
            System.out.println(this.name + ", Ви не вгадали! Число що ви намагаєтесь вгадати МЕНЬШЕ<" + num);
        } else {
            System.out.println(this.name + ", Ви не вгадали! Число що ви намагаєтесь вгадати БІЛЬШЕ>" + num);
        }

    }
}
