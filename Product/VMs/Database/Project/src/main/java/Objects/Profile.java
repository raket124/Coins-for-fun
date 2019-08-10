package Objects;

import java.util.Date;

public class Profile extends IdObject {
    // public Account Account;
    // public Person Person;
    private Date dateOfCreation;

    public Date getDateOfCreation() { return this.dateOfCreation; }
    public void setDateOfCreation(Date dateOfCreation) { this.dateOfCreation = dateOfCreation; }
}
