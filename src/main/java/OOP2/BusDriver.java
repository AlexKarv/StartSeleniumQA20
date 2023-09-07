package OOP2;

public class BusDriver extends Driver {
    private String car;

    public BusDriver(String document, String name, int age, String car) {
        super(document, name, age);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("I like to drive very much");
    }
}
