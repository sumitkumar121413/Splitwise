package Entity;

import java.util.HashMap;

public class BalanceSheetUser {
    HashMap<Group,Double> mp = new HashMap<>();

    public void addExpense(Group group,double value){
        if(mp.containsKey(group)){
                mp.put(group,mp.get(group)+value);
        }
        else mp.put(group,value);
    }

    public double getExpense(){
        double res = 0;
        for(Group it: mp.keySet()){
                res+= mp.get(it);
        }
        return res;
    }

}
