package dto;

public class Employer {
    private int id;
    private String firstName;
    private String lastName;
    private int depId;

    public Employer(int id, String firstName, String lastName, int depId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.depId = depId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }
}
