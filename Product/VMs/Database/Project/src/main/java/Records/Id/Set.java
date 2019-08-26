package Records.Id;

public class Set extends Records.IdObject {
    protected String name;

    public Set(String id) {
        super(id);
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
}
