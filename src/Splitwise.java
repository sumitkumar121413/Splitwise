import Controller.ExpenseController;
import Controller.GroupController;
import Controller.UserController;
import Entity.Group;
import Entity.SplitType;
import Entity.User;

import java.util.ArrayList;
import java.util.List;

public class Splitwise {

    public void demo() {

        // Create Users
        User user1 = new User("1","Sumit");
        User user2 = new User("2","Rahul");
        User user3 = new User("3","Ayush");

        // Create UserController
        UserController userController = new UserController();
        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);

        // Group Controller
        GroupController groupController = new GroupController();
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        Group group1 = new Group("1","Group1",userList);
        groupController.addGroup(group1);

        //Expense Controller
        ExpenseController expenseController = new ExpenseController();
        SplitType splitType = SplitType.equal;
        expenseController.addExpense(user1,group1,splitType,300);

        double result = expenseController.getExpense(user1);
        System.out.println(result);
        System.out.println(expenseController.getExpense(user2));
        System.out.println(expenseController.getExpense(user3));


    }
}
