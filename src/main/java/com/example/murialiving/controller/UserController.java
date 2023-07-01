import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        var response = userService.getAllUsers();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/verify")
    public ResponseEntity<User> verifyUsernameAndPassword(@RequestBody string Username) {
        var response = userService.findUserByUsername(username)
        return ResponseEntity.ok(response);
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserRequest request) {
        var response = userService.createUser(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/update/{roomNo}")
    public ResponseEntity<User> updateUserByRoomNo(@PathVariable String roomNo, @RequestBody UserRequest request) {
        var response = userService.updateUserByRoomNumber(roomNo, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{roomNo}")
    public ResponseEntity<String> deleteUserByRoomNo(@PathVariable String roomNo) {
        userService.deleteUserByRoomNo(roomNo);
        return ResponseEntity.ok(String.format("Deleted User with room number %s", roomNo));
    }



}