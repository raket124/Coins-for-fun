package Records.Id;

public class Coin extends Records.IdObject {
    protected String countryId;
    protected String setId;
    protected String name;
    protected Integer year;

    public Coin(String id) {
        super(id);
    }

    protected String getCountryId() { return this.countryId; }
    protected void setCountryId(String countryId) { this.countryId = countryId; }
    protected String getSetId() { return this.setId; }
    protected void setSetId(String setId) { this.setId = setId; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public Integer getYear() { return this.year; }
    public void setYear(Integer year) { this.year = year; }
}
