package oop;

public class CatParent implements Animals
{


    @Override
    public int legsQuantity() {
        return 6;
    }

    @Override
    public String voice() {
        return "mamama";
    }
    public int jumpHigh () {
        return 3;
    }
}
