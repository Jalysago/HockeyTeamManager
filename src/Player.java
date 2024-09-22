import java.util.ArrayList;

public class Player extends Person{

    public  Player(String name, int age, Position position, int jerseyNumber, int iceTime) {
        setName(name);
        setAge(age);
        this.player_position = position;
        this.jersey_number = jerseyNumber;
        this.ice_time = iceTime;
    }

    private final Position player_position;
    private final int jersey_number;
    private final  int ice_time;
    @Override
    public void show() {
        super.show();

        System.out.println(" Jersey Number: " + jersey_number);
        System.out.println(" Position: " + player_position);
        System.out.println(" Ice Time: " + ice_time + " minutes.");
        System.out.println("======================================");
    }

    @Override
    public int getJerseyNumber() {
        return jersey_number;
    }

}
