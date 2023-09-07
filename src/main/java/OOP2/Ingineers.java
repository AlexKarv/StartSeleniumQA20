package OOP2;

import java.sql.SQLOutput;

public class Ingineers extends Workers{
    private String department;

    public Ingineers(String name, String id, String position, String department) {
        super(name, id, position);
        this.department = department;
    }

    @Override
    public void reading() {
        System.out.println("I am a best in reading");
    }

    @Override
    public void writing() {
        System.out.println("I am a best writer");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
