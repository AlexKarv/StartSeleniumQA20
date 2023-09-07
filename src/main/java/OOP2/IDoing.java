package OOP2;

public interface IDoing {
    void writing ();

    default void reading() {
        System.out.println("I like reading");
            }

}
