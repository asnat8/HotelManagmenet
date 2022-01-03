public class Room {

    private int roomNumber;
    private String type;
    //If the room is not occupied the status will be true. otherwise it will be false
    private boolean status;

    public Room() {
    }

    public Room(int roomNumber, String type, boolean status) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.status = status;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

//    public boolean equals(Object obj){}
//
//    public String toString(){
//        return "["+this.getRoomNumber()+","+this.getType()+","+(this.getStatus()?"Occupy":"free")+"]";
//    }
}
