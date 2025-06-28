package Entity;

public class User {
    public String id;
    public String name;
    public BalanceSheetUser balanceSheet = new BalanceSheetUser();
    public User(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }


}
