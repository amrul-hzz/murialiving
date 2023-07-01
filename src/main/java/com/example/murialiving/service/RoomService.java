import org.springframework.stereotype.Service;

@Service
public interface RoomService {
    List<Room> getEmptyRooms();
    Room updateRoomAvailabilityByRoomNo(String roomNo);
    char getFloorByRoomNo(String roomNo)
}
