package Records.Objects;

public class Coin extends Records.Id.Coin {
    protected Country country;
    protected Set set;

    public Coin(String id, String countryId, String setId, String name, Integer year) {
         super(id);
         this.countryId = countryId;
         this.setId = setId;
         this.name = name;
         this.year = year;
    }

    public Country getCountry() {
        if(this.country == null) {
            this.country = Data.Singleton.DataSource().getCountry().Spawn(this.countryId);
        }
        return this.country;
    }
    public void setCountry(Country country) {
        this.countryId = country.getId();
        this.country = country;
    }
    public Set getSet() {
        if(this.set == null) {
            this.set = Data.Singleton.DataSource().getSet().Spawn(this.setId);
        }
        return this.set;
    }
    public void setSet(Set set) {
        this.setId = set.getId();
        this.set = set;
    }
}
