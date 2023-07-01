import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @GetMapping("/empty")
    public ResponseEntity<List<Room>> getAvailableRooms() {
        var response = roomService.getAvailableRooms();
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update/{roomNo}")
    public ResponseEntity<Room> updateRoomAvailabilityByRoomNo(@PathVariable String roomNo) {
        var response = roomService.updateRoomAvailabilityByRoomNo(roomNo);
        return ResponseEntity.ok(response);
    }

}