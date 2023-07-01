import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public <List> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public User createUser(UserRequest request){
        // TODO: validateUserRequest(request);
        User user = user.builder()
                .roomNo(request.getRoomNo())
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
        return userRepository.save(user);
    }

    @Override
    public User updateUserByRoomNumber(String roomNo, UserRequest request){
        User userUpdated = user.builder()
                .roomNo(roomNo)
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
        return userRepository.save(userUpdated);
    }

    @Override
    public void deleteUserByRoomNo(String roomNo) {
        userRepository.deleteUserByRoomNo(roomNo);
    }

}