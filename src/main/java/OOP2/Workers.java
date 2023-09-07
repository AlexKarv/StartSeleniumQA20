package OOP2;

public class Workers implements IDoing {
    private String name;
    private String id;
    private String position;

    public Workers(String name, String id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void writing() {
        System.out.println("I like writing . YRA");
    }


}

