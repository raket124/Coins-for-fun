package Factories.Static;

import java.util.List;
import java.util.ArrayList;

public class Set extends Factory<Objects.Set> implements Factories.ISet {

    public Set() {
        this.data = new ArrayList<Objects.Set>() {
            {
                add(new Objects.Set("1", "Church"));
                add(new Objects.Set("2", "Marriage"));
                add(new Objects.Set("3", "Country"));
            }
        };
    }

    public String GetIdFromName(String name) {
        return "";
    }
}
