import org.springframework.stereotype.Service;

@Service
public interface UserService {
    <List> getAllUsers();
    User findUserByUsername(String username);
    User createUser(UserRequest request);
    User updateUserByRoomNumber(String roomNo, UserRequest request);
    void deleteUserByRoomNo(String roomNo);
}
