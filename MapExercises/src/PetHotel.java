import java.util.*;

public class PetHotel
{
    //instance level

    private TreeMap<Integer, String> rooms;
    private Scanner in = new Scanner(System.in);


    private PetHotel()
    {
        rooms = new TreeMap<>();
    }

    private void run()
    {
        String command;
        do {
            System.out.println("Enter Command(CheckIn<petName><roomNumber>, " +
                    "CheckOut<roomNumber>," +
                    "Move<fromRoomNumber><toRoomNumber>, " +
                    "Occupancy, CloseForSeason, Exit");

            String inputLine = in.nextLine();
            String[] words = inputLine.split(" ");

            command = words[0]; //sets command as first word counted in []


            if (command.equalsIgnoreCase("CheckIn")) {
                String name = words[1];
                int roomNumber = Integer.parseInt(words[2]);

                if(isValidRoomNumber(roomNumber))
                {
                    if(isRoomEmpty(roomNumber))
                    {
                        checkIn(name, roomNumber);
                    }
                    else
                    {
                        System.out.println("Room occupied. Select another room.");
                    }
                }

            }
            else if (command.equalsIgnoreCase("CheckOut")) {
                 int roomNumber = Integer.parseInt(words[1]);

                checkOut(roomNumber);

            }
            else if (command.equalsIgnoreCase("Move"))
            {
                int fromRoom = Integer.parseInt(words[1]);
                int toRoom = Integer.parseInt(words[2]);

                if (isRoomOccupied(fromRoom))
                {
                    if (isRoomEmpty(toRoom))
                    {
                        move(fromRoom, toRoom);

                    }
                    else
                    {
                        System.out.println("That room is currently occupied. Please select another room.");

                    }
                }

                else
                {
                    errorMessage();
                }
            }
            else if (command.equalsIgnoreCase("Occupancy"))
            {

                occupancy();
            }
            else if (command.equalsIgnoreCase("CloseForSeason"))
            {
                closeForSeason();
            }
        }
        while (!command.equalsIgnoreCase("Exit"));
        {
            System.out.println("Goodbye");
        }

    }

    private boolean isRoomOccupied(int roomNumber)
    {
        boolean occupied = false;

        if (rooms.containsKey(roomNumber))
        {
            occupied = true;
        }
        return occupied;
    }

    private boolean isRoomEmpty(int roomNumber)
    {
        boolean empty = true;

        if(rooms.containsKey(roomNumber))
        {
            empty = false;
        }

        return empty;
    }
    private boolean isValidRoomNumber(int roomNumber)
    {
        if(roomNumber >= 100 && roomNumber <= 109)
        {
            return true;
        }
        else
        {
            System.out.println(roomNumber + " is not a valid room number. Please try again.");
        }
        return false;
    }
    private void checkIn(String name, int roomNumber)
    {
        rooms.put(roomNumber, name);
        System.out.println(name + " checked into room " + roomNumber);
        System.out.println(rooms);

    }

    private void checkOut(int roomNumber)
    {

        String name = rooms.remove(roomNumber);

        if(!isRoomEmpty(roomNumber))
        {
            errorMessage();
        }
        else
        {
        System.out.println(name + " checked out.");

        }


        System.out.println(rooms);


    }

    private void move(int fromRoom, int toRoom)
    {
        String name = rooms.remove(fromRoom);
        rooms.put(toRoom, name);

        System.out.println(name + " moved from " + fromRoom + " to room " + toRoom);
        System.out.println(rooms);

    }


    private void occupancy()
    {
        Set<Map.Entry<Integer, String>> occupancyList = rooms.entrySet();

        System.out.println(occupancyList);
    }

    private void closeForSeason()
    {
        rooms.clear();
        System.out.println(rooms);
    }
    private void errorMessage()
    {
        System.out.println("Invalid entry. Try again.");
    }

    public static void main(String[] args)
    {
        PetHotel petHotel = new PetHotel();
        petHotel.run();
    }
}
