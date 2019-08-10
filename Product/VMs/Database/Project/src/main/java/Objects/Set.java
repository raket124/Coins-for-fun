package Objects;

public class Set extends IdObject {
    private String name;

    public Set() { }

    public Set(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
}
