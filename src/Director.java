public class Director {
    PhoneBuilder builder;

    public void setBuilder(PhoneBuilder builder) {
        this.builder = builder;
    }

    Phone buildPhone(){
        builder.createPhone();
        builder.buildName();
        builder.buildCountry();
        builder.buildCost();

        Phone phone = builder.getPhone();
        return phone;
    }
}
