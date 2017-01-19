package za.co.metalojiq.classfinder.witsconf.model;

/**
 * Created by divine on 1/16/17.
 */

public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Person(String name, int age, String institution) {

        this.name = name;
        this.age = age;
        this.institution = institution;
    }

    private String name;
    private int age;
    private String institution;
}
