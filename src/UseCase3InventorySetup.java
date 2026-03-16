/**
 * ======================================================
 * MAIN CLASS – UseCase3InventorySetup
 * ======================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Room Inventory Status\n");

        RoomInventory inventory = new RoomInventory();

        SingleRoom single = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Single"));

        System.out.println("\nDouble Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Double"));

        System.out.println("\nSuite Room:");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Suite"));
    }
}