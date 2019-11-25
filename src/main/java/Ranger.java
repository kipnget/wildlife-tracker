import java.util.List;
import org.sql2o.*;


public class Ranger implements DatabaseManagement {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private int badge;
    private long phone;

    public Ranger(String userName, String firstName, String lastName, int badge, long phone) {
        if (DatabaseManagement.nameValidation(userName)) {
            this.userName = userName;
        }
        if (DatabaseManagement.nameValidation(firstName)) {
            this.firstName = firstName;
        }
        if (DatabaseManagement.nameValidation(lastName)) {
            this.lastName = lastName;
        }
        this.badge = badge;
        this.phone = phone;
    }

    public int getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        if (DatabaseManagement.nameValidation(userName)) {
            this.userName = userName;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (DatabaseManagement.nameValidation(firstName)) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (DatabaseManagement.nameValidation(lastName)) {
            this.lastName = lastName;
        }
    }

    public int getBadge() {
        return this.badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}