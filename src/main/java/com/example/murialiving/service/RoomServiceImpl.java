import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements Room Service {
    private final RoomRepository roomRepository;

    List<Room> getEmptyRooms() {
        return roomRepository.getEmptyRooms();
    }
    Room updateRoomAvailabilityByRoomNo(String roomNo) {
        Room roomUpdated = roomRepository.getRoomByRoomNo(roomNo);
        roomUpdated = Room.builder()
                .roomNo(roomNo)
                .available(roomUpdated.getAvailability() ^ 1)
                .build();
        return roomRepository.save(roomUpdated);
    }

}