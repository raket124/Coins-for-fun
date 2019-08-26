package Data;

public abstract class DataSource {

    protected Factories.ISet set;
    protected Factories.ICountry country;
    protected Factories.ICoin coin;

    public Factories.ISet getSet() { return this.set; }
    public Factories.ICountry getCountry() { return this.country; }
    public Factories.ICoin getCoin() { return this.coin; }
}
