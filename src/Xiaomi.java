public class Xiaomi extends PhoneBuilder{
    @Override
    void buildName() {
        System.out.println("Xiaomi Note 9");
    }

    @Override
    void buildCountry() {
        System.out.println("China");
    }

    @Override
    void buildCost() {
        System.out.println(200);
    }
}
