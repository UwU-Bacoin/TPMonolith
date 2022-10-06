package tp1;

import java.util.Scanner;

public class ExoC1 {
    public static void main(String[] args) {
        int matches = 17;
        int take;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrez votre nom:");
        String name = scanner.nextLine();


        Player player1 = new Player(name);
        Player player2 = new Player("Jane");

        while (true) {
            System.out.println("Il reste " + matches + " allumettes");
            System.out.println(player1.getName() + " combien d'allumettes prenez-vous ?");
            take = scanner.nextInt();
            matches -= take;
            if (matches <= 0) {
                System.out.println(player1.getName() + " wins!");
                break;
            }
            matches = player2.play(matches);
            if (matches <= 0) {
                System.out.println(player2.getName() + " wins!");
                break;
            }
        }

    }
}

class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int play(int matches) {
        int take = Math.min(matches, 3);
        System.out.println(name + " takes " + take + " matches");
        return matches - take;
    }
}