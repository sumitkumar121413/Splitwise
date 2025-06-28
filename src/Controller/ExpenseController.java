package Controller;

import Entity.Group;
import Entity.SplitType;
import Entity.User;

import java.util.Objects;

public class ExpenseController {
    public void addExpense(User payer, Group group, SplitType splitType, int amount) {
        int groupSize = group.groupUsers.size();
        double perShare = ((double) amount/groupSize);
        double payerAmount = amount - perShare;

        if (Objects.requireNonNull(splitType) == SplitType.equal) {
            for (User u : group.groupUsers)
                if (u == payer) {
                    u.balanceSheet.addExpense(group, payerAmount);
                } else u.balanceSheet.addExpense(group, -1 * perShare);
        }
    }


    public double getExpense(User user1) {
        return user1.balanceSheet.getExpense();
    }
}
