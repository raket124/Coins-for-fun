package Factories;

import java.util.List;

public interface IFactory<T extends Objects.IdObject> {
    public T Spawn(String id);
    public void Delete(String id);
    public List<T> SpawnAll();
}
