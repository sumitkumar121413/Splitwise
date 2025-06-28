package Controller;

import Entity.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList = new ArrayList<>();
    public void addGroup(Group group) {
        groupList.add(group);
    }
}
