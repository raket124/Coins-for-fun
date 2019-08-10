package Objects;

public class Coin extends IdObject {
    private Country country;
    private Set set;
    private String name;
    private Integer year;

    public Country getCountry() { return this.country; }
    public void setCountry(Country country) { this.country = country; }
    public Set getSet() { return this.set; }
    public void setSet(Set set) { this.set = set; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public Integer getYear() { return this.year; }
    public void setYear(Integer year) { this.year = year; }
}
