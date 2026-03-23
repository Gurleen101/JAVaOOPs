class Account{
    String email;
    protected String name;
    private String password;
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
public class access {
    public static void main(String [] args){
        Account account1= new Account();
        account1.setPassword("abcd");
    }
}
