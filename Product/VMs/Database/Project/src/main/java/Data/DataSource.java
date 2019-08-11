package Data;

public abstract class DataSource {

    protected Factories.ISet set;
    protected Factories.ICountry country;

    public Factories.ISet getSet() { return this.set; }
    public Factories.ICountry getCountry() { return this.country; }
}
