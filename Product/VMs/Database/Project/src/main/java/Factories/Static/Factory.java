package Factories.Static;

import java.util.List;
import java.util.ArrayList;

public class Factory<T extends Objects.IdObject> implements Factories.IFactory<T>{

    protected List<T> data;

    public Factory() {
        this.data = new ArrayList<T>();
    }

    public T Spawn(String id) {
        return this.data.stream().
        filter(obj -> obj.CompareId(id)).
        findAny().orElse(null);
    }

    public void Delete(String id) {
        this.data.removeIf(obj -> obj.CompareId(id));
    }

    public List<T> SpawnAll() {
        return this.data;
    }
}
