package OOP2;

public class Main {
    public static void main(String[] args) {
        Workers worker = new Workers("Alex", "001", "QA");
        worker.reading();
        worker.writing();

        Ingineers ingineer = new Ingineers("Moosha", "0002", "Developer", "DB");
        ingineer.writing();
        ingineer.reading();

        BusDriver busDriver = new BusDriver("7777","Piter", 28, "MAN");
        busDriver.drive();
        busDriver.stop();


    }





}
