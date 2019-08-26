package Records.Objects;

public class Country extends Records.Id.Country {

    public Country(String id, String code, String name) {
        super(id);
        this.code = code;
        this.name = name;
    }
}
