package Data;

public class User implements IUser {
    private String firstName;
    private String lastName;

    public User(){
        firstName = "foo";
        lastName = "bar";
    }

    public String GetFirstName(){
        return this.firstName;
    }
    public void SetFirstName(String firstName){
        this.firstName = firstName;
    }
    public String GetLastName(){
        return this.lastName;
    }
    public void SetLastName(String lastName){
        this.lastName = lastName;
    }
}
