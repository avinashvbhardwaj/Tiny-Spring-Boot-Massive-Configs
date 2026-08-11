package curiouscoder.model;

import java.util.List;

public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String lang;

    private List<String> systems;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<String> getSystems() {
        return systems;
    }

    public void setSystems(List<String> system) {
        this.systems = system;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", lang='" + lang + '\'' +
                ", system='" + systems + '\'' +
                '}';
    }
}
