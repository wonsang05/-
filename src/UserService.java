import java.util.Iterator;
import java.util.List;

public interface UserService {
    //회원 정보 등록
    public void addUser(User user);
    //회원 정보 수정
    public boolean updateUser(User user);
    //회원 정보 삭제
    public boolean deleteUser(String email);
    //모든 회원 정보 반환
    public Iterator<User> getUsers();
    //이메일에 해당하는 회원정보가 있을 경우 0보다 큰 값을 반환
    public boolean exists(String email);
}
