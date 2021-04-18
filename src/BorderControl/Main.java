package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] tokens = scanner.nextLine().split(" ");

        List<Citizen> citizens = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        while (!tokens[0].equals("End")){
            if (tokens.length == 3){
                citizens.add(new Citizen(tokens[0],
                        Integer.parseInt(tokens[1]), tokens[2]));
            }else {
                robots.add(new Robot(tokens[0], tokens[1]));
            }
            tokens = scanner.nextLine().split(" ");
        }
        String blockId = scanner.nextLine();
        for (Citizen citizen : citizens) {
            if (citizen.getId().contains(blockId)){
                System.out.println(citizen.getId());
            }
        }
        for (Robot robot : robots) {
            if (robot.getId().contains(blockId)){
                System.out.println(robot.getId());
            }
        }
    }
}
