package oop;

public class FirstMain {
    public static void main(String[] args) {
        Kitty kitty = new Kitty();
        System.out.println(kitty.jumpHigh());//1
        System.out.println(kitty.voice()); // pii
        System.out.println(kitty.legsQuantity());//4

CatParent catParent = new CatParent();
//        System.out.println(catParent.jumpHigh());//3
//        System.out.println(catParent.voice()); // mamama
//        System.out.println(catParent.legsQuantity());//6


        Animals animals = new Animals() {
            @Override
            public int legsQuantity() {
                return 9;
            }
        };
        System.out.println("-----------");
        System.out.println(animals.voice());

        System.out.println(animals.legsQuantity());

    }
}
