/**
 * Created by VINNI on 02.12.16.
 */
public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Room room1 = new Room(1, 2, 3, "q", "w");
        rooms[0] = room1;
        Room room2 = new Room(4, 5, 6, "e", "r");
        rooms[1] = room2;
        Room room3 = new Room(7, 8 , 9, "t", "y");
        rooms[2] = room3;
        Room room4 = new Room(10, 11, 12, "u", "i");
        rooms[3] = room4;
        Room room5 = new Room(13,14,15, "o", "p");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel)
    {
        return new Room[0];
    }
}