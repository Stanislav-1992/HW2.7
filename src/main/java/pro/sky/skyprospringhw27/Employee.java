package pro.sky.skyprospringhw27;

import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;
    public Employee(String name, String surname) {
        this.firstName = name;
        this.lastName = surname;
    }

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public void setFirstName(String name) { this.firstName = name; }
    public void setLastNamee(String surname) { this.lastName = surname;}

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.firstName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
    }
}