
public class Hotel{

    private Room[][] rooms;

    public Hotel() {
        //let's say there is 120 rooms in the hotel
        //there is 4 floors and 30 rooms in each floor
        rooms = new Room[4][30];
        for(int i=0; i < rooms.length; i++){
            for(int j=0; j < rooms[i].length; j++){
                if(i == 0)
                    rooms[i][j] = new Room((i+1)*100 + j+1, "FirstFloorRoom", true);
                if(i == 1)
                    rooms[i][j] = new Room((i+1)*100 + j+1, "SecondFloorRoom", true);
                if(i == 2)
                    rooms[i][j] = new Room((i+1)*100 + j+1, "ThirdFloorRoom", true);
                if(i == 3)
                    rooms[i][j] = new Room((i+1)*100 + j+1, "ForthFloorRoom", true);
            }
        }
    }

    public void bookRoom(int roomNumber){
        //all we need to do is to change the room status
        int floor = roomNumber/100 - 1;
        int roomInFloor = roomNumber%100 - 1;
        if(rooms[floor][roomInFloor].getStatus() == false)
            System.out.println("This room is already occupied. Please enter another room number");
        else{
            Room room = rooms[floor][roomInFloor];
            room.setStatus(false);
            System.out.println("Room number " + room.getRoomNumber() + " has booked successfully");
        }
    }

    public void checkOut(int roomNumber){
        int floor = roomNumber/100 - 1;
        int roomInFloor = roomNumber%100 - 1;
        Room room = rooms[floor][roomInFloor];
        room.setStatus(true);
        System.out.println("Room number " + room.getRoomNumber() + " has been checked out successfully");
    }

    public  void print(){
        for (int i = 0; i < rooms.length ; i++) {
            for (int j = 0; j < rooms[i].length ; j++) {
                Room room=  rooms[i][j];
                System.out.println("room number " + room.getRoomNumber() + " of type " + room.getType() + " his status is: (true for not occupied) " + room.getStatus());
            }
        }
    }
}
