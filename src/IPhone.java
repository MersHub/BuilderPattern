public class IPhone extends PhoneBuilder{
    @Override
    void buildName() {
        System.out.println("IPhone X");
    }

    @Override
    void buildCountry() {
        System.out.println("USA");
    }

    @Override
    void buildCost() {
        System.out.println(1000);
    }
}
