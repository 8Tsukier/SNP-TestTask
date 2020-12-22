package dto;

public class JoinedEntity {
    private String firstName;
    private String lastName;
    private String departmentName;

    public JoinedEntity(String firstName, String lastName, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + departmentName;
    }
}
