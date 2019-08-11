package Objects;

public class Country extends IdObject {
    private String code;
    private String name;

    public Country() { }

    public Country(String id, String code, String name) {
        super(id);
        this.code = code;
        this.name = name;
    }

    public String getCode() { return this.code; }
    public void setCode(String image) { this.code = code; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

}
