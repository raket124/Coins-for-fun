package Data.Sources;

public class Static extends Data.DataSource {

    public Static() {
        this.set = new Factories.Static.Set();
        this.country = new Factories.Static.Country();
    }

}
