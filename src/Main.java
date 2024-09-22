import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();


        //Team name
        System.out.println("Enter Team Name: ");
        String teamName = scanner.nextLine();
        System.out.println( "Team Name: "+teamName);


        boolean keepGoing = true;

        while(keepGoing) {
            String options = "Choose an option: 1. Add Player 2. Add Coach 3. View Team 4. Remove Member 5. Exit";
            System.out.println(options);

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        try {
                            System.out.println("enter name: ");
                            String playerName = scanner.nextLine();


                            System.out.println("Enter age: ");
                            int playerAge = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Enter jersey Number: ");
                            int jerseyNum = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Enter position, the options are  Center, Goalie, Right Wing, Left Wing, Defense, Forward: ");
                            String positionChoice = scanner.nextLine().toUpperCase();
                            Position playerPosition = null;

                            switch (positionChoice) {
                                case "FORWARD":
                                    playerPosition = Position.FORWARD;
                                    break;
                                case "CENTER":
                                    playerPosition = Position.CENTER;
                                    break;
                                case "GOALIE":
                                    playerPosition = Position.GOALIE;
                                    break;
                                case "RIGHT WING":
                                    playerPosition = Position.RIGHT_WING;
                                    break;
                                case "LEFT WING":
                                    playerPosition = Position.LEFT_WING;
                                    break;
                                case "DEFENSE":
                                    playerPosition = Position.DEFENSE;
                                    break;
                                default:
                                    System.out.println("Invalid position.");
                                    continue;
                            }


                            System.out.println("Enter ice time: ");
                            int iceTime = scanner.nextInt();
                            scanner.nextLine();

                            Player player = new Player(playerName, playerAge, playerPosition, jerseyNum, iceTime);
                            team.addTeamMember(player);

                            System.out.println("Team player added");
                        } catch (InputMismatchException e) {
                            System.out.println("One or more fields are invalid. Please enter correct data types.");
                            scanner.nextLine();
                        }
                        break;

                    case 2:
                        try {
                            System.out.println("Enter Coach name: ");
                            String coachName = scanner.nextLine();

                            System.out.println("Enter age: ");
                            int coachAge = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Enter Role: ");
                            String coachRole = scanner.nextLine();
                            Coach coach = new Coach(coachName, coachAge, coachRole);
                            team.addTeamMember(coach);

                            System.out.println("Coach added");
                        } catch (InputMismatchException e) {
                            System.out.println("One or more fields are invalid. Please enter correct data types.");
                            scanner.nextLine();
                        }
                        break;

                    case 3:
                        team.ShowTeamMembers();
                        break;

                    case 4:
                        try {
                            System.out.println("Enter the jersey number of the player you wish to remove: ");
                            int removePlayer = scanner.nextInt();
                            team.removeTeamMember(removePlayer);
                            System.out.println("team member with jersey number " + removePlayer + " removed.");
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter a valid jersey Number.");
                            scanner.nextLine();
                        }
                        break;
                    case 5:
                        keepGoing = false;
                        break;

                    default:
                        System.out.println("Please choose a valid option.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number between 1 and 5.");
                scanner.nextLine();
            }
        }
    }
}
