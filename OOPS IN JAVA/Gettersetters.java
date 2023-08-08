class Account {
    public String name;
    protected String mailid;
    private String password;

    public String getpass() {
        return this.password;
    }

    public void setPass(String pass) {
        this.password = pass;
    }
}

public class Gettersetters {
    public static void main(String[] args) {
        Account a = new Account();
        a.name = "Madhan";
        a.mailid = "Madhan@gmail.com";
        a.setPass("abcd");
        System.out.println(a.getpass());
    }
}
