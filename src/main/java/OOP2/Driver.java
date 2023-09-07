package OOP2;

public abstract class Driver {
    private String document;
    private String name;
    private int age;

    public Driver(String document, String name, int age) {
        this.document = document;
        this.name = name;
        this.age = age;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

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

    public abstract void drive ();
    public void stop() {
        System.out.println("I do not like stoping");
            }
}
