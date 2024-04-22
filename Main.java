package game2people;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Player1 mainPlayer = new Player1("Yevhenii");
        Enemy enemy = new Enemy("Alina");
        Person per = new Person("Per");
        Scanner in = new Scanner(System.in);
        new Random();
        int max = 3;
        int min = 1;
        System.out.println("Вітаю на грі " + mainPlayer.name + " та " + enemy.name);
        System.out.println("У вас є по " + per.health + " життя.");

        while(true) {
            do {
                if (enemy.health == 0 && mainPlayer.health == 0) {
                    System.out.println("End");
                    return;
                }

                if (enemy.health != 0 || mainPlayer.health != 0) {
                    System.out.println(mainPlayer.name + " введіть число від 1 до 3: ");
                }

                mainPlayer.tryToKill(in.nextInt(), enemy);
            } while(enemy.health == 0 && mainPlayer.health == 0);

            System.out.println(enemy.name + " ввведіть число від 1 до 3: ");
            enemy.tryToKill(in.nextInt(), mainPlayer);
        }
    }
}

