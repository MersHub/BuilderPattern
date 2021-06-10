public class Phone {

   private String name;
   private Country country;
   private int cost;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name ='" + name + '\'' +
                ", country =" + country +
                ", cost =" + cost +
                '}';
    }
}
