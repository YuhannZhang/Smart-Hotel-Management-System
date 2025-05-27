public class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private int capacity;
    private RoomStatus status;

    public Room() {

    }

    public Room(int roomNumber, String type, double pricePerNight, int capacity) {
        this.roomNumber = roomNumber;
        this.type= type;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
    }

    public enum RoomStatus {
        AVAILABLE,
        UNDER_REPAIR,
        OCCUPIED,
        NEEDS_CLEANING
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public boolean isAvailable() {
        return status == RoomStatus.AVAILABLE;
    }

    public void markAsAvailable() {
        status = RoomStatus.AVAILABLE;
    }

    public void markUnderRepair() {
        status = RoomStatus.UNDER_REPAIR;
    }

    public void markOccupied() {
        status = RoomStatus.OCCUPIED;
    }

    public void markNeedsCleaning() {
        status = RoomStatus.NEEDS_CLEANING;
    }

    @Override
    public String toString() {
        System.out.println("Room " + roomNumber + " (Type: " + type + " Capacity: " + capacity + ") ");
        System.out.println("Price per night: $" + pricePerNight + " ( " + status + " )");
    }
}
