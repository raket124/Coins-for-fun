package Records.Id;

public class Country extends Records.IdObject {
    protected String code;
    protected String name;

    public Country(String id) {
        super(id);
    }

    public String getCode() { return this.code; }
    public void setCode(String image) { this.code = code; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

}
