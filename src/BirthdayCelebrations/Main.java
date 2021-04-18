package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        List<Birthable> birthables = new ArrayList<>();
        while (!tokens[0].equals("End")){
            switch (tokens[0]){
                case "Citizen":
                    birthables.add(new Citizen(tokens[1],
                            Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
                case "Pet":
                    birthables.add(new Pet(tokens[1], tokens[2]));
            }
            tokens = scanner.nextLine().split(" ");
        }

        String date = scanner.nextLine();
        for (Birthable birthable : birthables) {
            if (birthable.getBirthDate().contains(date)){
                System.out.println(birthable.getBirthDate());
            }
        }
    }
}
