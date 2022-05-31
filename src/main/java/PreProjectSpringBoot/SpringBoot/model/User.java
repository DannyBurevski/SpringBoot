package PreProjectSpringBoot.SpringBoot.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Gender gender;
    @Column
    private String sport;
    @Column
    private int salary;

    public User() {
    }

    public User(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public User(String firstName, String lastName, Gender gender, String sport, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.sport = sport;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getFirstName() + " " + this.getLastName() + " " + this.getGender()
                + " " + this.getSport() + " " + this.getSalary();
    }
}
