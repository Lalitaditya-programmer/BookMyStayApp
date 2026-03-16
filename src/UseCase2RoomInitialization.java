public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization");

        SingleRoom single = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        System.out.println("\nSingle Room:");
        single.displayRoomDetails();
        System.out.println("Available: 5");

        System.out.println("\nDouble Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: 3");

        System.out.println("\nSuite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: 2");

    }
}