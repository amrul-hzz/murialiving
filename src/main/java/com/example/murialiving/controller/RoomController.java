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
    public ResponseEntity<List<Room>> getEmptyRooms() {
        var response = roomService.getEmptyRooms();
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update/{roomNo}")
    public ResponseEntity<User> updateRoomAvailabilityByRoomNumber(@PathVariable String roomNo) {
        var response = roomService.updateRoomAvailabilityByRoomNumber(roomNo);
        return ResponseEntity.ok(response);
    }

}