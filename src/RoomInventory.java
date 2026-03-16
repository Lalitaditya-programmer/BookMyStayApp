import java.util.HashMap;
import java.util.Map;

/**
 * ======================================================
 * CLASS – RoomInventory
 * ======================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class acts as the single source of truth
 * for room availability in the hotel.
 */

public class RoomInventory {

    /* Stores available room count for each room type */
    private Map<String, Integer> roomAvailability;

    /* Constructor */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /* Initialize inventory values */
    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    /* Returns availability map */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /* Update availability */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}
