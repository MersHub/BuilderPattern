public abstract class PhoneBuilder {
    Phone phone;

    void createPhone(){
        phone = new Phone();
    }

    abstract void buildName();

    abstract void buildCountry();

    abstract void buildCost();

    Phone getPhone(){
        return phone;
    }
}
