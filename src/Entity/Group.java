package Entity;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public String groupId;
    public String groupName;
    public List<User> groupUsers = new ArrayList<>();

    public Group(String number, String groupName, List<User> userList) {
        this.groupId = number;
        this.groupName = groupName;
        this.groupUsers = userList;
    }
}
