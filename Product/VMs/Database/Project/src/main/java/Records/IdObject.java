package Records;

public class IdObject {
    private String id;

    public IdObject() { }

    public IdObject(String id) {
        this.setId(id);
    }

    public String getId() { return this.id; }
    public void setId(String id)
    {
        this.id = this.PadId(id);
    }

    public boolean CompareId(String id) {
        return this.id.equals(this.PadId(id));
    }

    private String PadId(String id) {
        int validId = Integer.parseInt(id);
        return String.format("%09d" , validId);
    }
}
