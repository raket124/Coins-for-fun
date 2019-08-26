package Factories.Static;

import java.util.List;
import java.util.ArrayList;

public class Set extends Factory<Records.Objects.Set> implements Factories.ISet {

    public Set() {
        this.data = new ArrayList<Records.Objects.Set>() {
            {
                add(new Records.Objects.Set("1", "Church"));
                add(new Records.Objects.Set("2", "Marriage"));
                add(new Records.Objects.Set("3", "Country"));
            }
        };
    }

    public String GetIdFromName(String name) {
        return "";
    }
}
